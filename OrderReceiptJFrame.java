package UI;

import bakeshopsystem.OrderDatabase;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

public class OrderReceiptJFrame extends javax.swing.JFrame {
 
   public OrderReceiptJFrame(Object[][] rowData, String PaymentMethod, String orderId) {
        initComponents();
        jTextFieldOrderID.setText(orderId);
        jTextFieldOrderMode.setText("Order");
       LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        
         DefaultTableModel tableModel = new DefaultTableModel(rowData, new Object[] { 
            "Product ID", "Product Name", "Quantity", "Price", "Total Price"
         });
        jTableOrderReceipt.setModel(tableModel);
        jLabelDateTime.setText(formattedDate); 
        double totalAmount = calculateTotalAmount(); 
        setTotalAmount(totalAmount);
        jTextFieldPayMethod.setText(PaymentMethod);
    }
    private double calculateTotalAmount() {
        double totalAmount = 0.0;
        DefaultTableModel model = (DefaultTableModel) jTableOrderReceipt.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            double totalPrice = Double.parseDouble(model.getValueAt(i, 4).toString()); 
            totalAmount += totalPrice; 
        }

        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        jTextFieldReceiptOrder.setText("Php " + totalAmount); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrderReceipt = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPayMethod = new javax.swing.JTextField();
        jTextFieldOrderID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldOrderMode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldReceiptOrder = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabelDateTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel1.setText("PHIKUL TASTE BAKESHOP");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 200, 30);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("RECEIPT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 80, 70, 20);

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel3.setText("Order ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 30, 100, 14);

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel4.setText("Order Date/Time: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 50, 150, 14);

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel5.setText("MOP: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 80, 110, 14);

        jTableOrderReceipt.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableOrderReceipt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 420, 290);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("Note: Take a screenshot of your receipt!<3");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 500, 290, 20);

        jTextFieldPayMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPayMethodActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPayMethod);
        jTextFieldPayMethod.setBounds(340, 80, 100, 22);

        jTextFieldOrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOrderIDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldOrderID);
        jTextFieldOrderID.setBounds(340, 20, 100, 22);

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel8.setText("Mode: ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 110, 90, 14);

        jTextFieldOrderMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOrderModeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldOrderMode);
        jTextFieldOrderMode.setBounds(340, 110, 100, 22);

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel9.setText("Total Order: ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(240, 460, 100, 20);

        jTextFieldReceiptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReceiptOrderActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldReceiptOrder);
        jTextFieldReceiptOrder.setBounds(334, 460, 80, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel10.setText("Thanks for your Order!");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 480, 170, 20);
        jPanel1.add(jLabelDateTime);
        jLabelDateTime.setBounds(340, 50, 120, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lastttt.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 460, 540);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 541));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPayMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPayMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPayMethodActionPerformed

    private void jTextFieldOrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOrderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOrderIDActionPerformed

    private void jTextFieldReceiptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReceiptOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReceiptOrderActionPerformed

    private void jTextFieldOrderModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOrderModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOrderModeActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDateTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrderReceipt;
    private javax.swing.JTextField jTextFieldOrderID;
    private javax.swing.JTextField jTextFieldOrderMode;
    private javax.swing.JTextField jTextFieldPayMethod;
    private javax.swing.JTextField jTextFieldReceiptOrder;
    // End of variables declaration//GEN-END:variables
}
