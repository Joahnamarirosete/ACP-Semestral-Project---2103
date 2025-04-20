
package UI;

import bakeshopsystem.CancelOrder;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class CancelPreOrderJFrame extends javax.swing.JFrame {
        private String productID;
         private String cartDetails;
         private String total;
         private PreOrderJFrame paymentFrame;
    
    public CancelPreOrderJFrame() {
        initComponents();
    }
    public String getCancelPreOrderID(){
     return jTextFieldCancelPreOrder.getText();
    }
    public JTextArea getJTextAreaCancelPreOrder() {
        return jTextAreaPreOrder; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldCancelPreOrder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPreOrder = new javax.swing.JTextArea();
        SearchPreButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldCancelPreOrder1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jTextFieldCancelPreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCancelPreOrderActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCancelPreOrder);
        jTextFieldCancelPreOrder.setBounds(150, 50, 70, 22);

        jLabel1.setText("Type your Pre-Order:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 130, 20);

        jTextAreaPreOrder.setColumns(20);
        jTextAreaPreOrder.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPreOrder);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 90, 410, 240);

        SearchPreButton.setBackground(new java.awt.Color(210, 180, 140));
        SearchPreButton.setText("Search");
        SearchPreButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        SearchPreButton.setFocusPainted(false);
        SearchPreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPreButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SearchPreButton);
        SearchPreButton.setBounds(340, 50, 90, 22);

        jButton2.setBackground(new java.awt.Color(210, 180, 140));
        jButton2.setText("Cancel Order");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 340, 120, 22);
        jPanel1.add(jTextFieldCancelPreOrder1);
        jTextFieldCancelPreOrder1.setBounds(234, 50, 70, 22);

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
        jButton1.setBounds(410, 340, 70, 22);

        jLabel3.setText("(Product ID)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 70, 70, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lastttt.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 390);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 389));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCancelPreOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCancelPreOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCancelPreOrderActionPerformed

    private void SearchPreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPreButtonActionPerformed
        String preorderId = jTextFieldCancelPreOrder.getText();  

    if (preorderId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Order ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  
    }

    CancelOrder cancel = new CancelOrder();

    cancel.searchPreOrderDetails(preorderId, jTextAreaPreOrder);
    }//GEN-LAST:event_SearchPreButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String preorderId = jTextFieldCancelPreOrder.getText(); 
    String productId = jTextFieldCancelPreOrder1.getText(); 

    if (preorderId.isEmpty() || productId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both Order ID and Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  
    }

    CancelOrder cancel = new CancelOrder();
    boolean isCanceled = cancel.checkAndCancelPreProduct(preorderId, productId);

    if (isCanceled) {
        JOptionPane.showMessageDialog(this, "Product has been successfully canceled.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Cannot cancel the product. It has already been approved by the Admin.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CancelJFrame cancel = new CancelJFrame(cartDetails, total, paymentFrame, productID);
        cancel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelPreOrderJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchPreButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPreOrder;
    private javax.swing.JTextField jTextFieldCancelPreOrder;
    private javax.swing.JTextField jTextFieldCancelPreOrder1;
    // End of variables declaration//GEN-END:variables
}
