
package UI;

import bakeshopsystem.CancelOrder;
import bakeshopsystem.OrderDatabase;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class CancelOrderJFrame extends javax.swing.JFrame {
        private String productID;
         private String cartDetails;
         private String total;
         private PreOrderJFrame paymentFrame;
    
    public CancelOrderJFrame(String cartDetails, String total, PreOrderJFrame paymentFrame, String productID) {
        initComponents();
        this.cartDetails = cartDetails;
        this.total = total;
        this.paymentFrame = paymentFrame;
        this.productID = productID;

    }
    public String getCancelOrderID() {
    return CancelOrderID.getText(); 
    }
    public String getCancelPreOrderID(){
     return CancelOrderID.getText();
    }
    public JTextArea getJTextAreaCancelOrder() {
        return jTextAreaCancelOrder; 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CancelOrderID = new javax.swing.JTextField();
        SearchBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCancelOrder = new javax.swing.JTextArea();
        CancelOrder = new javax.swing.JButton();
        ProductID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel2.setText("Type your Order ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 30, 130, 20);

        CancelOrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderIDActionPerformed(evt);
            }
        });
        jPanel1.add(CancelOrderID);
        CancelOrderID.setBounds(190, 30, 70, 22);

        SearchBTN.setBackground(new java.awt.Color(210, 180, 140));
        SearchBTN.setText("Search");
        SearchBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        SearchBTN.setFocusPainted(false);
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBTN);
        SearchBTN.setBounds(390, 30, 90, 22);

        jTextAreaCancelOrder.setColumns(20);
        jTextAreaCancelOrder.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCancelOrder);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 70, 430, 280);

        CancelOrder.setBackground(new java.awt.Color(210, 180, 140));
        CancelOrder.setText("Cancel Order");
        CancelOrder.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CancelOrder.setFocusPainted(false);
        CancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderActionPerformed(evt);
            }
        });
        jPanel1.add(CancelOrder);
        CancelOrder.setBounds(210, 360, 120, 22);
        jPanel1.add(ProductID);
        ProductID.setBounds(280, 30, 64, 22);

        jButton1.setBackground(new java.awt.Color(210, 180, 140));
        jButton1.setText("BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 360, 60, 22);

        jLabel3.setText("(ProductID)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 50, 70, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lastttt.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 400);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelOrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelOrderIDActionPerformed

    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        String orderId = CancelOrderID.getText();  

    if (orderId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Order ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  
    }

    CancelOrder cancel = new CancelOrder();

    cancel.searchOrderDetails(orderId, jTextAreaCancelOrder);
    }//GEN-LAST:event_SearchBTNActionPerformed

    private void CancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderActionPerformed
         String orderId = CancelOrderID.getText();  
    String productId = ProductID.getText();  

    if (orderId.isEmpty() || productId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both Order ID and Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }

    CancelOrder cancel = new CancelOrder();

    boolean isCanceled = cancel.checkAndCancelProduct(orderId, productId);

    if (isCanceled) {
        JOptionPane.showMessageDialog(this, "Product has been successfully canceled.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Cannot cancel the product. It has already been approved by the Admin.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_CancelOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CancelJFrame cancel = new CancelJFrame(cartDetails, total, paymentFrame, productID);
           cancel.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelOrder;
    private javax.swing.JTextField CancelOrderID;
    private javax.swing.JTextField ProductID;
    private javax.swing.JButton SearchBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCancelOrder;
    // End of variables declaration//GEN-END:variables
}
