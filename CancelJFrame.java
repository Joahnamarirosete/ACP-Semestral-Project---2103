
package UI;

public class CancelJFrame extends javax.swing.JFrame {
     private String productID;
     private String cartDetails;
     private String total;
     private PreOrderJFrame paymentFrame;
    
    public CancelJFrame(String cartDetails, String total, PreOrderJFrame paymentFrame, String productID) {
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
        CancelOrderBTN = new javax.swing.JButton();
        CancelPreOrderBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        CancelOrderBTN.setBackground(new java.awt.Color(210, 180, 140));
        CancelOrderBTN.setText("ORDER");
        CancelOrderBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CancelOrderBTN.setFocusPainted(false);
        CancelOrderBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderBTNActionPerformed(evt);
            }
        });
        jPanel1.add(CancelOrderBTN);
        CancelOrderBTN.setBounds(140, 110, 110, 22);

        CancelPreOrderBTN.setBackground(new java.awt.Color(210, 180, 140));
        CancelPreOrderBTN.setText("PRE-ORDER");
        CancelPreOrderBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CancelPreOrderBTN.setFocusPainted(false);
        CancelPreOrderBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelPreOrderBTNActionPerformed(evt);
            }
        });
        jPanel1.add(CancelPreOrderBTN);
        CancelPreOrderBTN.setBounds(140, 160, 110, 22);

        jButton1.setBackground(new java.awt.Color(210, 180, 140));
        jButton1.setText("BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED))));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 90, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ss.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelOrderBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderBTNActionPerformed
        CancelOrderJFrame cancelorder = new CancelOrderJFrame(cartDetails, total, paymentFrame, productID);
        cancelorder.setVisible(true);
        
    }//GEN-LAST:event_CancelOrderBTNActionPerformed

    private void CancelPreOrderBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelPreOrderBTNActionPerformed
        CancelPreOrderJFrame cancelpreorder = new CancelPreOrderJFrame();
        cancelpreorder.setVisible(true);
    }//GEN-LAST:event_CancelPreOrderBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TypeOfOrderJFrame type = new TypeOfOrderJFrame(cartDetails, total, paymentFrame, productID);
        type.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelOrderBTN;
    private javax.swing.JButton CancelPreOrderBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
