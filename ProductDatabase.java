package bakeshopsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductDatabase {
    
    public Product getProductByName(String productName) {
        Product product = null; 
        String query = "SELECT ProductID, ProductName, ProductPrice FROM products WHERE ProductName = ?";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakeshopsystem", "root", "");
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, productName);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                product = new Product(
                    rs.getInt("ProductID"),     
                    rs.getString("ProductName"), 
                    rs.getDouble("ProductPrice") 
                );
            }

            rs.close();
        } catch (SQLException e) {
            System.err.println("Error retrieving product: " + e.getMessage());
        }

        return product; 
    }
    
    public void restockProduct(String productId, int quantityToAdd) {
    try {
       
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakeshopsystem", "root", "");

       
        String query = "UPDATE products SET StocksperBox = StocksperBox + ? WHERE ProductID = ?";
        PreparedStatement ps = con.prepareStatement(query);
        
        
        ps.setInt(1, quantityToAdd);
        ps.setString(2, productId);

        int rowsUpdated = ps.executeUpdate();
        
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Product restocked successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Product not found.");
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error while updating stock: " + ex.getMessage());
    }
}
}