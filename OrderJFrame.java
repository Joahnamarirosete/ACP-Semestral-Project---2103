
package UI;

import bakeshopsystem.OrderDatabase;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import bakeshopsystem.ProductBSS;

public class OrderJFrame extends javax.swing.JFrame {
    private String paymentMethod;

    
    public OrderJFrame(String cartDetails) {
        initComponents();
        displayCartInTable(cartDetails);
        modeorder.setText("Order");
        displayOrderID();
        
        LocalDateTime now = LocalDateTime.now();
        
        double totalAmount = calculateTotalAmount(); 
        
        setTotalAmount(totalAmount);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        jLabelDateTime.setText(formattedDate);
    }
    private double calculateTotalAmount() {
        double totalAmount = 0.0;
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            double totalPrice = Double.parseDouble(model.getValueAt(i, 4).toString()); 
            totalAmount += totalPrice; 
        }

        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        jTextFieldTotalOrder.setText("Php " + totalAmount); 
    }

    private void displayOrderID() {
        OrderDatabase db = new OrderDatabase();
        int newOrderID = db.getLatestOrderIDFromDatabase() + 1;
        OrderID.setText(String.valueOf(newOrderID));
    }

    public void displayCartInTable(String cartDetails) {
    String[] items = cartDetails.split("\n"); 
    DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        OrderID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxcash = new javax.swing.JCheckBox();
        jCheckBoxgcash = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        modeorder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        PlaceOrder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTotalOrder = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelDateTime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel3.setText("Order ID: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 20, 64, 27);

        OrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIDActionPerformed(evt);
            }
        });
        jPanel1.add(OrderID);
        OrderID.setBounds(120, 20, 90, 22);

        jLabel2.setText("Order Date/Time: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 30, 110, 27);

        jCheckBoxcash.setText("Cash");
        jCheckBoxcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxcashActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxcash);
        jCheckBoxcash.setBounds(620, 70, 65, 20);

        jCheckBoxgcash.setText("Gcash");
        jCheckBoxgcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxgcashActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxgcash);
        jCheckBoxgcash.setBounds(540, 70, 70, 20);

        jLabel4.setText("Payment Mode: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 70, 97, 27);

        modeorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeorderActionPerformed(evt);
            }
        });
        jPanel1.add(modeorder);
        modeorder.setBounds(120, 60, 90, 22);

        jLabel1.setText("Mode: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 60, 64, 27);

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product", "Qty.", "Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(OrderTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 780, 360);

        PlaceOrder.setBackground(new java.awt.Color(210, 180, 140));
        PlaceOrder.setText("PLACE ORDER");
        PlaceOrder.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        PlaceOrder.setFocusPainted(false);
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });
        jPanel1.add(PlaceOrder);
        PlaceOrder.setBounds(320, 500, 130, 33);

        jLabel6.setText("Total Order: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 480, 80, 20);

        jTextFieldTotalOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalOrderActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTotalOrder);
        jTextFieldTotalOrder.setBounds(620, 480, 90, 22);

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
        jButton1.setBounds(700, 10, 60, 22);

        jLabelDateTime.setLabelFor(jLabel2);
        jPanel1.add(jLabelDateTime);
        jLabelDateTime.setBounds(540, 30, 130, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/itoayorder.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 550);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modeorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeorderActionPerformed

    private void OrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIDActionPerformed

    private void jCheckBoxcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxcashActionPerformed
        if (jCheckBoxcash.isSelected()) {
        jCheckBoxgcash.setSelected(false); 
         }
    }//GEN-LAST:event_jCheckBoxcashActionPerformed

    private void jCheckBoxgcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxgcashActionPerformed
        if (jCheckBoxgcash.isSelected()) {
        jCheckBoxcash.setSelected(false); 
         }
    }//GEN-LAST:event_jCheckBoxgcashActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
       OrderDatabase orderDB = new OrderDatabase();
int orderID = 0;  


try {
    orderID = Integer.parseInt(OrderID.getText());  
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Invalid Order ID.", "Error", JOptionPane.ERROR_MESSAGE);
    return;  
}

String OrderDate = jLabelDateTime.getText();
String Mode = modeorder.getText();
String PaymentMethod = "";

if (jCheckBoxgcash.isSelected()) {
    PaymentMethod = "GCash";
} else if (jCheckBoxcash.isSelected()) {
    PaymentMethod = "Cash";
} else {
    JOptionPane.showMessageDialog(this, "Please select a payment method (GCash or Cash).", 
                                  "Payment Method Required", JOptionPane.WARNING_MESSAGE);
    return; 
}


DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
int rowCount = model.getRowCount();


Object[][] rowData = new Object[rowCount][model.getColumnCount()];
for (int i = 0; i < rowCount; i++) {
    for (int j = 0; j < model.getColumnCount(); j++) {
        rowData[i][j] = model.getValueAt(i, j);
    }
}


orderDB.saveOrderDetails(orderID, OrderDate, PaymentMethod, Mode, model);


OrderReceiptJFrame receiptFrame = new OrderReceiptJFrame(rowData, PaymentMethod, String.valueOf(orderID));
receiptFrame.setVisible(true);


this.dispose();
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void jTextFieldTotalOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProductJFrame product = new ProductJFrame();
        product.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OrderID;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxcash;
    private javax.swing.JCheckBox jCheckBoxgcash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDateTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldTotalOrder;
    private javax.swing.JTextField modeorder;
    // End of variables declaration//GEN-END:variables
}
