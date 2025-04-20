package bakeshopsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PreOrderDatabase {
    private static final String url = "jdbc:mysql://localhost:3306/bakeshopsystem"; 
    private static final String user = "root"; 
    private static final String password = "";
    private Connection con;
    
     // Method to get the connection
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
   
        public int getLatestPreOrderIDFromDatabase() {
         int latestpreOrderID = 0;
         try {
          
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakeshopsystem", "root", "");
             String query = "SELECT MAX(PreOrderID) FROM preorders"; 
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);

             if (rs.next()) {
                 latestpreOrderID = rs.getInt(1); 
             }
             conn.close();
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return latestpreOrderID;
     }

     public void savePreOrderDetails(int PreorderID, String PreorderDate, String PickUpDate, String CustomerName, String PhoneNumber, String paymentMethod, String mode, DefaultTableModel model) {
    String query = "INSERT INTO preorders (PreOrderID, PreOrderDate, PickUpDate, CustomerName, PhoneNumber, ProductID, ProductName, Quantity, Price, TotalPrice, Mode, PaymentMethod, OrderStatus) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        for (int i = 0; i < model.getRowCount(); i++) {
            int productID = Integer.parseInt(model.getValueAt(i, 0).toString());  
            String productName = model.getValueAt(i, 1).toString(); 
            int quantity = Integer.parseInt(model.getValueAt(i, 2).toString()); 
            double price = Double.parseDouble(model.getValueAt(i, 3).toString()); 
            double totalPrice = Double.parseDouble(model.getValueAt(i, 4).toString()); 

            stmt.setInt(1, PreorderID); 
            stmt.setString(2, PreorderDate);
            stmt.setString(3, PickUpDate); 
            stmt.setString(4, CustomerName);
            stmt.setString(5, PhoneNumber);
            stmt.setInt(6, productID);              
            stmt.setString(7, productName);         
            stmt.setInt(8, quantity);             
            stmt.setDouble(9, price);               
            stmt.setDouble(10, totalPrice);          
            stmt.setString(11, mode);                
            stmt.setString(12, paymentMethod);       
            stmt.setString(13, "Pending");           

            stmt.executeUpdate();  
        }

        JOptionPane.showMessageDialog(null, "Order details saved successfully!");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Order Unsuccessful: " + e.getMessage());
    }
}
    
          public void loadPreOrdersToTable(JTable PreOrderTable) {
        DefaultTableModel model = (DefaultTableModel) PreOrderTable.getModel();
        model.setRowCount(0);

        String query = "SELECT PreOrderID, PreOrderDate, PickUpDate, CustomerName, PhoneNumber, ProductID, ProductName, Quantity, Price, TotalPrice, PaymentMethod, Mode, OrderStatus FROM preorders";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("PreOrderID"),
                    rs.getString("PreOrderDate"),
                    rs.getString("PickUpDate"),
                    rs.getString("CustomerName"),
                    rs.getString("PhoneNumber"),
                    rs.getInt("ProductID"),
                    rs.getString("ProductName"),
                    rs.getInt("Quantity"),
                    rs.getDouble("Price"),
                    rs.getDouble("TotalPrice"),
                    rs.getString("PaymentMethod"),
                    rs.getString("Mode"),
                    rs.getString("OrderStatus")
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading orders: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
          
        
        public String getPreOrderStatus(String PreOrderID) {
        String status = "";
        try {
            Connection conn = getConnection();
            String query = "SELECT OrderStatus FROM preorders WHERE PreOrderID = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, PreOrderID);
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

   public void approvePreOrderAndReduceStock(int preOrderId, int productId) {
        String checkStatusQuery = "SELECT OrderStatus, ProductID, Quantity FROM preorders WHERE PreOrderID = ? AND ProductID = ?";
        String updateQuery = "UPDATE preorders SET OrderStatus = 'Approved' WHERE PreOrderID = ? AND ProductID = ?";
        String updateStockQuery = "UPDATE products SET StocksperBox = StocksperBox - ? WHERE ProductID = ?";
        String cancelOrderQuery = "UPDATE preorders SET OrderStatus = 'Cancelled' WHERE PreOrderID = ? AND ProductID = ?";
        String checkStockQuery = "SELECT StocksperBox FROM products WHERE ProductID = ?";

        try (Connection conn = getConnection();
             PreparedStatement checkPst = conn.prepareStatement(checkStatusQuery)) {

            checkPst.setInt(1, preOrderId);
            checkPst.setInt(2, productId);
            ResultSet rs = checkPst.executeQuery();

            if (rs.next()) {
                String orderStatus = rs.getString("OrderStatus");

                if ("Cancelled".equalsIgnoreCase(orderStatus)) {
                    JOptionPane.showMessageDialog(null, 
                        "Pre-order " + preOrderId + " with ProductID " + productId+ " is already cancelled and cannot be approved.");
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
                                "Low stock! Available stock: " + availableStock + ". Cannot approve pre-order " + preOrderId + " for ProductID " + productId);

                            try (PreparedStatement cancelPst = conn.prepareStatement(cancelOrderQuery)) {
                                cancelPst.setInt(1, preOrderId);
                                cancelPst.setInt(2, productId);
                                int rowsCancelled = cancelPst.executeUpdate();

                                if (rowsCancelled > 0) {
                                    JOptionPane.showMessageDialog(null, 
                                        "Pre-order " + preOrderId+ " with ProductID " + productId+ " has been cancelled due to low stock.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Pre-order ID and ProductID combination not found.");
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
                                        updatePst.setInt(1, preOrderId);
                                        updatePst.setInt(2, productId);  
                                        int rowsAffected = updatePst.executeUpdate();

                                        if (rowsAffected > 0) {
                                            JOptionPane.showMessageDialog(null, 
                                                "Pre-order " + preOrderId + " with ProductID " + productId + " has been approved and stock has been updated.");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Pre-order ID and ProductID combination not found.");
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
                JOptionPane.showMessageDialog(null, "Pre-order ID and ProductID combination not found.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
}