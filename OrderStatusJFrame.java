
package UI;

import bakeshopsystem.CancelOrder;
import bakeshopsystem.OrderDatabase;
import bakeshopsystem.PreOrderDatabase;
import javax.swing.JOptionPane;

public class OrderStatusJFrame extends javax.swing.JFrame {

    private String productID;
         private String cartDetails;
         private String total;
         private PreOrderJFrame paymentFrame;

    public OrderStatusJFrame(String cartDetails, String total, PreOrderJFrame paymentFrame, String productID) {
        initComponents();
        this.cartDetails = cartDetails;
        this.total = total;
        this.paymentFrame = paymentFrame;
        this.productID = productID;

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PreOrderStatusID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPreOrder = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOrder = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        OrderStatusID = new javax.swing.JTextField();
        CheckOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

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
        jButton1.setBounds(20, 20, 60, 22);

        jLabel2.setText("Pre-Order ID: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 80, 100, 20);
        jPanel1.add(PreOrderStatusID);
        PreOrderStatusID.setBounds(410, 80, 80, 22);

        jTextAreaPreOrder.setColumns(20);
        jTextAreaPreOrder.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPreOrder);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 110, 210, 150);

        jButton2.setBackground(new java.awt.Color(210, 180, 140));
        jButton2.setText("Check Status");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 270, 99, 22);

        jTextAreaOrder.setColumns(20);
        jTextAreaOrder.setRows(5);
        jScrollPane2.setViewportView(jTextAreaOrder);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 110, 210, 150);

        jLabel3.setText("Order ID: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 60, 20);
        jPanel1.add(OrderStatusID);
        OrderStatusID.setBounds(130, 80, 80, 22);

        CheckOrder.setBackground(new java.awt.Color(210, 180, 140));
        CheckOrder.setText("Check Status");
        CheckOrder.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CheckOrder.setFocusPainted(false);
        CheckOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOrderActionPerformed(evt);
            }
        });
        jPanel1.add(CheckOrder);
        CheckOrder.setBounds(30, 270, 90, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lastttt.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 360);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 358));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TypeOfOrderJFrame typeFrame = new TypeOfOrderJFrame(cartDetails, total, paymentFrame, productID);
         typeFrame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOrderActionPerformed
        String orderId = OrderStatusID.getText();  

    if (orderId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Order ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  
    }

    CancelOrder cancel = new CancelOrder();

    cancel.searchOrderDetails(orderId, jTextAreaOrder);
    }//GEN-LAST:event_CheckOrderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String preorderId = PreOrderStatusID.getText();  

    if (preorderId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Order ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;  
    }

    CancelOrder cancel = new CancelOrder();

    cancel.searchPreOrderDetails(preorderId, jTextAreaPreOrder);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderStatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderStatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderStatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderStatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckOrder;
    private javax.swing.JTextField OrderStatusID;
    private javax.swing.JTextField PreOrderStatusID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaOrder;
    private javax.swing.JTextArea jTextAreaPreOrder;
    // End of variables declaration//GEN-END:variables
}
