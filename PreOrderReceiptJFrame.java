
package UI;

import bakeshopsystem.PreOrderDatabase;
import javax.swing.table.DefaultTableModel;

public class PreOrderReceiptJFrame extends javax.swing.JFrame {

    public PreOrderReceiptJFrame(Object[][] rowData, String PickupDate, String CustomerName, String PreOrderDate, String PhoneNumber, String PaymentMethod, String preOrderId) {
        initComponents();
        jTextFieldPreOrderID.setText(preOrderId);
        jTextFieldPreorderMode.setText("Pre-Order");
        jTextFieldPickUpDate.setText(PickupDate);
        jTextFieldCName.setText(CustomerName);
        jTextFieldPreOrderDate.setText(PreOrderDate);
        jTextFieldCNumber.setText(PhoneNumber);
        jTextFieldPMethod.setText(PaymentMethod);
        DefaultTableModel tableModel = new DefaultTableModel(rowData, new Object[] { 
            "Product ID", "Product Name", "Quantity", "Price", "Total Price"
         });
        jTableReceiptPreOrder.setModel(tableModel);
        double totalAmount = calculateTotalAmount(); 
        setTotalAmount(totalAmount);
    }
    
      private double calculateTotalAmount() {
        double totalAmount = 0.0;
        DefaultTableModel model = (DefaultTableModel) jTableReceiptPreOrder.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            double totalPrice = Double.parseDouble(model.getValueAt(i, 4).toString()); 
            totalAmount += totalPrice; 
        }

        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        jTextFieldTotalPreOrder.setText("Php " + totalAmount); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPreOrderID = new javax.swing.JTextField();
        jTextFieldPickUpDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReceiptPreOrder = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPMethod = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPreorderMode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldTotalPreOrder = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPreOrderDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 541));
        setPreferredSize(new java.awt.Dimension(844, 549));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(440, 541));
        jPanel1.setPreferredSize(new java.awt.Dimension(747, 536));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("PHIKUL TASTE BAKESHOP");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 20, 200, 20);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("RECEIPT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 40, 70, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Thanks for your Order!");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(590, 380, 140, 20);

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel5.setText("Pre-Order Date/Time:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 80, 160, 30);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel6.setText("Pre-Order ID:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(520, 100, 130, 30);

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel7.setText("Pick-Up Date/Time: ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(520, 130, 150, 30);
        jPanel1.add(jTextFieldPreOrderID);
        jTextFieldPreOrderID.setBounds(680, 100, 120, 22);

        jTextFieldPickUpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPickUpDateActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPickUpDate);
        jTextFieldPickUpDate.setBounds(680, 130, 120, 22);

        jTableReceiptPreOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Price", "TotalPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableReceiptPreOrder);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 490, 380);

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel8.setText("Customer Name: ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 160, 140, 30);

        jTextFieldCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCName);
        jTextFieldCName.setBounds(680, 160, 120, 22);

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel9.setText("Customer Number: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 190, 150, 30);
        jPanel1.add(jTextFieldCNumber);
        jTextFieldCNumber.setBounds(680, 190, 120, 22);

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel10.setText("Payment Method: ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(520, 220, 140, 30);

        jTextFieldPMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPMethodActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPMethod);
        jTextFieldPMethod.setBounds(680, 220, 120, 22);

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel11.setText("Mode: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(520, 260, 90, 30);
        jPanel1.add(jTextFieldPreorderMode);
        jTextFieldPreorderMode.setBounds(680, 260, 120, 22);

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel12.setText("Total Order: ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(520, 300, 130, 20);
        jPanel1.add(jTextFieldTotalPreOrder);
        jTextFieldTotalPreOrder.setBounds(680, 300, 120, 22);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setText("Note: Take a screenshot of your receipt!<3");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(110, 470, 270, 20);

        jTextFieldPreOrderDate.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jTextFieldPreOrderDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextFieldPreOrderDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jTextFieldPreOrderDate);
        jTextFieldPreOrderDate.setBounds(680, 80, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lasstttt.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 550);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCNameActionPerformed

    private void jTextFieldPMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPMethodActionPerformed

    private void jTextFieldPickUpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPickUpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPickUpDateActionPerformed

    
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
            java.util.logging.Logger.getLogger(PreOrderReceiptJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreOrderReceiptJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreOrderReceiptJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreOrderReceiptJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReceiptPreOrder;
    private javax.swing.JTextField jTextFieldCName;
    private javax.swing.JTextField jTextFieldCNumber;
    private javax.swing.JTextField jTextFieldPMethod;
    private javax.swing.JTextField jTextFieldPickUpDate;
    private javax.swing.JLabel jTextFieldPreOrderDate;
    private javax.swing.JTextField jTextFieldPreOrderID;
    private javax.swing.JTextField jTextFieldPreorderMode;
    private javax.swing.JTextField jTextFieldTotalPreOrder;
    // End of variables declaration//GEN-END:variables
}
