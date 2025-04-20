
package UI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import UI.ProductJFrame;
import UI.CancelJFrame;

public class TypeOfOrderJFrame extends javax.swing.JFrame {
        private String cartDetails;
        private String total;
        private PreOrderJFrame paymentFrame;
        private String ProductID;
        
    public TypeOfOrderJFrame(String cartDetails, String total, PreOrderJFrame paymentFrame, String ProductID) {
        initComponents();
        this.cartDetails = cartDetails;
        this.total = total;
        this.paymentFrame = paymentFrame;
        this.ProductID = ProductID;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PREORDERBTN = new javax.swing.JButton();
        ORDERBTN = new javax.swing.JButton();
        STATUS = new javax.swing.JButton();
        CANCELORDERBTN1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        PREORDERBTN.setBackground(new java.awt.Color(210, 180, 140));
        PREORDERBTN.setText("PRE - ORDER");
        PREORDERBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        PREORDERBTN.setFocusPainted(false);
        PREORDERBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREORDERBTNActionPerformed(evt);
            }
        });
        jPanel1.add(PREORDERBTN);
        PREORDERBTN.setBounds(160, 130, 140, 30);

        ORDERBTN.setBackground(new java.awt.Color(210, 180, 140));
        ORDERBTN.setText("ORDER");
        ORDERBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        ORDERBTN.setFocusPainted(false);
        ORDERBTN.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ORDERBTN.setMargin(new java.awt.Insets(1, 14, 1, 14));
        ORDERBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDERBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ORDERBTN);
        ORDERBTN.setBounds(160, 90, 140, 30);

        STATUS.setBackground(new java.awt.Color(210, 180, 140));
        STATUS.setText("ORDER STATUS");
        STATUS.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        STATUS.setFocusPainted(false);
        STATUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATUSActionPerformed(evt);
            }
        });
        jPanel1.add(STATUS);
        STATUS.setBounds(160, 210, 140, 30);

        CANCELORDERBTN1.setBackground(new java.awt.Color(210, 180, 140));
        CANCELORDERBTN1.setText("CANCEL ORDER");
        CANCELORDERBTN1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CANCELORDERBTN1.setFocusPainted(false);
        CANCELORDERBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELORDERBTN1ActionPerformed(evt);
            }
        });
        jPanel1.add(CANCELORDERBTN1);
        CANCELORDERBTN1.setBounds(160, 170, 140, 30);

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
        jButton1.setBounds(20, 20, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ss.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 293);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 476, 292));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ORDERBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDERBTNActionPerformed
        ProductJFrame productFrame = new ProductJFrame();
        productFrame.setTypeOfOrder("Order");   
        productFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ORDERBTNActionPerformed

    private void PREORDERBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREORDERBTNActionPerformed
         ProductJFrame productFrame = new ProductJFrame();
         productFrame.setTypeOfOrder("PreOrder");
         productFrame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_PREORDERBTNActionPerformed

    private void STATUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATUSActionPerformed
        OrderStatusJFrame orderstatus = new OrderStatusJFrame(cartDetails, total, paymentFrame, ProductID);
        orderstatus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_STATUSActionPerformed

    private void CANCELORDERBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELORDERBTN1ActionPerformed
        CancelJFrame cancel = new CancelJFrame(cartDetails, total, paymentFrame, ProductID);
        cancel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CANCELORDERBTN1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RoleJFrame role = new RoleJFrame();
        role.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TypeOfOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypeOfOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypeOfOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypeOfOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCELORDERBTN1;
    private javax.swing.JButton ORDERBTN;
    private javax.swing.JButton PREORDERBTN;
    private javax.swing.JButton STATUS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
