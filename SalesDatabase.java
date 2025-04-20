package bakeshopsystem;

import UI.AdminDashboardJFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SalesDatabase {

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
    
    public String getProductCategoryByProductID(int productID) {
    String productCategory = "";
    try {
        // Database connection
        Connection con = getConnection();
        
        // SQL Query to get the product category
        String query = "SELECT ProductCategory FROM products WHERE ProductID = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, productID);
        
        // Execute query
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            productCategory = rs.getString("ProductCategory");
        }
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    
    return productCategory;
}
//CAKES
    
 public void insertCakeOrder(int orderID, String orderDate, int productID, String productName, 
                            String productCategory, int quantity, double totalPrice, 
                            String paymentMethod, String orderType) {
    String checkStatusSQL = "SELECT OrderStatus FROM orders WHERE OrderID = ? " +
        "UNION " +
        "SELECT OrderStatus FROM preorders WHERE PreOrderID = ?";
    
    try (Connection con = getConnection();
         PreparedStatement checkStatusStmt = con.prepareStatement(checkStatusSQL)) {
        
        checkStatusStmt.setInt(1, orderID);
        checkStatusStmt.setInt(2, orderID);
        ResultSet rs = checkStatusStmt.executeQuery();
        
        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");
            System.out.println("OrderStatus for OrderID " + orderID + ": " + orderStatus);
            
            if ("Approved".equals(orderStatus)) {
                String insertSQL = "INSERT INTO cake_sales (OrderID, OrderDate, ProductID, ProductName, ProductCategory, Quantity, TotalPrice, PaymentMethod, OrderType) " +
                                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
                    pstmt.setInt(1, orderID);
                    pstmt.setString(2, orderDate);
                    pstmt.setInt(3, productID);
                    pstmt.setString(4, productName);
                    pstmt.setString(5, productCategory);
                    pstmt.setInt(6, quantity);
                    pstmt.setDouble(7, totalPrice);
                    pstmt.setString(8, paymentMethod);
                    pstmt.setString(9, orderType);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("Cake order successfully saved in cake_sales table.");
                    }
                } catch (SQLException e) {
                    System.err.println("Error inserting cake order: " + e.getMessage());
                }
            } else {
                System.out.println("Order is not approved yet. Cannot insert into cake_sales table.");
            }
        } else {
            System.out.println("OrderID not found.");
        }
    } catch (SQLException e) {
        System.err.println("Error checking order status: " + e.getMessage());
    }
}
        public void loadCakeSalesData(JTable cakesales, JLabel RatingCake, JLabel TotalQuantityCakes, JLabel TotalSoldCakes) {
        DefaultTableModel model = (DefaultTableModel) cakesales.getModel();
        model.setRowCount(0);
    String query = "SELECT ProductID, ProductName, SUM(Quantity) AS TotalQuantity, SUM(TotalPrice) AS TotalAmount " +
                   "FROM cake_sales WHERE ProductCategory = 'Cake' GROUP BY ProductID, ProductName";

    try (
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery()
            
    ) {
        String bestSellingCakeName = null;
        int highestQuantity = 0;
        double highestTotalAmount = 0;
        
        while (rs.next()) {
            int productID = rs.getInt("ProductID");
            String productName = rs.getString("ProductName");
            int totalQuantity = rs.getInt("TotalQuantity");
            double totalAmount = rs.getDouble("TotalAmount");

            model.addRow(new Object[]{productID, productName, totalQuantity, totalAmount});
            
              // Check if this product has the highest quantity
           if (totalQuantity > highestQuantity) {
              bestSellingCakeName = productName;
              highestQuantity = totalQuantity;
              highestTotalAmount = totalAmount;
            }
        }

        // Update JLabels for the top-selling cake
         if (bestSellingCakeName != null) {
            RatingCake.setText(bestSellingCakeName);
            TotalQuantityCakes.setText(String.valueOf(highestQuantity));
            TotalSoldCakes.setText(String.format("₱%.2f", highestTotalAmount));
        } else {
            // If no data, display default values
            RatingCake.setText("");
            TotalQuantityCakes.setText("0");
            TotalSoldCakes.setText("₱0.00");
        
        }
        
    } catch (SQLException e) {
        System.err.println("Error loading cake sales data: " + e.getMessage());
        e.printStackTrace();
    }
}
//cupcakes
        public void insertCupCakeOrder(int orderID, String orderDate, int productID, String productName, 
                            String productCategory, int quantity, double totalPrice, 
                            String paymentMethod, String orderType) {
    String checkStatusSQL = "SELECT OrderStatus FROM orders WHERE OrderID = ? " +
        "UNION " +
        "SELECT OrderStatus FROM preorders WHERE PreOrderID = ?";
    
    try (Connection con = getConnection();
         PreparedStatement checkStatusStmt = con.prepareStatement(checkStatusSQL)) {
        
        checkStatusStmt.setInt(1, orderID);
        checkStatusStmt.setInt(2, orderID);
        ResultSet rs = checkStatusStmt.executeQuery();
        
        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");
            System.out.println("OrderStatus for OrderID " + orderID + ": " + orderStatus);
            
            if ("Approved".equals(orderStatus)) {
                String insertSQL = "INSERT INTO cupcake_sales (OrderID, OrderDate, ProductID, ProductName, ProductCategory, Quantity, TotalPrice, PaymentMethod, OrderType) " +
                                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
                    pstmt.setInt(1, orderID);
                    pstmt.setString(2, orderDate);
                    pstmt.setInt(3, productID);
                    pstmt.setString(4, productName);
                    pstmt.setString(5, productCategory);
                    pstmt.setInt(6, quantity);
                    pstmt.setDouble(7, totalPrice);
                    pstmt.setString(8, paymentMethod);
                    pstmt.setString(9, orderType);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("cupCake order successfully saved in cupcake_sales table.");
                    }
                } catch (SQLException e) {
                    System.err.println("Error inserting cake order: " + e.getMessage());
                }
            } else {
                System.out.println("Order is not approved yet. Cannot insert into cupcake_sales table.");
            }
        } else {
            System.out.println("OrderID not found.");
        }
    } catch (SQLException e) {
        System.err.println("Error checking order status: " + e.getMessage());
    }
}
         public void loadCupCakeSalesData(JTable cupcakesales, JLabel RatingCupCake, JLabel TotalQuantityCupCakes, JLabel TotalSoldCupCakes) {
        DefaultTableModel model = (DefaultTableModel) cupcakesales.getModel();
        model.setRowCount(0);
    String query = "SELECT ProductID, ProductName, SUM(Quantity) AS TotalQuantity, SUM(TotalPrice) AS TotalAmount " +
                   "FROM cupcake_sales WHERE ProductCategory = 'Cup Cake' GROUP BY ProductID, ProductName";

    try (
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery()
            
    ) {
        String bestSellingCakeName = null;
        int highestQuantity = 0;
        double highestTotalAmount = 0;
        
        while (rs.next()) {
            int productID = rs.getInt("ProductID");
            String productName = rs.getString("ProductName");
            int totalQuantity = rs.getInt("TotalQuantity");
            double totalAmount = rs.getDouble("TotalAmount");

            model.addRow(new Object[]{productID, productName, totalQuantity, totalAmount});
            
              // Check if this product has the highest quantity
            if (totalQuantity > highestQuantity) {
                bestSellingCakeName = productName;
                highestQuantity = totalQuantity;
                highestTotalAmount = totalAmount;
            }
        }

        // Update JLabels for the top-selling cake
        if (bestSellingCakeName != null) {
            RatingCupCake.setText(bestSellingCakeName);
            TotalQuantityCupCakes.setText(String.valueOf(highestQuantity));
            TotalSoldCupCakes.setText(String.format("₱%.2f", highestTotalAmount));
        } else {
            // If no data, display default values
            RatingCupCake.setText("");
            TotalQuantityCupCakes.setText("0");
            TotalSoldCupCakes.setText("₱0.00");
        
        }
        
    } catch (SQLException e) {
        System.err.println("Error loading cake sales data: " + e.getMessage());
        e.printStackTrace();
    }
}
         public void insertCheeseCakeOrder(int orderID, String orderDate, int productID, String productName, 
                            String productCategory, int quantity, double totalPrice, 
                            String paymentMethod, String orderType) {
    String checkStatusSQL = "SELECT OrderStatus FROM orders WHERE OrderID = ? " +
        "UNION " +
        "SELECT OrderStatus FROM preorders WHERE PreOrderID = ?";
    
    try (Connection con = getConnection();
         PreparedStatement checkStatusStmt = con.prepareStatement(checkStatusSQL)) {
        
        checkStatusStmt.setInt(1, orderID);
        checkStatusStmt.setInt(2, orderID);
        ResultSet rs = checkStatusStmt.executeQuery();
        
        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");
            System.out.println("OrderStatus for OrderID " + orderID + ": " + orderStatus);
            
            if ("Approved".equals(orderStatus)) {
                String insertSQL = "INSERT INTO cheesecake_sales (OrderID, OrderDate, ProductID, ProductName, ProductCategory, Quantity, TotalPrice, PaymentMethod, OrderType) " +
                                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
                    pstmt.setInt(1, orderID);
                    pstmt.setString(2, orderDate);
                    pstmt.setInt(3, productID);
                    pstmt.setString(4, productName);
                    pstmt.setString(5, productCategory);
                    pstmt.setInt(6, quantity);
                    pstmt.setDouble(7, totalPrice);
                    pstmt.setString(8, paymentMethod);
                    pstmt.setString(9, orderType);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("cheesecakesales order successfully saved in cheesecake_sales table.");
                    }
                } catch (SQLException e) {
                    System.err.println("Error inserting cake order: " + e.getMessage());
                }
            } else {
                System.out.println("Order is not approved yet. Cannot insert into cupcake_sales table.");
            }
        } else {
            System.out.println("OrderID not found.");
        }
    } catch (SQLException e) {
        System.err.println("Error checking order status: " + e.getMessage());
    }
}
          public void loadCheeseCakeSalesData(JTable cheesecakesales, JLabel RatingCheeseCake, JLabel TotalQuantityCheeseCakes, JLabel TotalSoldCheeseCakes) {
        DefaultTableModel model = (DefaultTableModel) cheesecakesales.getModel();
        model.setRowCount(0);
    String query = "SELECT ProductID, ProductName, SUM(Quantity) AS TotalQuantity, SUM(TotalPrice) AS TotalAmount " +
                   "FROM cheesecake_sales WHERE ProductCategory = 'Cheese Cake' GROUP BY ProductID, ProductName";

    try (
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery()
            
    ) {
        String bestSellingCakeName = null;
        int highestQuantity = 0;
        double highestTotalAmount = 0;
        
        while (rs.next()) {
            int productID = rs.getInt("ProductID");
            String productName = rs.getString("ProductName");
            int totalQuantity = rs.getInt("TotalQuantity");
            double totalAmount = rs.getDouble("TotalAmount");

            model.addRow(new Object[]{productID, productName, totalQuantity, totalAmount});
            
              // Check if this product has the highest quantity
            if (totalQuantity > highestQuantity) {
                bestSellingCakeName = productName;
                highestQuantity = totalQuantity;
                highestTotalAmount = totalAmount;
            }
        }

        // Update JLabels for the top-selling cake
        if (bestSellingCakeName != null) {
            RatingCheeseCake.setText(bestSellingCakeName);
            TotalQuantityCheeseCakes.setText(String.valueOf(highestQuantity));
            TotalSoldCheeseCakes.setText(String.format("₱%.2f", highestTotalAmount));
        } else {
            // If no data, display default values
            RatingCheeseCake.setText("");
            TotalQuantityCheeseCakes.setText("0");
            TotalSoldCheeseCakes.setText("₱0.00");
        
        }
        
    } catch (SQLException e) {
        System.err.println("Error loading cake sales data: " + e.getMessage());
        e.printStackTrace();
    }
}
            public void insertCookiesOrder(int orderID, String orderDate, int productID, String productName, 
                            String productCategory, int quantity, double totalPrice, 
                            String paymentMethod, String orderType) {
    String checkStatusSQL = "SELECT OrderStatus FROM orders WHERE OrderID = ? " +
        "UNION " +
        "SELECT OrderStatus FROM preorders WHERE PreOrderID = ?";
    
    try (Connection con = getConnection();
         PreparedStatement checkStatusStmt = con.prepareStatement(checkStatusSQL)) {
        
        checkStatusStmt.setInt(1, orderID);
        checkStatusStmt.setInt(2, orderID);
        ResultSet rs = checkStatusStmt.executeQuery();
        
        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");
            System.out.println("OrderStatus for OrderID " + orderID + ": " + orderStatus);
            
            if ("Approved".equals(orderStatus)) {
                String insertSQL = "INSERT INTO cookies_sales (OrderID, OrderDate, ProductID, ProductName, ProductCategory, Quantity, TotalPrice, PaymentMethod, OrderType) " +
                                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
                    pstmt.setInt(1, orderID);
                    pstmt.setString(2, orderDate);
                    pstmt.setInt(3, productID);
                    pstmt.setString(4, productName);
                    pstmt.setString(5, productCategory);
                    pstmt.setInt(6, quantity);
                    pstmt.setDouble(7, totalPrice);
                    pstmt.setString(8, paymentMethod);
                    pstmt.setString(9, orderType);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("cookiessales order successfully saved in cookies_sales table.");
                    }
                } catch (SQLException e) {
                    System.err.println("Error inserting cake order: " + e.getMessage());
                }
            } else {
                System.out.println("Order is not approved yet. Cannot insert into cupcake_sales table.");
            }
        } else {
            System.out.println("OrderID not found.");
        }
    } catch (SQLException e) {
        System.err.println("Error checking order status: " + e.getMessage());
    }
}
            public void loadCookiesSalesData(JTable cookiessales, JLabel RatingCookies, JLabel TotalQuantityCookies, JLabel TotalSoldCookies) {
        DefaultTableModel model = (DefaultTableModel) cookiessales.getModel();
        model.setRowCount(0);
    String query = "SELECT ProductID, ProductName, SUM(Quantity) AS TotalQuantity, SUM(TotalPrice) AS TotalAmount " +
                   "FROM cookies_sales WHERE ProductCategory = 'Cookies' GROUP BY ProductID, ProductName";

    try (
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery()
            
    ) {
        String bestSellingCakeName = null;
        int highestQuantity = 0;
        double highestTotalAmount = 0;
        
        while (rs.next()) {
            int productID = rs.getInt("ProductID");
            String productName = rs.getString("ProductName");
            int totalQuantity = rs.getInt("TotalQuantity");
            double totalAmount = rs.getDouble("TotalAmount");

            model.addRow(new Object[]{productID, productName, totalQuantity, totalAmount});
            
              // Check if this product has the highest quantity
            if (totalQuantity > highestQuantity) {
                bestSellingCakeName = productName;
                highestQuantity = totalQuantity;
                highestTotalAmount = totalAmount;
            }
        }

        // Update JLabels for the top-selling cake
        if (bestSellingCakeName != null) {
            RatingCookies.setText(bestSellingCakeName);
            TotalQuantityCookies.setText(String.valueOf(highestQuantity));
            TotalSoldCookies.setText(String.format("₱%.2f", highestTotalAmount));
        } else {
            // If no data, display default values
            RatingCookies.setText("");
            TotalQuantityCookies.setText("0");
            TotalSoldCookies.setText("₱0.00");
        
        }
        
    } catch (SQLException e) {
        System.err.println("Error loading cake sales data: " + e.getMessage());
        e.printStackTrace();
    }
}
             public void insertMuffinsOrder(int orderID, String orderDate, int productID, String productName, 
                            String productCategory, int quantity, double totalPrice, 
                            String paymentMethod, String orderType) {
    String checkStatusSQL = "SELECT OrderStatus FROM orders WHERE OrderID = ? " +
        "UNION " +
        "SELECT OrderStatus FROM preorders WHERE PreOrderID = ?";
    
    try (Connection con = getConnection();
         PreparedStatement checkStatusStmt = con.prepareStatement(checkStatusSQL)) {
        
        checkStatusStmt.setInt(1, orderID);
        checkStatusStmt.setInt(2, orderID);
        ResultSet rs = checkStatusStmt.executeQuery();
        
        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");
            System.out.println("OrderStatus for OrderID " + orderID + ": " + orderStatus);
            
            if ("Approved".equals(orderStatus)) {
                String insertSQL = "INSERT INTO muffins_sales (OrderID, OrderDate, ProductID, ProductName, ProductCategory, Quantity, TotalPrice, PaymentMethod, OrderType) " +
                                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
                    pstmt.setInt(1, orderID);
                    pstmt.setString(2, orderDate);
                    pstmt.setInt(3, productID);
                    pstmt.setString(4, productName);
                    pstmt.setString(5, productCategory);
                    pstmt.setInt(6, quantity);
                    pstmt.setDouble(7, totalPrice);
                    pstmt.setString(8, paymentMethod);
                    pstmt.setString(9, orderType);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("muffinssales order successfully saved in muffins_sales table.");
                    }
                } catch (SQLException e) {
                    System.err.println("Error inserting cake order: " + e.getMessage());
                }
            } else {
                System.out.println("Order is not approved yet. Cannot insert into muffins_sales table.");
            }
        } else {
            System.out.println("OrderID not found.");
        }
    } catch (SQLException e) {
        System.err.println("Error checking order status: " + e.getMessage());
    }
} 
             public void loadMuffinsSalesData(JTable muffinssales, JLabel RatingMuffins, JLabel TotalQuantityMuffins, JLabel TotalSoldMuffins) {
        DefaultTableModel model = (DefaultTableModel) muffinssales.getModel();
        model.setRowCount(0);
    String query = "SELECT ProductID, ProductName, SUM(Quantity) AS TotalQuantity, SUM(TotalPrice) AS TotalAmount " +
                   "FROM muffins_sales WHERE ProductCategory = 'Muffin' GROUP BY ProductID, ProductName";

    try (
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery()
            
    ) {
        String bestSellingCakeName = null;
        int highestQuantity = 0;
        double highestTotalAmount = 0;
        
        while (rs.next()) {
            int productID = rs.getInt("ProductID");
            String productName = rs.getString("ProductName");
            int totalQuantity = rs.getInt("TotalQuantity");
            double totalAmount = rs.getDouble("TotalAmount");

            model.addRow(new Object[]{productID, productName, totalQuantity, totalAmount});
            
              // Check if this product has the highest quantity
            if (totalQuantity > highestQuantity) {
                bestSellingCakeName = productName;
                highestQuantity = totalQuantity;
                highestTotalAmount = totalAmount;
            }
        }

        // Update JLabels for the top-selling cake
        if (bestSellingCakeName != null) {
            RatingMuffins.setText(bestSellingCakeName);
            TotalQuantityMuffins.setText(String.valueOf(highestQuantity));
            TotalSoldMuffins.setText(String.format("₱%.2f", highestTotalAmount));
        } else {
            // If no data, display default values
            RatingMuffins.setText("");
            TotalQuantityMuffins.setText("0");
            TotalSoldMuffins.setText("₱0.00");
        
        }
        
    } catch (SQLException e) {
        System.err.println("Error loading cake sales data: " + e.getMessage());
        e.printStackTrace();
    }
}
              public void insertCinnamonOrder(int orderID, String orderDate, int productID, String productName, 
                            String productCategory, int quantity, double totalPrice, 
                            String paymentMethod, String orderType) {
    String checkStatusSQL = "SELECT OrderStatus FROM orders WHERE OrderID = ? " +
        "UNION " +
        "SELECT OrderStatus FROM preorders WHERE PreOrderID = ?";
    
    try (Connection con = getConnection();
         PreparedStatement checkStatusStmt = con.prepareStatement(checkStatusSQL)) {
        
        checkStatusStmt.setInt(1, orderID);
        checkStatusStmt.setInt(2, orderID);
        ResultSet rs = checkStatusStmt.executeQuery();
        
        if (rs.next()) {
            String orderStatus = rs.getString("OrderStatus");
            System.out.println("OrderStatus for OrderID " + orderID + ": " + orderStatus);
            
            if ("Approved".equals(orderStatus)) {
                String insertSQL = "INSERT INTO cinnamon_sales (OrderID, OrderDate, ProductID, ProductName, ProductCategory, Quantity, TotalPrice, PaymentMethod, OrderType) " +
                                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(insertSQL)) {
                    pstmt.setInt(1, orderID);
                    pstmt.setString(2, orderDate);
                    pstmt.setInt(3, productID);
                    pstmt.setString(4, productName);
                    pstmt.setString(5, productCategory);
                    pstmt.setInt(6, quantity);
                    pstmt.setDouble(7, totalPrice);
                    pstmt.setString(8, paymentMethod);
                    pstmt.setString(9, orderType);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("cinnamonsales order successfully saved in cinnamon_sales table.");
                    }
                } catch (SQLException e) {
                    System.err.println("Error inserting cake order: " + e.getMessage());
                }
            } else {
                System.out.println("Order is not approved yet. Cannot insert into cinnamon_sales table.");
            }
        } else {
            System.out.println("OrderID not found.");
        }
    } catch (SQLException e) {
        System.err.println("Error checking order status: " + e.getMessage());
    }
} 
              public void loadCinnamonSalesData(JTable cinnamonsales, JLabel RatingCinnamon, JLabel TotalQuantityCinnamon, JLabel TotalSoldCinnamon) {
        DefaultTableModel model = (DefaultTableModel) cinnamonsales.getModel();
        model.setRowCount(0);
    String query = "SELECT ProductID, ProductName, SUM(Quantity) AS TotalQuantity, SUM(TotalPrice) AS TotalAmount " +
                   "FROM cinnamon_sales WHERE ProductCategory = 'Cinnamon Roll' GROUP BY ProductID, ProductName";

    try (
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery()
            
    ) {
        String bestSellingCakeName = null;
        int highestQuantity = 0;
        double highestTotalAmount = 0;
        
        while (rs.next()) {
            int productID = rs.getInt("ProductID");
            String productName = rs.getString("ProductName");
            int totalQuantity = rs.getInt("TotalQuantity");
            double totalAmount = rs.getDouble("TotalAmount");

            model.addRow(new Object[]{productID, productName, totalQuantity, totalAmount});
            
              // Check if this product has the highest quantity
            if (totalQuantity > highestQuantity) {
                bestSellingCakeName = productName;
                highestQuantity = totalQuantity;
                highestTotalAmount = totalAmount;
            }
        }

        // Update JLabels for the top-selling cake
        if (bestSellingCakeName != null) {
            RatingCinnamon.setText(bestSellingCakeName);
            TotalQuantityCinnamon.setText(String.valueOf(highestQuantity));
            TotalSoldCinnamon.setText(String.format("₱%.2f", highestTotalAmount));
        } else {
            // If no data, display default values
            RatingCinnamon.setText("");
            TotalQuantityCinnamon.setText("0");
            TotalSoldCinnamon.setText("₱0.00");
        
        }
        
    } catch (SQLException e) {
        System.err.println("Error loading cake sales data: " + e.getMessage());
        e.printStackTrace();
    }
}
}
