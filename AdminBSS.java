package bakeshopsystem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AdminBSS {

    private Connection connect;

    public AdminBSS(Connection connection) {
        this.connect = connection;
    }

    public boolean validateAdmin(String username, String password) {
        String sql = "SELECT * FROM admin WHERE Username = ? AND Password = ?";
        try {
            PreparedStatement pstmt = connect.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            return rs.next(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
}
