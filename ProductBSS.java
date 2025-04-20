package bakeshopsystem;

import UI.TypeOfOrderJFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import UI.PreOrderJFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class ProductBSS {
    private PreOrderJFrame paymentFrame;
    private static final String url = "jdbc:mysql://localhost:3306/bakeshopsystem";
    private static final String user = "root";
    private static final String password = "";
    private Connection con;
    
      public Connection getConnection() {
        return con;
    }
    
  
    public String getCartDetails(javax.swing.JTextArea cartTextArea) {
        return cartTextArea.getText();
    }

    public double calculateTotal(javax.swing.JTextArea cartTextArea) {
        String orders = cartTextArea.getText(); 
        String[] lines = orders.split("\\n");
        double grandTotal = 0.0;

        for (String line : lines) {
            String[] parts = line.trim().split("\\s+"); 
            if (parts.length >= 5) { 
                try {
                    double totalPrice = Double.parseDouble(parts[4]); 
                    grandTotal += totalPrice;
                } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(
                        null, 
                        "Error processing line: " + line, 
                        "Error", 
                        javax.swing.JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }

        return grandTotal;
    }
    
    public void clearLastItemInCart(JTextArea cartArea) {
        String cartContent = cartArea.getText();
        String[] lines = cartContent.split("\n");

        if (lines.length > 0) {
            StringBuilder updatedCart = new StringBuilder();
            for (int i = 0; i < lines.length - 1; i++) {
                updatedCart.append(lines[i]).append("\n");
            }

            cartArea.setText(updatedCart.toString());
        }
    }

     public void loadProductsToTable(JTable ProductsTable) {
        DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
        model.setRowCount(0);

        String query = "SELECT ProductID, ProductName, ProductCategory, ProductFlavor, ProductPcs, ProductPrice, StocksperBox FROM products";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("ProductID"),
                    rs.getString("ProductName"),
                    rs.getString("ProductCategory"),
                    rs.getString("ProductFlavor"),
                    rs.getInt("ProductPcs"),
                    rs.getDouble("ProductPrice"),
                    rs.getInt("StocksperBox"),
     
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading orders: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}