package bakeshopsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class CancelOrder {
    private static final String url = "jdbc:mysql://localhost:3306/bakeshopsystem";
    private static final String user = "root";
    private static final String password = "";
    private Connection con;

    public CancelOrder() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void cancelOrder(String orderId, int productId) {
        String checkStatusQuery = "SELECT OrderStatus, ProductID FROM orders WHERE OrderID = ? AND ProductID = ?";
        String updateQuery = "UPDATE orders SET OrderStatus = 'Cancelled' WHERE OrderID = ? AND ProductID = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement checkPst = conn.prepareStatement(checkStatusQuery)) {

            checkPst.setString(1, orderId);
            checkPst.setInt(2, productId);
            ResultSet rs = checkPst.executeQuery();

            if (rs.next()) {
                String orderStatus = rs.getString("OrderStatus");

                if ("Cancelled".equalsIgnoreCase(orderStatus)) {
                    JOptionPane.showMessageDialog(null, 
                        "Order " + orderId + " with ProductID " + productId + " is already cancelled.");
                    return;
                }

                try (PreparedStatement updatePst = conn.prepareStatement(updateQuery)) {
                    updatePst.setString(1, orderId);
                    updatePst.setInt(2, productId);
                    int rowsAffected = updatePst.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, 
                            "Order " + orderId + " with ProductID " + productId + " has been cancelled.");
                    } else {
                        JOptionPane.showMessageDialog(null, 
                            "OrderID and ProductID combination not found.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Order ID and ProductID combination not found.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public void cancelPreOrder(String preorderId, int productId) {
        String checkStatusQuery = "SELECT OrderStatus, ProductID FROM preorders WHERE PreOrderID = ? AND ProductID = ?";
        String updateQuery = "UPDATE preorders SET OrderStatus = 'Cancelled' WHERE PreOrderID = ? AND ProductID = ?";

        try (Connection conn = getConnection();
             PreparedStatement checkPst = conn.prepareStatement(checkStatusQuery)) {

            checkPst.setString(1, preorderId);
            checkPst.setInt(2, productId);
            ResultSet rs = checkPst.executeQuery();

            if (rs.next()) {
                String orderStatus = rs.getString("OrderStatus");

                if ("Cancelled".equalsIgnoreCase(orderStatus)) {
                    JOptionPane.showMessageDialog(null, 
                        "PreOrder " + preorderId + " with ProductID " + productId + " is already cancelled.");
                    return;
                }

                try (PreparedStatement updatePst = conn.prepareStatement(updateQuery)) {
                    updatePst.setString(1, preorderId);
                    updatePst.setInt(2, productId);
                    int rowsAffected = updatePst.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, 
                            "PreOrder " + preorderId + " with ProductID " + productId + " has been cancelled.");
                    } else {
                        JOptionPane.showMessageDialog(null, 
                            "PreOrderID and ProductID combination not found.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                    "PreOrder ID and ProductID combination not found.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

   public void searchOrderDetails(String orderId, JTextArea jTextAreaCancelOrder) {
    String sql = "SELECT ProductID, ProductName, Quantity, Price, (Quantity * Price) AS TotalPrice, OrderStatus " +
                 "FROM orders WHERE OrderID = ?";
    try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, orderId);
        ResultSet rs = pstmt.executeQuery();

        jTextAreaCancelOrder.setText("");

        boolean isOrderFound = false;

        while (rs.next()) {
            isOrderFound = true;

            String orderDetails = "ProductID: " + rs.getString("ProductID") + "\n" +
                                  "ProductName: " + rs.getString("ProductName") + "\n" +
                                  "Quantity: " + rs.getInt("Quantity") + "\n" +
                                  "Price: " + rs.getDouble("Price") + "\n" +
                                  "TotalPrice: " + rs.getDouble("TotalPrice") + "\n" +
                                  "OrderStatus: " + rs.getString("OrderStatus") + "\n\n";

            jTextAreaCancelOrder.append(orderDetails);
        }

        if (!isOrderFound) {
            jTextAreaCancelOrder.append("No order found for OrderID: " + orderId + "\n");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
            "Error fetching order details: " + ex.getMessage(), 
            "Database Error", 
            JOptionPane.ERROR_MESSAGE);
    }
}
   
 public boolean checkAndCancelProduct(String orderId, String productId) {
    // SQL query to check the order status and the product within the given order
    String sqlCheckStatus = "SELECT ProductID, OrderStatus FROM orders WHERE OrderID = ? AND ProductID = ?";
    String sqlUpdateStatus = "UPDATE orders SET OrderStatus = 'Cancelled' WHERE OrderID = ? AND ProductID = ?";

    try (Connection conn = getConnection();
         PreparedStatement pstmtCheck = conn.prepareStatement(sqlCheckStatus)) {

        pstmtCheck.setString(1, orderId);
        pstmtCheck.setString(2, productId);
        ResultSet rs = pstmtCheck.executeQuery();

        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");

            if ("Approved".equalsIgnoreCase(orderStatus)) {
                return false;  
            } else {
               
                try (PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdateStatus)) {
                    pstmtUpdate.setString(1, orderId);
                    pstmtUpdate.setString(2, productId);
                    pstmtUpdate.executeUpdate();
                }
                return true;  
            }
        } else {
          
            JOptionPane.showMessageDialog(null, "Product not found in the order.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
            "Error checking or updating product status: " + ex.getMessage(), 
            "Database Error", 
            JOptionPane.ERROR_MESSAGE);
        return false;
    }
}


   
   public void searchPreOrderDetails(String preorderId, JTextArea jTextAreaPreOrder) {
    String sql = "SELECT ProductID, ProductName, Quantity, Price, (Quantity * Price) AS TotalPrice, OrderStatus " +
                 "FROM preorders WHERE PreOrderID = ?";
    try (Connection conn = getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, preorderId);
        ResultSet rs = pstmt.executeQuery();

        jTextAreaPreOrder.setText("");

        boolean isOrderFound = false;
        
        while (rs.next()) {
            isOrderFound = true;

            String orderDetails = "ProductID: " + rs.getString("ProductID") + "\n" +
                                  "ProductName: " + rs.getString("ProductName") + "\n" +
                                  "Quantity: " + rs.getInt("Quantity") + "\n" +
                                  "Price: " + rs.getDouble("Price") + "\n" +
                                  "TotalPrice: " + rs.getDouble("TotalPrice") + "\n" +
                                  "OrderStatus: " + rs.getString("OrderStatus") + "\n\n";

            jTextAreaPreOrder.append(orderDetails);
        }

        if (!isOrderFound) {
            jTextAreaPreOrder.append("No order found for OrderID: " + preorderId + "\n");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
            "Error fetching order details: " + ex.getMessage(), 
            "Database Error", 
            JOptionPane.ERROR_MESSAGE);
    }
}

   
   public boolean checkAndCancelPreProduct(String preorderId, String productId) {
   
    String sqlCheckStatus = "SELECT ProductID, OrderStatus FROM preorders WHERE PreOrderID = ? AND ProductID = ?";
    String sqlUpdateStatus = "UPDATE preorders SET OrderStatus = 'Cancelled' WHERE PreOrderID = ? AND ProductID = ?";

    try (Connection conn = getConnection();
         PreparedStatement pstmtCheck = conn.prepareStatement(sqlCheckStatus)) {

        pstmtCheck.setString(1, preorderId);
        pstmtCheck.setString(2, productId);
        ResultSet rs = pstmtCheck.executeQuery();

        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");

            if ("Approved".equalsIgnoreCase(orderStatus)) {
                return false;  
            } else {
               
                try (PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdateStatus)) {
                    pstmtUpdate.setString(1, preorderId);
                    pstmtUpdate.setString(2, productId);
                    pstmtUpdate.executeUpdate();
                }
                return true;  
            }
        } else {
           
            JOptionPane.showMessageDialog(null, "Product not found in the order.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
            "Error checking or updating product status: " + ex.getMessage(), 
            "Database Error", 
            JOptionPane.ERROR_MESSAGE);
        return false;
    }
   }
}