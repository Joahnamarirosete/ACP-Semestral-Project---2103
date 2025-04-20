
package UI;

import bakeshopsystem.OrderDatabase;
import DatabaseConnection.Database;
import bakeshopsystem.PreOrderDatabase;
import com.sun.jdi.connect.spi.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PreOrderJFrame extends javax.swing.JFrame {
    private JTextField jTextFielddate;  
    private Connection connection;
    private String pickUpDate;


    public PreOrderJFrame(String cartDetails, String total) {
        initComponents();
        setDateTime(); 
        setupPreOrderTable();
        ModeOrder.setText("Pre-Order");
        displayCartInTable(cartDetails);
        jTextFieldAmount.setText(total);
        displayPreOrderID();
        OrderDatabase orderBD = new OrderDatabase();
    }private void displayPreOrderID() {
      PreOrderDatabase db = new PreOrderDatabase();  
        int newPreOrderID = db.getLatestPreOrderIDFromDatabase() + 1;  
        orderIDField.setText(String.valueOf(newPreOrderID)); 
    }

      public void setupPreOrderTable() {
        String[] columns = {"ProductID", "Product","Qty", "Price", "TotalPrice"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        PreOrderTable.setModel(model);
    }
  public void displayCartInTable(String cartDetails) {
    String[] items = cartDetails.split("\n"); 
    DefaultTableModel model = (DefaultTableModel) PreOrderTable.getModel();
    model.setRowCount(0); 

    for (String item : items) {
        try {
            item = item.trim().replaceAll("\\s+", " ");
 
            String[] parts = item.split(" ");

            if (parts.length < 5) {
                System.out.println("Invalid row: " + item);
                continue; 
            }
            String productId = parts[0];

            StringBuilder productName = new StringBuilder();
            int i = 1;
            while (i < parts.length && !parts[i].matches("\\d+")) {
                productName.append(parts[i]).append(" ");
                i++;
            }
            String product = productName.toString().trim();

            String quantity = parts[i]; 
            String price = parts[i + 1]; 
            String totalPrice = parts[i + 2]; 

            model.addRow(new Object[]{productId, product, quantity, price, totalPrice});

        } catch (Exception e) {
            System.out.println("Error processing row: " + item);
            e.printStackTrace();
        }
    }
    }

     public void setTotalAmount(double totalAmount) {
        jTextFieldAmount.setText("Php " + totalAmount);  
    }
    private void setDateTime() {
        LocalDateTime now = LocalDateTime.now();
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        
        jLabelDateTime.setText(formattedDateTime);
    }
     public void setFulfillmentStatus(String status) {
        ModeOrder.setText(status);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPDate = new javax.swing.JTextField();
        orderIDField = new javax.swing.JTextField();
        CustomerNameTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        jTextFieldAmount = new javax.swing.JTextField();
        ModeOrder = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCheckBoxGcash = new javax.swing.JCheckBox();
        PlaceOrder = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        jCheckBoxCash = new javax.swing.JCheckBox();
        jLabelDateTime = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PreOrderTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(226, 213, 204));

        jPanel2.setBackground(new java.awt.Color(221, 203, 187));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel2.setText("Fill Up Information");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setText("Pre-Order Date/Time");

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel4.setText("Pick-Up Date");

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setText("Pre-Order ID");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel6.setText("Customer Name");

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel7.setText("Contact Number");

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel8.setText("Total Amount");

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel9.setText("Mode");

        orderIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel10.setText("Payment Method");

        jCheckBoxGcash.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jCheckBoxGcash.setText("GCash");
        jCheckBoxGcash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBoxGcash.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBoxGcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGcashActionPerformed(evt);
            }
        });

        PlaceOrder.setBackground(new java.awt.Color(210, 180, 140));
        PlaceOrder.setText("Place Order");
        PlaceOrder.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        PlaceOrder.setFocusPainted(false);
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        CancelBTN.setBackground(new java.awt.Color(210, 180, 140));
        CancelBTN.setText("Cancel");
        CancelBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CancelBTN.setFocusPainted(false);
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });

        jCheckBoxCash.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jCheckBoxCash.setText("Cash ");
        jCheckBoxCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxGcash, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxCash)))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPDate)
                                    .addComponent(orderIDField)
                                    .addComponent(CustomerNameTextField)
                                    .addComponent(phoneNumberTextField)
                                    .addComponent(jTextFieldAmount)
                                    .addComponent(ModeOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(PlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(CancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(orderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CustomerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ModeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jCheckBoxGcash)
                    .addComponent(jCheckBoxCash))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlaceOrder)
                    .addComponent(CancelBTN))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        PreOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ProductID", "ProductName", "Quantity", "Price", "TotalPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PreOrderTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxGcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGcashActionPerformed
       if (jCheckBoxGcash.isSelected()) {
        jCheckBoxCash.setSelected(false); 
    }
    }//GEN-LAST:event_jCheckBoxGcashActionPerformed

    private void jCheckBoxCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCashActionPerformed
        if (jCheckBoxCash.isSelected()) {
        jCheckBoxGcash.setSelected(false); 
    }
    }//GEN-LAST:event_jCheckBoxCashActionPerformed

    private void orderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIDFieldActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        PreOrderDatabase preorderDB = new PreOrderDatabase();

String preOrderID = orderIDField.getText(); 
String PreOrderDate = jLabelDateTime.getText();  
String PickUpDate = jTextFieldPDate.getText(); 
String CustomerName = CustomerNameTextField.getText();    
String PhoneNumber = phoneNumberTextField.getText();
String Mode = ModeOrder.getText();
if (preOrderID.isEmpty() || PreOrderDate.isEmpty() || PickUpDate.isEmpty() 
            || CustomerName.isEmpty() || PhoneNumber.isEmpty() || Mode.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Please fill out all required fields before placing an order.", 
                                          "Missing Information", JOptionPane.ERROR_MESSAGE);
            
            return; 
        }
String Status = "Pending"; 
String PaymentMethod = "";

if (jCheckBoxGcash.isSelected()) {
    PaymentMethod = "GCash";
} else if (jCheckBoxCash.isSelected()) {
    PaymentMethod = "Cash";
} else {
    JOptionPane.showMessageDialog(this, "Please select a payment method (GCash or Cash).", 
                                  "Payment Method Required", JOptionPane.WARNING_MESSAGE);
   
    return;
}

    

DefaultTableModel model = (DefaultTableModel) PreOrderTable.getModel();
int rowCount = model.getRowCount();

if (rowCount > 0) {
    preorderDB.savePreOrderDetails(
        Integer.parseInt(preOrderID), 
        PreOrderDate, 
        PickUpDate, 
        CustomerName, 
        PhoneNumber, 
        PaymentMethod, 
        Mode, 
        model
    );
    Object[][] rowData = new Object[rowCount][model.getColumnCount()];
    for (int i = 0; i < rowCount; i++) {
        for (int j = 0; j < model.getColumnCount(); j++) {
            rowData[i][j] = model.getValueAt(i, j);
        }
    }

    PreOrderReceiptJFrame preOrderReceiptFrame = new PreOrderReceiptJFrame(
        rowData, 
        PickUpDate, 
        CustomerName, 
        PreOrderDate, 
        PhoneNumber, 
        PaymentMethod, 
        preOrderID
    );
    preOrderReceiptFrame.setVisible(true);

} else {
    JOptionPane.showMessageDialog(null, "No items in the order table. Please add products before placing an order.");
this.dispose();
}

    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        ProductJFrame product = new ProductJFrame();
        product.setVisible(true);
    }//GEN-LAST:event_CancelBTNActionPerformed

    
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
            java.util.logging.Logger.getLogger(PreOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreOrderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton CancelBTN;
    private javax.swing.JTextField CustomerNameTextField;
    private javax.swing.JTextField ModeOrder;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JTable PreOrderTable;
    private javax.swing.JCheckBox jCheckBoxCash;
    private javax.swing.JCheckBox jCheckBoxGcash;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldPDate;
    private javax.swing.JTextField orderIDField;
    private javax.swing.JTextField phoneNumberTextField;
    // End of variables declaration//GEN-END:variables
}
