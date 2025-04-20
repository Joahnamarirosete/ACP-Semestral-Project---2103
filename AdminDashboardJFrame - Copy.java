package UI;

import bakeshopsystem.CancelOrder;
import bakeshopsystem.OrderDatabase;
import bakeshopsystem.PreOrderDatabase;
import bakeshopsystem.ProductBSS;
import bakeshopsystem.ProductDatabase;
import bakeshopsystem.SalesDatabase;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AdminDashboardJFrame extends javax.swing.JFrame {
    private OrderDatabase orderDatabase;
    private PreOrderDatabase preorderDatabase;
    private ProductBSS productbss;
    private SalesDatabase salesdatabase;
    
    private JTable OrdersTable;
    private JTable ProductTable;
    private JTextField approveOrderID;
    private JTextField approveProductID;
    private JTextField approvePreOrderID;
    private JTextField preproductID;

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bakeshopsystem";  
        String user = "root"; 
        String password = "";  
        return DriverManager.getConnection(url, user, password); 
    }

    public AdminDashboardJFrame() {
    initComponents();  

    orderDatabase = new OrderDatabase(); 
    preorderDatabase = new PreOrderDatabase();
    productbss = new ProductBSS();

    OrdersTable = new JTable();
    OrdersTable.setModel(new DefaultTableModel()); 
    
    salesdatabase = new SalesDatabase();
    salesdatabase.loadCakeSalesData(cakesales,  RatingCake,  TotalQuantityCakes, TotalSoldCakes);
    salesdatabase.loadCupCakeSalesData(cupcakesales,  RatingCupCake,  TotalQuantityCupCakes, TotalSoldCupCakes);
    salesdatabase.loadCheeseCakeSalesData(cheesecakesales,  RatingCheeseCake,  TotalQuantityCheeseCakes, TotalSoldCheeseCakes);
    salesdatabase.loadCookiesSalesData(cookiessales,  RatingCookies,  TotalQuantityCookies, TotalSoldCookies);
    salesdatabase.loadMuffinsSalesData(muffinssales,  RatingMuffins,  TotalQuantityMuffins, TotalSoldMuffins);
    salesdatabase.loadCinnamonSalesData(cinnamonsales,  RatingCinnamon,  TotalQuantityCinnamon, TotalSoldCinnamon);
    
    loadOrders();  
    loadPreOrders();  
    loadProducts();  

    setupOrderTableSelectionListener(OrderTable, approveOrderID, approveProductID);
    setupPreOrderTableSelectionListener(PreOrderTable, approvePreOrderID, approveProductID);
    setupProductStocksSelectionListener(ProductsTable, preproductID);

      
    }
    private void loadOrders() {
        if (orderDatabase != null) {
            orderDatabase.loadOrdersToTable(OrderTable); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Database handler is not initialized.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    private void loadPreOrders() {
        if (preorderDatabase != null) { 
            preorderDatabase.loadPreOrdersToTable(PreOrderTable); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Database handler is not initialized.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    private void loadProducts() {
        if (productbss != null) { 
            productbss.loadProductsToTable(ProductsTable); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Database handler is not initialized.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
     private void setupOrderTableSelectionListener(JTable OrderTable, JTextField approveOrderID, JTextField approveProductID) {
    OrderTable.getSelectionModel().addListSelectionListener(event -> {
        if (!event.getValueIsAdjusting()) { 
            int selectedRow = OrderTable.getSelectedRow();
            if (selectedRow != -1) {
                // Assuming the first column contains OrderID and second contains ProductID
                String OrderID = OrderTable.getValueAt(selectedRow, 0).toString(); 
                String ProductID = OrderTable.getValueAt(selectedRow, 2).toString(); 
                ApproveOrderID.setText(OrderID);
                ApproveProductID.setText(ProductID);
            }
        }
    });
     }
       private void setupPreOrderTableSelectionListener(JTable PreOrderTable, JTextField approvePreOrderID, JTextField approveProductID) {
        PreOrderTable.getSelectionModel().addListSelectionListener(event -> {
        if (!event.getValueIsAdjusting()) { 
            int selectedRow = PreOrderTable.getSelectedRow();
            if (selectedRow != -1) {
                // Assuming the first column contains OrderID and second contains ProductID
                String PreOrderID = PreOrderTable.getValueAt(selectedRow, 0).toString(); 
                String ProductID = PreOrderTable.getValueAt(selectedRow, 5).toString(); 
                ApprovePreOrderID1.setText(PreOrderID);
                ApprovePrreProduct.setText(ProductID);
            }
        }
    });
     }
        private void setupProductStocksSelectionListener(JTable ProductsTable, JTextField preroductID) {
        ProductsTable.getSelectionModel().addListSelectionListener(event -> {
        if (!event.getValueIsAdjusting()) { 
            int selectedRow = ProductsTable.getSelectedRow();
            if (selectedRow != -1) {
                String preproductID = ProductsTable.getValueAt(selectedRow, 0).toString(); 
                ProductID.setText(preproductID);
            }
        }
    });
        
        }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ApproveProductID = new javax.swing.JTextField();
        ApproveOrder = new javax.swing.JButton();
        ApproveOrderID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CancelBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PreOrderTable = new javax.swing.JTable();
        ApprovePreOrder = new javax.swing.JButton();
        ApprovePreOrderID1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CancelPreorderBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ApprovePrreProduct = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        ProductID = new javax.swing.JTextField();
        QuantityStocks = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cakesales = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RatingCake = new javax.swing.JLabel();
        TotalQuantityCakes = new javax.swing.JLabel();
        TotalSoldCakes = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        cupcakesales = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        RatingCupCake = new javax.swing.JLabel();
        TotalQuantityCupCakes = new javax.swing.JLabel();
        TotalSoldCupCakes = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        cheesecakesales = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        RatingCheeseCake = new javax.swing.JLabel();
        TotalQuantityCheeseCakes = new javax.swing.JLabel();
        TotalSoldCheeseCakes = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        cookiessales = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        RatingCookies = new javax.swing.JLabel();
        TotalQuantityCookies = new javax.swing.JLabel();
        TotalSoldCookies = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        muffinssales = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        RatingMuffins = new javax.swing.JLabel();
        TotalQuantityMuffins = new javax.swing.JLabel();
        TotalSoldMuffins = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        cinnamonsales = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        RatingCinnamon = new javax.swing.JLabel();
        TotalQuantityCinnamon = new javax.swing.JLabel();
        TotalSoldCinnamon = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(226, 213, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(221, 203, 187));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jButton1.setBackground(new java.awt.Color(210, 180, 140));
        jButton1.setText("ORDER");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(210, 180, 140));
        jButton2.setText("STOCKS");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(210, 180, 140));
        jButton4.setText("PRE-ORDER");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(210, 180, 140));
        jButton6.setText("BACK");
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(210, 180, 140));
        jButton3.setText("SALES");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton6)
                .addGap(102, 102, 102)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 130, -1));

        OrderTable.setBackground(new java.awt.Color(221, 203, 187));
        OrderTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Order Date", "Product ID", "Product Name", "Quantity", "Price", "Total Price", "Mode", "PaymentMethod", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(OrderTable);

        jLabel1.setText("Product ID: ");

        ApproveOrder.setBackground(new java.awt.Color(210, 180, 140));
        ApproveOrder.setText("APPROVED ORDER");
        ApproveOrder.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        ApproveOrder.setFocusPainted(false);
        ApproveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveOrderActionPerformed(evt);
            }
        });

        jLabel3.setText("Order ID: ");

        CancelBTN.setBackground(new java.awt.Color(210, 180, 140));
        CancelBTN.setText("CANCEL ORDER");
        CancelBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CancelBTN.setFocusPainted(false);
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(557, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApproveOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApproveProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ApproveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ApproveOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ApproveOrder)
                        .addComponent(ApproveProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CancelBTN)))
                .addGap(19, 19, 19))
        );

        jTabbedPane3.addTab("tab1", jPanel2);

        PreOrderTable.setBackground(new java.awt.Color(221, 203, 187));
        PreOrderTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PreOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pre-Order ID", "Pre-Order Date", "PickUpDate", "Customer Name", "Phone Number", "Product ID", "Product Name", "Quantity", "Price", "Total Price", "Payment Method", "Mode", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PreOrderTable);

        ApprovePreOrder.setBackground(new java.awt.Color(210, 180, 140));
        ApprovePreOrder.setText("APPROVED PRE-ORDER");
        ApprovePreOrder.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        ApprovePreOrder.setFocusPainted(false);
        ApprovePreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApprovePreOrderActionPerformed(evt);
            }
        });

        jLabel2.setText("Pre-Order ID: ");

        CancelPreorderBTN.setBackground(new java.awt.Color(210, 180, 140));
        CancelPreorderBTN.setText("CANCEL PRE-ORDER");
        CancelPreorderBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CancelPreorderBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelPreorderBTNActionPerformed(evt);
            }
        });

        jLabel4.setText("Product ID: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ApprovePreOrderID1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApprovePrreProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ApprovePreOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelPreorderBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ApprovePreOrderID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ApprovePrreProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ApprovePreOrder)
                        .addComponent(CancelPreorderBTN)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab2", jPanel3);

        ProductsTable.setBackground(new java.awt.Color(221, 203, 187));
        ProductsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Category", "Product Flavor", "ProductPcs", "Product Price", "StocksperBox"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(ProductsTable);

        jButton5.setBackground(new java.awt.Color(210, 180, 140));
        jButton5.setText("RESTOCK");
        jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantity");

        jLabel6.setText("Product ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(QuantityStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 217, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jTabbedPane3.addTab("tab4", jPanel5);

        jTabbedPane1.setBackground(new java.awt.Color(221, 203, 187));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel6.setBackground(new java.awt.Color(221, 203, 187));

        cakesales.setBackground(new java.awt.Color(221, 203, 187));
        cakesales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "ProductName", "Total Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(cakesales);

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel7.setText("Top Rating Cake:");

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel8.setText("Total Quantity: ");

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel9.setText("Total Amount: ");

        RatingCake.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        RatingCake.setText("jLabel10");

        TotalQuantityCakes.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalQuantityCakes.setText("jLabel11");

        TotalSoldCakes.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalSoldCakes.setText("jLabel12");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalQuantityCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCake, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSoldCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 211, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCake, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSoldCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cake", jPanel6);

        jPanel8.setBackground(new java.awt.Color(221, 203, 187));

        cupcakesales.setBackground(new java.awt.Color(221, 203, 187));
        cupcakesales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Total Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(cupcakesales);

        jLabel16.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel16.setText("Top Rating Cake:");

        RatingCupCake.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        RatingCupCake.setText("jLabel10");

        TotalQuantityCupCakes.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalQuantityCupCakes.setText("jLabel11");

        TotalSoldCupCakes.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalSoldCupCakes.setText("jLabel12");

        jLabel17.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel17.setText("Total Quantity: ");

        jLabel18.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel18.setText("Total Amount: ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalSoldCupCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCupCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCupCake, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 230, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCupCake, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCupCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSoldCupCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CupCakes", jPanel8);

        jPanel9.setBackground(new java.awt.Color(221, 203, 187));

        cheesecakesales.setBackground(new java.awt.Color(221, 203, 187));
        cheesecakesales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Total Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(cheesecakesales);

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel13.setText("Top Rating Cake:");

        RatingCheeseCake.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        RatingCheeseCake.setText("jLabel10");

        TotalQuantityCheeseCakes.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalQuantityCheeseCakes.setText("jLabel11");

        TotalSoldCheeseCakes.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalSoldCheeseCakes.setText("jLabel12");

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel14.setText("Total Quantity: ");

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel15.setText("Total Amount: ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalSoldCheeseCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCheeseCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCheeseCake, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 257, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCheeseCake, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCheeseCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSoldCheeseCakes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cheese Cakes", jPanel9);

        jPanel10.setBackground(new java.awt.Color(221, 203, 187));

        cookiessales.setBackground(new java.awt.Color(221, 203, 187));
        cookiessales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Total Quantity", "Total Amount"
            }
        ));
        jScrollPane7.setViewportView(cookiessales);

        jLabel19.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel19.setText("Top Rating Cake:");

        RatingCookies.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        RatingCookies.setText("jLabel10");

        TotalQuantityCookies.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalQuantityCookies.setText("jLabel11");

        TotalSoldCookies.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalSoldCookies.setText("jLabel12");

        jLabel20.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel20.setText("Total Quantity: ");

        jLabel21.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel21.setText("Total Amount: ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalSoldCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 263, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSoldCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cookies", jPanel10);

        jPanel11.setBackground(new java.awt.Color(221, 203, 187));

        muffinssales.setBackground(new java.awt.Color(221, 203, 187));
        muffinssales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Total Quantity", "Total Amount"
            }
        ));
        jScrollPane8.setViewportView(muffinssales);

        jLabel22.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel22.setText("Top Rating Cake:");

        RatingMuffins.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        RatingMuffins.setText("jLabel10");

        TotalQuantityMuffins.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalQuantityMuffins.setText("jLabel11");

        TotalSoldMuffins.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalSoldMuffins.setText("jLabel12");

        jLabel23.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel23.setText("Total Quantity: ");

        jLabel24.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel24.setText("Total Amount: ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalSoldMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 243, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSoldMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Muffins", jPanel11);

        jPanel12.setBackground(new java.awt.Color(221, 203, 187));

        cinnamonsales.setBackground(new java.awt.Color(221, 203, 187));
        cinnamonsales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "TotalQuantity", "TotalAmount"
            }
        ));
        jScrollPane9.setViewportView(cinnamonsales);

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel10.setText("Top Rating Cake:");

        RatingCinnamon.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        RatingCinnamon.setText("jLabel10");

        TotalQuantityCinnamon.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalQuantityCinnamon.setText("jLabel11");

        TotalSoldCinnamon.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        TotalSoldCinnamon.setText("jLabel12");

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel11.setText("Total Quantity: ");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel12.setText("Total Amount: ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalSoldCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 231, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantityCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSoldCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 211, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cinnamon Rolls", jPanel12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane3.addTab("tab3", jPanel4);

        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, -32, -1, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ApproveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveOrderActionPerformed
        String orderIdText = ApproveOrderID.getText();
        String productIdText = ApproveProductID.getText();

if (orderIdText.isEmpty() || productIdText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please provide both OrderID and ProductID.");
    return;
}

try {
    int orderId = Integer.parseInt(orderIdText);
    int productId = Integer.parseInt(productIdText);
    
    OrderDatabase orderDB = new OrderDatabase();
    orderDB.approveOrderAndReduceStock(orderId, productId);  
     
    //BAGONG EDIT
      int selectedRow = OrderTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order from the table.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int orderID = Integer.parseInt(OrderTable.getValueAt(selectedRow, 0).toString()); 
    String orderDate = OrderTable.getValueAt(selectedRow, 1).toString(); 
    int productID = Integer.parseInt(OrderTable.getValueAt(selectedRow, 2).toString()); 
    String productName = OrderTable.getValueAt(selectedRow, 3).toString(); 
    int quantity = Integer.parseInt(OrderTable.getValueAt(selectedRow, 4).toString()); 
    double totalPrice = Double.parseDouble(OrderTable.getValueAt(selectedRow, 6).toString());
    String paymentMethod = OrderTable.getValueAt(selectedRow, 8).toString();
    String orderType = "Order"; 

    SalesDatabase salesDB = new SalesDatabase();
    String productCategory = salesDB.getProductCategoryByProductID(productID);
    
     if (productCategory.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Category not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (productCategory.equalsIgnoreCase("Cake")) {
            salesDB.insertCakeOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        } else if (productCategory.equalsIgnoreCase("Cup Cake")) {
            salesDB.insertCupCakeOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        }  else if (productCategory.equalsIgnoreCase("Cheese Cake")) {
            salesDB.insertCheeseCakeOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        } else if (productCategory.equalsIgnoreCase("Cookies")) {
            salesDB.insertCookiesOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        } else if (productCategory.equalsIgnoreCase("Muffin")) {
            salesDB.insertMuffinsOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        } else if (productCategory.equalsIgnoreCase("Cinnamon Roll")) {
            salesDB.insertCinnamonOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        }
        
        
        
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid ID format. Please enter valid numbers for OrderID and ProductID.");
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage());
}
    }//GEN-LAST:event_ApproveOrderActionPerformed

    private void ApprovePreOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApprovePreOrderActionPerformed
      String preorderIdText = ApprovePreOrderID1.getText();
        String productIdText = ApprovePrreProduct.getText();

if (preorderIdText.isEmpty() || productIdText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please provide both OrderID and ProductID.");
    return;
}
    
try {
    int preorderId = Integer.parseInt(preorderIdText);
    int productId = Integer.parseInt(productIdText);
    PreOrderDatabase preorderDB = new PreOrderDatabase();
    preorderDB.approvePreOrderAndReduceStock(preorderId, productId);
     
      //BAGONG EDIT
      int selectedRow = PreOrderTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order from the table.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int orderID = Integer.parseInt(PreOrderTable.getValueAt(selectedRow, 0).toString()); 
    String orderDate = PreOrderTable.getValueAt(selectedRow, 1).toString(); 
    int productID = Integer.parseInt(PreOrderTable.getValueAt(selectedRow, 5).toString()); 
    String productName = PreOrderTable.getValueAt(selectedRow, 6).toString(); 
    int quantity = Integer.parseInt(PreOrderTable.getValueAt(selectedRow, 7).toString()); 
    double totalPrice = Double.parseDouble(PreOrderTable.getValueAt(selectedRow, 9).toString());
    String paymentMethod = PreOrderTable.getValueAt(selectedRow, 10).toString();
    String orderType = "Pre-Order"; 

    SalesDatabase salesDB = new SalesDatabase();
    String productCategory = salesDB.getProductCategoryByProductID(productID);
    
     if (productCategory.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Category not found in the database.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (productCategory.equalsIgnoreCase("Cake")) {
            salesDB.insertCakeOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        }else if (productCategory.equalsIgnoreCase("Cup Cake")) {
            salesDB.insertCupCakeOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        } else if (productCategory.equalsIgnoreCase("Cheese Cake")) {
            salesDB.insertCheeseCakeOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        } else if (productCategory.equalsIgnoreCase("Cookies")) {
            salesDB.insertCookiesOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        }  else if (productCategory.equalsIgnoreCase("Muffin")) {
            salesDB.insertMuffinsOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        }  else if (productCategory.equalsIgnoreCase("Cinnamon Roll")) {
            salesDB.insertCinnamonOrder(orderID, orderDate, productID, productName, productCategory, quantity, totalPrice, paymentMethod, orderType);
        }
     
 } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid ID format. Please enter valid numbers for OrderID and ProductID.");
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
}

    }//GEN-LAST:event_ApprovePreOrderActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        String preorderId = ApproveOrderID.getText();
        String productIdText = ApproveProductID.getText();
    
    if (preorderId.isEmpty() || productIdText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please provide both OrderID and ProductID.");
        return;
    }

    try {
        int productId = Integer.parseInt(productIdText);
        
        CancelOrder cancel = new CancelOrder();
        
        cancel.cancelOrder(preorderId, productId);
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid ProductID. Please enter a valid number for ProductID.");
    }
    }//GEN-LAST:event_CancelBTNActionPerformed

    private void CancelPreorderBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelPreorderBTNActionPerformed
        String preorderId = ApprovePreOrderID1.getText();
    String preproductIdText = ApprovePrreProduct.getText();
    
    if (preorderId.isEmpty() || preproductIdText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please provide both OrderID and ProductID.");
        return;
    }

    try {
        int productId = Integer.parseInt(preproductIdText);
        
        CancelOrder cancel = new CancelOrder();
        
        cancel.cancelPreOrder(preorderId, productId);
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid ProductID. Please enter a valid number for ProductID.");
    }
    }//GEN-LAST:event_CancelPreorderBTNActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String productIdText = ProductID.getText().trim();
            String quantityText = QuantityStocks.getText().trim();

if (productIdText.isEmpty() || quantityText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please provide both ProductID and Quantity.");
    return;
}

try {
    int quantityToAdd = Integer.parseInt(quantityText);

    if (quantityToAdd <= 0) {
        JOptionPane.showMessageDialog(null, "Quantity must be greater than zero.");
        return;
    }

    ProductDatabase productDB = new ProductDatabase();
    productDB.restockProduct(productIdText, quantityToAdd);

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid quantity format. Please enter a valid number for Quantity.");
}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       RoleJFrame role = new RoleJFrame();
       role.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(AdminDashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboardJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproveOrder;
    private javax.swing.JTextField ApproveOrderID;
    private javax.swing.JButton ApprovePreOrder;
    private javax.swing.JTextField ApprovePreOrderID1;
    private javax.swing.JTextField ApproveProductID;
    private javax.swing.JTextField ApprovePrreProduct;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JButton CancelPreorderBTN;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTable PreOrderTable;
    private javax.swing.JTextField ProductID;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JTextField QuantityStocks;
    private javax.swing.JLabel RatingCake;
    private javax.swing.JLabel RatingCheeseCake;
    private javax.swing.JLabel RatingCinnamon;
    private javax.swing.JLabel RatingCookies;
    private javax.swing.JLabel RatingCupCake;
    private javax.swing.JLabel RatingMuffins;
    private javax.swing.JLabel TotalQuantityCakes;
    private javax.swing.JLabel TotalQuantityCheeseCakes;
    private javax.swing.JLabel TotalQuantityCinnamon;
    private javax.swing.JLabel TotalQuantityCookies;
    private javax.swing.JLabel TotalQuantityCupCakes;
    private javax.swing.JLabel TotalQuantityMuffins;
    private javax.swing.JLabel TotalSoldCakes;
    private javax.swing.JLabel TotalSoldCheeseCakes;
    private javax.swing.JLabel TotalSoldCinnamon;
    private javax.swing.JLabel TotalSoldCookies;
    private javax.swing.JLabel TotalSoldCupCakes;
    private javax.swing.JLabel TotalSoldMuffins;
    private javax.swing.JTable cakesales;
    private javax.swing.JTable cheesecakesales;
    private javax.swing.JTable cinnamonsales;
    private javax.swing.JTable cookiessales;
    private javax.swing.JTable cupcakesales;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable muffinssales;
    // End of variables declaration//GEN-END:variables
}
