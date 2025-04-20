package bakeshopsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

public class OrderDatabase {
    private static final String url = "jdbc:mysql://localhost:3306/bakeshopsystem";
    private static final String user = "root";
    private static final String password = "";
    private Connection con;
    
    
    public Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }

    public int getLatestOrderIDFromDatabase() {
        int latestOrderID = 0;
        try {
            Connection conn = getConnection();
            String query = "SELECT MAX(OrderID) FROM orders"; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                latestOrderID = rs.getInt(1); 
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return latestOrderID;
    }
     public String getOrderStatus(String OrderID) {
        String status = "";
        try {
            Connection conn = getConnection();
            String query = "SELECT OrderStatus FROM orders WHERE OrderID = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, OrderID);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                status = rs.getString("OrderStatus");  
            } else {
                status = "No order found for this ProductID.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            status = "Error retrieving order status.";
        }
        return status;
    }


    public void saveOrderDetails(int orderID, String orderDate, String paymentMethod, String mode, DefaultTableModel model) {
    String query = "INSERT INTO orders (OrderID, OrderDate, ProductID, ProductName, Quantity, Price, TotalPrice, Mode, PaymentMethod, OrderStatus) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        for (int i = 0; i < model.getRowCount(); i++) {
            int productID = Integer.parseInt(model.getValueAt(i, 0).toString());  
            String productName = model.getValueAt(i, 1).toString(); 
            int quantity = Integer.parseInt(model.getValueAt(i, 2).toString()); 
            double price = Double.parseDouble(model.getValueAt(i, 3).toString()); 
            double totalPrice = Double.parseDouble(model.getValueAt(i, 4).toString()); 

            stmt.setInt(1, orderID); 
            stmt.setString(2, orderDate);
            stmt.setInt(3, productID);              
            stmt.setString(4, productName);     
            stmt.setInt(5, quantity);               
            stmt.setDouble(6, price);               
            stmt.setDouble(7, totalPrice);         
            stmt.setString(8, mode);               
            stmt.setString(9, paymentMethod);       
            stmt.setString(10, "Pending");          

            stmt.executeUpdate();  
        }

        JOptionPane.showMessageDialog(null, "Order details saved successfully!");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Order Unsuccessful: " + e.getMessage());
    }
}

    public void loadOrdersToTable(JTable OrderTable) {
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        model.setRowCount(0);

        String query = "SELECT OrderID, OrderDate, ProductID, ProductName, Quantity, Price, TotalPrice, Mode, PaymentMethod, OrderStatus FROM orders";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("OrderID"),
                    rs.getDate("OrderDate"),
                    rs.getString("ProductID"),
                    rs.getString("ProductName"),
                    rs.getInt("Quantity"),
                    rs.getDouble("Price"),
                    rs.getDouble("TotalPrice"),
                    rs.getString("Mode"),
                    rs.getString("PaymentMethod"),
                    rs.getString("OrderStatus")
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading orders: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   public void approveOrderAndReduceStock(int orderId, int productId) {
    String checkStatusQuery = "SELECT OrderStatus, ProductID, Quantity FROM orders WHERE OrderID = ? AND ProductID = ?";
    String updateQuery = "UPDATE orders SET OrderStatus = 'Approved' WHERE OrderID = ? AND ProductID = ?";
    String updateStockQuery = "UPDATE products SET StocksperBox = StocksperBox - ? WHERE ProductID = ?";
    String cancelOrderQuery = "UPDATE orders SET OrderStatus = 'Cancelled' WHERE OrderID = ? AND ProductID = ?";
    String checkStockQuery = "SELECT StocksperBox FROM products WHERE ProductID = ?";

    try (Connection conn = getConnection();
         PreparedStatement checkPst = conn.prepareStatement(checkStatusQuery)) {

        checkPst.setInt(1, orderId);
        checkPst.setInt(2, productId);  
        ResultSet rs = checkPst.executeQuery();

        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");

            if ("Cancelled".equalsIgnoreCase(orderStatus)) {
                JOptionPane.showMessageDialog(null, 
                        "Order " + orderId + " with ProductID " + productId + " is already cancelled and cannot be approved.");
                return;
            }

            int orderQuantity = rs.getInt("Quantity");

            try (PreparedStatement checkStockPst = conn.prepareStatement(checkStockQuery)) {
                checkStockPst.setInt(1, productId);
                ResultSet stockRs = checkStockPst.executeQuery();

                if (stockRs.next()) {
                    int availableStock = stockRs.getInt("StocksperBox");

                    if (orderQuantity > availableStock) {
                        JOptionPane.showMessageDialog(null, 
                                "Low stock! Available stock: " + availableStock + ". Cannot approve order " + orderId + " for ProductID " + productId);
                        
                        try (PreparedStatement cancelPst = conn.prepareStatement(cancelOrderQuery)) {
                            cancelPst.setInt(1, orderId);
                            cancelPst.setInt(2, productId);
                            int rowsCancelled = cancelPst.executeUpdate();

                            if (rowsCancelled > 0) {
                                JOptionPane.showMessageDialog(null, 
                                        "Order " + orderId + " with ProductID " + productId + " has been cancelled due to low stock.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Order ID and ProductID combination not found.");
                            }
                        }
                        return; 
                    } else {
                        try (PreparedStatement updateStockPst = conn.prepareStatement(updateStockQuery)) {
                            updateStockPst.setInt(1, orderQuantity);  
                            updateStockPst.setInt(2, productId);
                            int stockRowsAffected = updateStockPst.executeUpdate();

                            if (stockRowsAffected > 0) {
                                try (PreparedStatement updatePst = conn.prepareStatement(updateQuery)) {
                                    updatePst.setInt(1, orderId);
                                    updatePst.setInt(2, productId);  
                                    int rowsAffected = updatePst.executeUpdate();

                                    if (rowsAffected > 0) {
                                        JOptionPane.showMessageDialog(null, "Order " + orderId + " with ProductID " + productId + " has been approved and stock has been updated.");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "OrderID and ProductID combination not found.");
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Stock update failed. Please check product availability.");
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Product not found.");
                    return;
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error checking stock: " + ex.getMessage());
                return;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Order ID and ProductID combination not found.");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}


}