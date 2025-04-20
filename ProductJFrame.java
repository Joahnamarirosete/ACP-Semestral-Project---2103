

package UI;

import DatabaseConnection.Database;
import bakeshopsystem.OrderDatabase;
import bakeshopsystem.Product;
import bakeshopsystem.ProductDatabase;
import java.awt.event.ActionEvent;
import java.sql.Connection;    
import java.sql.DriverManager; 
import java.sql.ResultSet;     
import java.sql.SQLException;  
import java.sql.Statement;  
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import bakeshopsystem.ProductBSS;
import UI.TypeOfOrderJFrame;
import javax.swing.JComboBox;



public class ProductJFrame extends javax.swing.JFrame {
        
        private PreOrderJFrame paymentFrame;
        private ProductBSS productBSS;
        private String typeOfOrder;
        private String ProductID;
        private String cartDetails;
        private String total;
    
    public ProductJFrame() {
        initComponents();
        this.productBSS = new ProductBSS();
    }
        public void setTypeOfOrder(String typeOfOrder) {
        this.typeOfOrder = typeOfOrder;
        }

         private void displayCartDetails() {
            String cartDetails = productBSS.getCartDetails(jTextAreaCart);
            System.out.println("Cart Details: " + cartDetails);
        }
        private void calculateTotal() {
            double grandTotal = productBSS.calculateTotal(jTextAreaCart);
            textFieldTotal.setText(String.format("%.2f", grandTotal)); 
        }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chocoCakeMinus = new javax.swing.JButton();
        jTextFieldChocoCake = new javax.swing.JTextField();
        chocoCakeAdd = new javax.swing.JButton();
        chocoCakeTray = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vanCakeMinus = new javax.swing.JButton();
        jTextFieldvanCake = new javax.swing.JTextField();
        vanCakeAdd = new javax.swing.JButton();
        vanCakeTray = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        redCakeMinus = new javax.swing.JButton();
        jTextFieldredCake = new javax.swing.JTextField();
        redCakeAdd = new javax.swing.JButton();
        redCakeTray5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        carrotCakeMinus = new javax.swing.JButton();
        jTextFieldCarrotCake = new javax.swing.JTextField();
        carrotCakeAdd = new javax.swing.JButton();
        carrotCakeTray8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lemonCakeMinus = new javax.swing.JButton();
        jTextFieldLemonCake = new javax.swing.JTextField();
        lemonCakeAdd = new javax.swing.JButton();
        lemonCakeTray7 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        classVanCupcakeMinus = new javax.swing.JButton();
        jTextFieldClassVanCupcake = new javax.swing.JTextField();
        classVanCupcakeAdd = new javax.swing.JButton();
        classVanCupcakeTray = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        chocoCupcakeMinus = new javax.swing.JButton();
        jTextFieldChocoCupcake = new javax.swing.JTextField();
        chocoCupcakeAdd = new javax.swing.JButton();
        chocoCupcakeTray = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        redCupcakeMinus = new javax.swing.JButton();
        jTextFieldRedCupcake = new javax.swing.JTextField();
        redCupcakeAdd = new javax.swing.JButton();
        redCupcakeTray = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ubeCakeMinus = new javax.swing.JButton();
        jTextFieldUbeCake = new javax.swing.JTextField();
        ubeCakeAdd = new javax.swing.JButton();
        ubeCakeTray = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        saltedCarCupcakeMinus = new javax.swing.JButton();
        jTextFieldSaltedCarCupcake = new javax.swing.JTextField();
        saltedCarCupcakeAdd = new javax.swing.JButton();
        saltedCarCupcakeTray = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        peanutButterCupcakeMinus = new javax.swing.JButton();
        jTextFieldPeanutButterCupcake = new javax.swing.JTextField();
        peanutButterCupcakeAdd = new javax.swing.JButton();
        peanutButterCupcakeTray = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        matchaCupcakeMinus = new javax.swing.JButton();
        jTextFieldMatchaCupcake = new javax.swing.JTextField();
        matchaCupcakeAdd = new javax.swing.JButton();
        matchaCupcakeTray = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        classicNewMinus = new javax.swing.JButton();
        jTextFieldClassicNew = new javax.swing.JTextField();
        classicNewAdd = new javax.swing.JButton();
        classicNewTray = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        noBakeMinus = new javax.swing.JButton();
        jTextFieldNoBake = new javax.swing.JTextField();
        noBakeAdd = new javax.swing.JButton();
        noBakeTray = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        chocoCheeseMinus = new javax.swing.JButton();
        jTextFieldChocoCheese = new javax.swing.JTextField();
        chocoCheeseAdd = new javax.swing.JButton();
        chocoCheeseTray = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        pumpCheeseMinus = new javax.swing.JButton();
        jTextFieldPumpCheese = new javax.swing.JTextField();
        pumpCheeseAdd = new javax.swing.JButton();
        pumpCheeseTray = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        japanCheeseMinus = new javax.swing.JButton();
        jTextFieldJapanCheese = new javax.swing.JTextField();
        japanCheeseAdd = new javax.swing.JButton();
        japanCheeseTray = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        caramelCheeseMinus = new javax.swing.JButton();
        jTextFieldCaramelCheese = new javax.swing.JTextField();
        caramelCheeseAdd = new javax.swing.JButton();
        caramelCheeseTray = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        chocoCookiesMinus = new javax.swing.JButton();
        jTextFieldChocoCookies = new javax.swing.JTextField();
        chocoCookiesAdd = new javax.swing.JButton();
        chocoCookiesTray = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        oatCookiesMinus = new javax.swing.JButton();
        jTextFieldOatCookies = new javax.swing.JTextField();
        oatCookiesAdd = new javax.swing.JButton();
        oatCookiesTray = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        doubleCookiesMinus = new javax.swing.JButton();
        jTextFieldDoubleCookies = new javax.swing.JTextField();
        doubleCookiesAdd = new javax.swing.JButton();
        doubleCookiesTray = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        macaronCookiesMinus = new javax.swing.JButton();
        jTextFieldMacaronCookies = new javax.swing.JTextField();
        macaronCookiesAdd = new javax.swing.JButton();
        macaronCookiesTray = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        gingerCookiesMinus = new javax.swing.JButton();
        jTextFieldGingerCookies = new javax.swing.JTextField();
        gingerCookiesAdd = new javax.swing.JButton();
        gingerCookiesTray = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        peanutCookiesMinus = new javax.swing.JButton();
        jTextFieldPeanutCookies = new javax.swing.JTextField();
        peanutCookiesAdd = new javax.swing.JButton();
        peanutCookiesTray = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        blueMuffinsMinus = new javax.swing.JButton();
        jTextFieldBlueMuffins = new javax.swing.JTextField();
        blueMuffinsAdd = new javax.swing.JButton();
        blueMuffinsTray = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        chipMuffinsMinus = new javax.swing.JButton();
        jTextFieldChipMuffins = new javax.swing.JTextField();
        chipMuffinsAdd = new javax.swing.JButton();
        chipMuffinsTray = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        appleMuffinsMinus = new javax.swing.JButton();
        jTextFieldAppleMuffins = new javax.swing.JTextField();
        appleMuffinsAdd = new javax.swing.JButton();
        appleMuffinsTray = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        bananaMuffinsMinus = new javax.swing.JButton();
        jTextFieldBananaMuffins = new javax.swing.JTextField();
        bananaMuffinsAdd = new javax.swing.JButton();
        bananaMuffinsTray = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        lemonMuffinsMinus = new javax.swing.JButton();
        jTextFieldLemonMuffins = new javax.swing.JTextField();
        lemonMuffinsAdd = new javax.swing.JButton();
        lemonMuffinsTray = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        cornMuffinsMinus = new javax.swing.JButton();
        jTextFieldCornMuffins = new javax.swing.JTextField();
        cornMuffinsAdd = new javax.swing.JButton();
        cornMuffinsTray = new javax.swing.JButton();
        jLabel139 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        classicCinnamonMinus = new javax.swing.JButton();
        jTextFieldClassicCinnamon = new javax.swing.JTextField();
        classicCinnamonAdd = new javax.swing.JButton();
        classicCinnamonTray = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        appleCinnamonMinus = new javax.swing.JButton();
        jTextFieldAppleCinnamon = new javax.swing.JTextField();
        appleCinnamonAdd = new javax.swing.JButton();
        appleCinnamonTray = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        nutellaCinnamonMinus = new javax.swing.JButton();
        jTextFieldNutellaCinnamon = new javax.swing.JTextField();
        nutellaCinnamonAdd = new javax.swing.JButton();
        nutellaCinnamonTray = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        chocoCinnamonMinus = new javax.swing.JButton();
        jTextFieldChocoCinnamon = new javax.swing.JTextField();
        chocoCinnamonAdd = new javax.swing.JButton();
        chocoCinnamonTray = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        caramelCinnamonMinus = new javax.swing.JButton();
        jTextFieldCaramelCinnamon = new javax.swing.JTextField();
        caramelCinnamonAdd = new javax.swing.JButton();
        caramelCinnamonTray = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        pumpkinCinnamonMinus = new javax.swing.JButton();
        jTextFieldPumpkinCinnamon = new javax.swing.JTextField();
        pumpkinCinnamonAdd = new javax.swing.JButton();
        pumpkinCinnamonTray = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCart = new javax.swing.JTextArea();
        jPanel40 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        textFieldTotal = new javax.swing.JTextField();
        ClearBTN = new javax.swing.JButton();
        CheckoutBTN = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setViewportView(null);

        jPanel3.setBackground(new java.awt.Color(226, 213, 204));
        jPanel3.setForeground(new java.awt.Color(210, 153, 130));

        jPanel1.setBackground(new java.awt.Color(221, 203, 187));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(226, 213, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Chocolate Cakess.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel3.setText("Name:          Chocolate Cake");

        jLabel4.setText("Price:            Php 890.00");

        jLabel5.setText("Quantity: ");

        chocoCakeMinus.setText("-");
        chocoCakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCakeMinusActionPerformed(evt);
            }
        });

        jTextFieldChocoCake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChocoCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChocoCakeActionPerformed(evt);
            }
        });

        chocoCakeAdd.setText("+");
        chocoCakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCakeAddActionPerformed(evt);
            }
        });

        chocoCakeTray.setText("Add to Tray");
        chocoCakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chocoCakeTray)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(chocoCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldChocoCake, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chocoCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldChocoCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chocoCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chocoCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chocoCakeTray)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(221, 203, 187));
        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCT ITEMS");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel4.setBackground(new java.awt.Color(226, 213, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Chocolate Cakesss.jpg"))); // NOI18N

        jLabel7.setText("Name:          Vanilla Cake");

        jLabel8.setText("Price:            Php 750.00");

        jLabel9.setText("Quantity: ");

        vanCakeMinus.setText("-");
        vanCakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanCakeMinusActionPerformed(evt);
            }
        });

        jTextFieldvanCake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldvanCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldvanCakeActionPerformed(evt);
            }
        });

        vanCakeAdd.setText("+");
        vanCakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanCakeAddActionPerformed(evt);
            }
        });

        vanCakeTray.setText("Add to Tray");
        vanCakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanCakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(vanCakeTray)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(vanCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldvanCake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vanCakeAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldvanCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vanCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vanCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vanCakeTray)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(226, 213, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Red Velvet Cake.jpg"))); // NOI18N

        jLabel11.setText("Name:          Red velvet Cake");

        jLabel12.setText("Price:            Php 750.00");

        jLabel13.setText("Quantity: ");

        redCakeMinus.setText("-");
        redCakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCakeMinusActionPerformed(evt);
            }
        });

        jTextFieldredCake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldredCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldredCakeActionPerformed(evt);
            }
        });

        redCakeAdd.setText("+");
        redCakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCakeAddActionPerformed(evt);
            }
        });

        redCakeTray5.setText("Add to Tray");
        redCakeTray5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCakeTray5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(redCakeTray5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(redCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldredCake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldredCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(redCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(redCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redCakeTray5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(226, 213, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Carrot Cakess.jpg"))); // NOI18N

        jLabel15.setText("Name:          Carrot Cake");

        jLabel16.setText("Price:            Php 870.00");

        jLabel17.setText("Quantity: ");

        carrotCakeMinus.setText("-");
        carrotCakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrotCakeMinusActionPerformed(evt);
            }
        });

        jTextFieldCarrotCake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCarrotCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCarrotCakeActionPerformed(evt);
            }
        });

        carrotCakeAdd.setText("+");
        carrotCakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrotCakeAddActionPerformed(evt);
            }
        });

        carrotCakeTray8.setText("Add to Tray");
        carrotCakeTray8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrotCakeTray8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(carrotCakeTray8))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(carrotCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCarrotCake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carrotCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCarrotCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carrotCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carrotCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carrotCakeTray8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(226, 213, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lemon Cake.jpg"))); // NOI18N
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setText("Name:          Lemon Cake");

        jLabel20.setText("Price:            Php 750.00");

        jLabel21.setText("Quantity: ");

        lemonCakeMinus.setText("-");
        lemonCakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonCakeMinusActionPerformed(evt);
            }
        });

        jTextFieldLemonCake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLemonCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLemonCakeActionPerformed(evt);
            }
        });

        lemonCakeAdd.setText("+");
        lemonCakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonCakeAddActionPerformed(evt);
            }
        });

        lemonCakeTray7.setText("Add to Tray");
        lemonCakeTray7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonCakeTray7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lemonCakeTray7))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lemonCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLemonCake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lemonCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldLemonCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lemonCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lemonCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lemonCakeTray7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel42.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel42.setText("CAKES");
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel43.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel43.setText("CUPCAKES");

        jPanel8.setBackground(new java.awt.Color(226, 213, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel39.setText("Name:    Classic Vanilla  Cupcake");

        jLabel40.setText("Price:            Php 200.00");

        jLabel41.setText("Quantity: ");

        classVanCupcakeMinus.setText("-");
        classVanCupcakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classVanCupcakeMinusActionPerformed(evt);
            }
        });

        jTextFieldClassVanCupcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClassVanCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassVanCupcakeActionPerformed(evt);
            }
        });

        classVanCupcakeAdd.setText("+");
        classVanCupcakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classVanCupcakeAddActionPerformed(evt);
            }
        });

        classVanCupcakeTray.setText("Add to Tray");
        classVanCupcakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classVanCupcakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(classVanCupcakeTray))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(classVanCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClassVanCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classVanCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldClassVanCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classVanCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classVanCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classVanCupcakeTray)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(226, 213, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel45.setText("Name:          Chocolate Cupcake");

        jLabel46.setText("Price:            Php 180.00");

        jLabel47.setText("Quantity: ");

        chocoCupcakeMinus.setText("-");
        chocoCupcakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCupcakeMinusActionPerformed(evt);
            }
        });

        jTextFieldChocoCupcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChocoCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChocoCupcakeActionPerformed(evt);
            }
        });

        chocoCupcakeAdd.setText("+");
        chocoCupcakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCupcakeAddActionPerformed(evt);
            }
        });

        chocoCupcakeTray.setText("Add to Tray");
        chocoCupcakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCupcakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chocoCupcakeTray))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(chocoCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldChocoCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chocoCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldChocoCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chocoCupcakeTray)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(226, 213, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel49.setText("Name:          Red Velvet  Cupcake");

        jLabel50.setText("Price:            Php 220.00");

        jLabel51.setText("Quantity: ");

        redCupcakeMinus.setText("-");
        redCupcakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCupcakeMinusActionPerformed(evt);
            }
        });

        jTextFieldRedCupcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRedCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRedCupcakeActionPerformed(evt);
            }
        });

        redCupcakeAdd.setText("+");
        redCupcakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCupcakeAddActionPerformed(evt);
            }
        });

        redCupcakeTray.setText("Add to Tray");
        redCupcakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCupcakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(redCupcakeTray))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(redCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRedCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRedCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(redCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(redCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redCupcakeTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(226, 213, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ube.jpg"))); // NOI18N

        jLabel23.setText("Name:          Ube Cake");

        jLabel24.setText("Price:            Php 800.00");

        jLabel25.setText("Quantity: ");

        ubeCakeMinus.setText("-");
        ubeCakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubeCakeMinusActionPerformed(evt);
            }
        });

        jTextFieldUbeCake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUbeCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUbeCakeActionPerformed(evt);
            }
        });

        ubeCakeAdd.setText("+");
        ubeCakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubeCakeAddActionPerformed(evt);
            }
        });

        ubeCakeTray.setText("Add to Tray");
        ubeCakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubeCakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ubeCakeTray))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(ubeCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldUbeCake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubeCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldUbeCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ubeCakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ubeCakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubeCakeTray)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(226, 213, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel53.setText("Name:    Salted Caramel  Cupcake");

        jLabel54.setText("Price:            Php 150.00");

        jLabel55.setText("Quantity: ");

        saltedCarCupcakeMinus.setText("-");
        saltedCarCupcakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saltedCarCupcakeMinusActionPerformed(evt);
            }
        });

        jTextFieldSaltedCarCupcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSaltedCarCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaltedCarCupcakeActionPerformed(evt);
            }
        });

        saltedCarCupcakeAdd.setText("+");
        saltedCarCupcakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saltedCarCupcakeAddActionPerformed(evt);
            }
        });

        saltedCarCupcakeTray.setText("Add to Tray");
        saltedCarCupcakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saltedCarCupcakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(saltedCarCupcakeTray))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(saltedCarCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSaltedCarCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saltedCarCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSaltedCarCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saltedCarCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saltedCarCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saltedCarCupcakeTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(226, 213, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel57.setText("Name:        Peanut Butter Cupcake");

        jLabel58.setText("Price:            Php 150.00");

        jLabel59.setText("Quantity: ");

        peanutButterCupcakeMinus.setText("-");
        peanutButterCupcakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutButterCupcakeMinusActionPerformed(evt);
            }
        });

        jTextFieldPeanutButterCupcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeanutButterCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPeanutButterCupcakeActionPerformed(evt);
            }
        });

        peanutButterCupcakeAdd.setText("+");
        peanutButterCupcakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutButterCupcakeAddActionPerformed(evt);
            }
        });

        peanutButterCupcakeTray.setText("Add to Tray");
        peanutButterCupcakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutButterCupcakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(peanutButterCupcakeTray))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(peanutButterCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPeanutButterCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peanutButterCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPeanutButterCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peanutButterCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peanutButterCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peanutButterCupcakeTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(226, 213, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel61.setText("Name:          Matcha Cupcake");

        jLabel62.setText("Price:            Php 200.00");

        jLabel63.setText("Quantity: ");

        matchaCupcakeMinus.setText("-");
        matchaCupcakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchaCupcakeMinusActionPerformed(evt);
            }
        });

        jTextFieldMatchaCupcake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMatchaCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatchaCupcakeActionPerformed(evt);
            }
        });

        matchaCupcakeAdd.setText("+");
        matchaCupcakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchaCupcakeAddActionPerformed(evt);
            }
        });

        matchaCupcakeTray.setText("Add to Tray");
        matchaCupcakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchaCupcakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(matchaCupcakeTray))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(matchaCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMatchaCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matchaCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldMatchaCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matchaCupcakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matchaCupcakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matchaCupcakeTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel64.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel64.setText("CHEESECAKES");

        jPanel16.setBackground(new java.awt.Color(226, 213, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel66.setText("Name:    Classic New York Cheesecake");

        jLabel67.setText("Price:            Php 1000.00");

        jLabel68.setText("Quantity: ");

        classicNewMinus.setText("-");
        classicNewMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicNewMinusActionPerformed(evt);
            }
        });

        jTextFieldClassicNew.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClassicNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassicNewActionPerformed(evt);
            }
        });

        classicNewAdd.setText("+");
        classicNewAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicNewAddActionPerformed(evt);
            }
        });

        classicNewTray.setText("Add to Tray");
        classicNewTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicNewTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(classicNewTray))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(classicNewMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClassicNew, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classicNewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldClassicNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classicNewMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classicNewAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classicNewTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(226, 213, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel70.setText("Name:      No-Bake Cheesecake");

        jLabel71.setText("Price:            Php 800.00");

        jLabel72.setText("Quantity: ");

        noBakeMinus.setText("-");
        noBakeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBakeMinusActionPerformed(evt);
            }
        });

        jTextFieldNoBake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNoBake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoBakeActionPerformed(evt);
            }
        });

        noBakeAdd.setText("+");
        noBakeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBakeAddActionPerformed(evt);
            }
        });

        noBakeTray.setText("Add to Tray");
        noBakeTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBakeTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(noBakeTray))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(noBakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNoBake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noBakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNoBake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(noBakeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(noBakeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noBakeTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(226, 213, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel74.setText("Name:          Choco Cheesecake");

        jLabel75.setText("Price:            Php 900.00");

        jLabel76.setText("Quantity: ");

        chocoCheeseMinus.setText("-");
        chocoCheeseMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCheeseMinusActionPerformed(evt);
            }
        });

        jTextFieldChocoCheese.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChocoCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChocoCheeseActionPerformed(evt);
            }
        });

        chocoCheeseAdd.setText("+");
        chocoCheeseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCheeseAddActionPerformed(evt);
            }
        });

        chocoCheeseTray.setText("Add to Tray");
        chocoCheeseTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCheeseTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chocoCheeseTray))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(chocoCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldChocoCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chocoCheeseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldChocoCheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCheeseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chocoCheeseTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(226, 213, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel78.setText("Name:      Pumpkin Cheesecake");

        jLabel79.setText("Price:            Php 850.00");

        jLabel80.setText("Quantity: ");

        pumpCheeseMinus.setText("-");
        pumpCheeseMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpCheeseMinusActionPerformed(evt);
            }
        });

        jTextFieldPumpCheese.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPumpCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPumpCheeseActionPerformed(evt);
            }
        });

        pumpCheeseAdd.setText("+");
        pumpCheeseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpCheeseAddActionPerformed(evt);
            }
        });

        pumpCheeseTray.setText("Add to Tray");
        pumpCheeseTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpCheeseTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(pumpCheeseTray))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(pumpCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPumpCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pumpCheeseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPumpCheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pumpCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pumpCheeseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pumpCheeseTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(226, 213, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel82.setText("Name:       Japanese Cheesecake");

        jLabel83.setText("Price:            Php 950.00");

        jLabel84.setText("Quantity: ");

        japanCheeseMinus.setText("-");
        japanCheeseMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japanCheeseMinusActionPerformed(evt);
            }
        });

        jTextFieldJapanCheese.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldJapanCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJapanCheeseActionPerformed(evt);
            }
        });

        japanCheeseAdd.setText("+");
        japanCheeseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japanCheeseAddActionPerformed(evt);
            }
        });

        japanCheeseTray.setText("Add to Tray");
        japanCheeseTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japanCheeseTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(japanCheeseTray)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(japanCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldJapanCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(japanCheeseAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldJapanCheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(japanCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(japanCheeseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(japanCheeseTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(226, 213, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel86.setText("Name:          Caramel Cheesecake");

        jLabel87.setText("Price:            Php 900.00");

        jLabel88.setText("Quantity: ");

        caramelCheeseMinus.setText("-");
        caramelCheeseMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramelCheeseMinusActionPerformed(evt);
            }
        });

        jTextFieldCaramelCheese.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCaramelCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaramelCheeseActionPerformed(evt);
            }
        });

        caramelCheeseAdd.setText("+");
        caramelCheeseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramelCheeseAddActionPerformed(evt);
            }
        });

        caramelCheeseTray.setText("Add to Tray");
        caramelCheeseTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramelCheeseTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(caramelCheeseTray))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(caramelCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCaramelCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caramelCheeseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCaramelCheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caramelCheeseMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caramelCheeseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caramelCheeseTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel89.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel89.setText("MUFFINS");

        jPanel22.setBackground(new java.awt.Color(226, 213, 204));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel91.setText("Name:    Chocolate Chip Cookies");

        jLabel92.setText("Price:            Php 200.00");

        jLabel93.setText("Quantity: ");

        chocoCookiesMinus.setText("-");
        chocoCookiesMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCookiesMinusActionPerformed(evt);
            }
        });

        jTextFieldChocoCookies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChocoCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChocoCookiesActionPerformed(evt);
            }
        });

        chocoCookiesAdd.setText("+");
        chocoCookiesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCookiesAddActionPerformed(evt);
            }
        });

        chocoCookiesTray.setText("Add to Tray");
        chocoCookiesTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCookiesTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chocoCookiesTray))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(chocoCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldChocoCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chocoCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldChocoCookies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chocoCookiesTray)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(226, 213, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vegan Oatmeal Raisin Cookies.jpg"))); // NOI18N

        jLabel95.setText("Name:     Oatmeal Raisin Cookies");

        jLabel96.setText("Price:            Php 200.00");

        jLabel97.setText("Quantity: ");

        oatCookiesMinus.setText("-");
        oatCookiesMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oatCookiesMinusActionPerformed(evt);
            }
        });

        jTextFieldOatCookies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldOatCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOatCookiesActionPerformed(evt);
            }
        });

        oatCookiesAdd.setText("+");
        oatCookiesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oatCookiesAddActionPerformed(evt);
            }
        });

        oatCookiesTray.setText("Add to Tray");
        oatCookiesTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oatCookiesTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(oatCookiesTray))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(oatCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldOatCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oatCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldOatCookies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oatCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oatCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oatCookiesTray)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(226, 213, 204));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Chocolate Blossom Cookies.jpg"))); // NOI18N

        jLabel99.setText("Name:     Double Chocolate Cookies");

        jLabel100.setText("Price:            Php 250.00");

        jLabel101.setText("Quantity: ");

        doubleCookiesMinus.setText("-");
        doubleCookiesMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleCookiesMinusActionPerformed(evt);
            }
        });

        jTextFieldDoubleCookies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDoubleCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDoubleCookiesActionPerformed(evt);
            }
        });

        doubleCookiesAdd.setText("+");
        doubleCookiesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleCookiesAddActionPerformed(evt);
            }
        });

        doubleCookiesTray.setText("Add to Tray");
        doubleCookiesTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleCookiesTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(doubleCookiesTray))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(doubleCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDoubleCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doubleCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDoubleCookies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doubleCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doubleCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doubleCookiesTray)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(226, 213, 204));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/macaronss.jpg"))); // NOI18N

        jLabel103.setText("Name:       Macaron Cookies");

        jLabel104.setText("Price:            Php 150.00");

        jLabel105.setText("Quantity: ");

        macaronCookiesMinus.setText("-");
        macaronCookiesMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macaronCookiesMinusActionPerformed(evt);
            }
        });

        jTextFieldMacaronCookies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMacaronCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMacaronCookiesActionPerformed(evt);
            }
        });

        macaronCookiesAdd.setText("+");
        macaronCookiesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macaronCookiesAddActionPerformed(evt);
            }
        });

        macaronCookiesTray.setText("Add to Tray");
        macaronCookiesTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macaronCookiesTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(macaronCookiesTray))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(macaronCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMacaronCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(macaronCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldMacaronCookies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(macaronCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(macaronCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(macaronCookiesTray)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(226, 213, 204));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ginger.jpg"))); // NOI18N

        jLabel107.setText("Name:      Gingerbread Cookies");

        jLabel108.setText("Price:            Php 180.00");

        jLabel109.setText("Quantity: ");

        gingerCookiesMinus.setText("-");
        gingerCookiesMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gingerCookiesMinusActionPerformed(evt);
            }
        });

        jTextFieldGingerCookies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGingerCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGingerCookiesActionPerformed(evt);
            }
        });

        gingerCookiesAdd.setText("+");
        gingerCookiesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gingerCookiesAddActionPerformed(evt);
            }
        });

        gingerCookiesTray.setText("Add to Tray");
        gingerCookiesTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gingerCookiesTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(gingerCookiesTray))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(gingerCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldGingerCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gingerCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldGingerCookies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gingerCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gingerCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gingerCookiesTray)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(226, 213, 204));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Peanut Butter Cookies.jpg"))); // NOI18N

        jLabel111.setText("Name:          Peanut Butter Cookies");

        jLabel112.setText("Price:            Php 190.00");

        jLabel113.setText("Quantity: ");

        peanutCookiesMinus.setText("-");
        peanutCookiesMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutCookiesMinusActionPerformed(evt);
            }
        });

        jTextFieldPeanutCookies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeanutCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPeanutCookiesActionPerformed(evt);
            }
        });

        peanutCookiesAdd.setText("+");
        peanutCookiesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutCookiesAddActionPerformed(evt);
            }
        });

        peanutCookiesTray.setText("Add to Tray");
        peanutCookiesTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutCookiesTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(peanutCookiesTray))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(peanutCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPeanutCookies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peanutCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel113)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPeanutCookies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peanutCookiesMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peanutCookiesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peanutCookiesTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel114.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel114.setText("COOKIES");

        jPanel28.setBackground(new java.awt.Color(226, 213, 204));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blueberry.jpg"))); // NOI18N

        jLabel116.setText("Name:       Blueberry Muffins");

        jLabel117.setText("Price:            Php 120.00");

        jLabel118.setText("Quantity: ");

        blueMuffinsMinus.setText("-");
        blueMuffinsMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueMuffinsMinusActionPerformed(evt);
            }
        });

        jTextFieldBlueMuffins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldBlueMuffins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBlueMuffinsActionPerformed(evt);
            }
        });

        blueMuffinsAdd.setText("+");
        blueMuffinsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueMuffinsAddActionPerformed(evt);
            }
        });

        blueMuffinsTray.setText("Add to Tray");
        blueMuffinsTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueMuffinsTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(blueMuffinsTray))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(blueMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBlueMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blueMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBlueMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blueMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blueMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueMuffinsTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(226, 213, 204));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chocolatechip.jpg"))); // NOI18N

        jLabel120.setText("Name:     Chocolate Chip Muffins");

        jLabel121.setText("Price:            Php 120.00");

        jLabel122.setText("Quantity: ");

        chipMuffinsMinus.setText("-");
        chipMuffinsMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipMuffinsMinusActionPerformed(evt);
            }
        });

        jTextFieldChipMuffins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChipMuffins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChipMuffinsActionPerformed(evt);
            }
        });

        chipMuffinsAdd.setText("+");
        chipMuffinsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipMuffinsAddActionPerformed(evt);
            }
        });

        chipMuffinsTray.setText("Add to Tray");
        chipMuffinsTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipMuffinsTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chipMuffinsTray))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(chipMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldChipMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chipMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel122)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldChipMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chipMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chipMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chipMuffinsTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(226, 213, 204));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Apple Cinnamon Crumb Muffins.jpg"))); // NOI18N

        jLabel124.setText("Name:    Apple Cinnamon Muffins");

        jLabel125.setText("Price:            Php 200.00");

        jLabel126.setText("Quantity: ");

        appleMuffinsMinus.setText("-");
        appleMuffinsMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleMuffinsMinusActionPerformed(evt);
            }
        });

        jTextFieldAppleMuffins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAppleMuffins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAppleMuffinsActionPerformed(evt);
            }
        });

        appleMuffinsAdd.setText("+");
        appleMuffinsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleMuffinsAddActionPerformed(evt);
            }
        });

        appleMuffinsTray.setText("Add to Tray");
        appleMuffinsTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleMuffinsTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(appleMuffinsTray))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(appleMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAppleMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appleMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel126)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAppleMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(appleMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(appleMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appleMuffinsTray)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(226, 213, 204));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banana Muffins.jpg"))); // NOI18N

        jLabel128.setText("Name:          Banana Muffins");

        jLabel129.setText("Price:            Php 100.00");

        jLabel130.setText("Quantity: ");

        bananaMuffinsMinus.setText("-");
        bananaMuffinsMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaMuffinsMinusActionPerformed(evt);
            }
        });

        jTextFieldBananaMuffins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldBananaMuffins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBananaMuffinsActionPerformed(evt);
            }
        });

        bananaMuffinsAdd.setText("+");
        bananaMuffinsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaMuffinsAddActionPerformed(evt);
            }
        });

        bananaMuffinsTray.setText("Add to Tray");
        bananaMuffinsTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaMuffinsTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bananaMuffinsTray))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(bananaMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBananaMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bananaMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel130)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBananaMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bananaMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bananaMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bananaMuffinsTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(226, 213, 204));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lemonnn.jpg"))); // NOI18N

        jLabel132.setText("Name:  Lemon Puppy Seed Muffins");

        jLabel133.setText("Price:            Php 150.00");

        jLabel134.setText("Quantity: ");

        lemonMuffinsMinus.setText("-");
        lemonMuffinsMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonMuffinsMinusActionPerformed(evt);
            }
        });

        jTextFieldLemonMuffins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLemonMuffins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLemonMuffinsActionPerformed(evt);
            }
        });

        lemonMuffinsAdd.setText("+");
        lemonMuffinsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonMuffinsAddActionPerformed(evt);
            }
        });

        lemonMuffinsTray.setText("Add to Tray");
        lemonMuffinsTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonMuffinsTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lemonMuffinsTray))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(lemonMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLemonMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lemonMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel133)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel134)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldLemonMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lemonMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lemonMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lemonMuffinsTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(226, 213, 204));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corn.jpg"))); // NOI18N

        jLabel136.setText("Name:          Corn Muffins");

        jLabel137.setText("Price:            Php 100.00");

        jLabel138.setText("Quantity: ");

        cornMuffinsMinus.setText("-");
        cornMuffinsMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cornMuffinsMinusActionPerformed(evt);
            }
        });

        jTextFieldCornMuffins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCornMuffins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCornMuffinsActionPerformed(evt);
            }
        });

        cornMuffinsAdd.setText("+");
        cornMuffinsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cornMuffinsAddActionPerformed(evt);
            }
        });

        cornMuffinsTray.setText("Add to Tray");
        cornMuffinsTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cornMuffinsTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel138)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cornMuffinsTray))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(cornMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCornMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cornMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel136)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel138)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCornMuffins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cornMuffinsMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cornMuffinsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cornMuffinsTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel139.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel139.setText("CINNAMON ROLLS");

        jPanel34.setBackground(new java.awt.Color(226, 213, 204));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel141.setText("Name:       Classic Cinnamon Rolls");

        jLabel142.setText("Price:            Php 260.00");

        jLabel143.setText("Quantity: ");

        classicCinnamonMinus.setText("-");
        classicCinnamonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicCinnamonMinusActionPerformed(evt);
            }
        });

        jTextFieldClassicCinnamon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClassicCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassicCinnamonActionPerformed(evt);
            }
        });

        classicCinnamonAdd.setText("+");
        classicCinnamonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicCinnamonAddActionPerformed(evt);
            }
        });

        classicCinnamonTray.setText("Add to Tray");
        classicCinnamonTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicCinnamonTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(classicCinnamonTray))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(classicCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClassicCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classicCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldClassicCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classicCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(classicCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classicCinnamonTray)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel35.setBackground(new java.awt.Color(226, 213, 204));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Apple Cinnamon Rolls.jpg"))); // NOI18N

        jLabel145.setText("Name:     Apple Cinnamon Rolls");

        jLabel146.setText("Price:            Php 200.00");

        jLabel147.setText("Quantity: ");

        appleCinnamonMinus.setText("-");
        appleCinnamonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleCinnamonMinusActionPerformed(evt);
            }
        });

        jTextFieldAppleCinnamon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAppleCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAppleCinnamonActionPerformed(evt);
            }
        });

        appleCinnamonAdd.setText("+");
        appleCinnamonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleCinnamonAddActionPerformed(evt);
            }
        });

        appleCinnamonTray.setText("Add to Tray");
        appleCinnamonTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleCinnamonTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jLabel147)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(appleCinnamonTray))
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(appleCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAppleCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appleCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel147)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAppleCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(appleCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(appleCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appleCinnamonTray)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(226, 213, 204));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nutella Cinnamon Rollsss.jpg"))); // NOI18N

        jLabel149.setText("Name:      Nutella Cinnamon Rolls");

        jLabel150.setText("Price:            Php 240.00");

        jLabel151.setText("Quantity: ");

        nutellaCinnamonMinus.setText("-");
        nutellaCinnamonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutellaCinnamonMinusActionPerformed(evt);
            }
        });

        jTextFieldNutellaCinnamon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNutellaCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNutellaCinnamonActionPerformed(evt);
            }
        });

        nutellaCinnamonAdd.setText("+");
        nutellaCinnamonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutellaCinnamonAddActionPerformed(evt);
            }
        });

        nutellaCinnamonTray.setText("Add to Tray");
        nutellaCinnamonTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutellaCinnamonTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel151)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nutellaCinnamonTray))
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addComponent(nutellaCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNutellaCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nutellaCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel151)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNutellaCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nutellaCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nutellaCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutellaCinnamonTray)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(226, 213, 204));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Chocolate Chip Cinnamon Rollsss.jpg"))); // NOI18N

        jLabel153.setText("Name:  Chocolate Chip Cinnamon Rolls");

        jLabel154.setText("Price:            Php 180.00");

        jLabel155.setText("Quantity: ");

        chocoCinnamonMinus.setText("-");
        chocoCinnamonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCinnamonMinusActionPerformed(evt);
            }
        });

        jTextFieldChocoCinnamon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldChocoCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChocoCinnamonActionPerformed(evt);
            }
        });

        chocoCinnamonAdd.setText("+");
        chocoCinnamonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCinnamonAddActionPerformed(evt);
            }
        });

        chocoCinnamonTray.setText("Add to Tray");
        chocoCinnamonTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocoCinnamonTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel152, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel153, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chocoCinnamonTray))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(chocoCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldChocoCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chocoCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel153)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel154)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel155)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldChocoCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chocoCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chocoCinnamonTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(226, 213, 204));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Caramel Apple Cinnamon Rolls.jpg"))); // NOI18N

        jLabel157.setText("Name:  Caramel Apple Cinnamon Rolls");

        jLabel158.setText("Price:            Php 500.00");

        jLabel159.setText("Quantity: ");

        caramelCinnamonMinus.setText("-");
        caramelCinnamonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramelCinnamonMinusActionPerformed(evt);
            }
        });

        jTextFieldCaramelCinnamon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCaramelCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaramelCinnamonActionPerformed(evt);
            }
        });

        caramelCinnamonAdd.setText("+");
        caramelCinnamonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramelCinnamonAddActionPerformed(evt);
            }
        });

        caramelCinnamonTray.setText("Add to Tray");
        caramelCinnamonTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramelCinnamonTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(caramelCinnamonTray)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(caramelCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCaramelCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caramelCinnamonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel157)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel158)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel159)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCaramelCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caramelCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caramelCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caramelCinnamonTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel39.setBackground(new java.awt.Color(226, 213, 204));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pumpkin Spice Cinnamon Rolls.jpg"))); // NOI18N

        jLabel161.setText("Name:    Pumpkin Spice Cinnamon Rolls");

        jLabel162.setText("Price:            Php 500.00");

        jLabel163.setText("Quantity: ");

        pumpkinCinnamonMinus.setText("-");
        pumpkinCinnamonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpkinCinnamonMinusActionPerformed(evt);
            }
        });

        jTextFieldPumpkinCinnamon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPumpkinCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPumpkinCinnamonActionPerformed(evt);
            }
        });

        pumpkinCinnamonAdd.setText("+");
        pumpkinCinnamonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpkinCinnamonAddActionPerformed(evt);
            }
        });

        pumpkinCinnamonTray.setText("Add to Tray");
        pumpkinCinnamonTray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpkinCinnamonTrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel160, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel163)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(pumpkinCinnamonTray))
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addComponent(pumpkinCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPumpkinCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pumpkinCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel162)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel163)
                    .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPumpkinCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pumpkinCinnamonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pumpkinCinnamonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pumpkinCinnamonTray)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel89)
                            .addComponent(jLabel114)
                            .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 699, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(54, 54, 54)
                                                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(54, 54, 54)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(53, 53, 53)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(3, 3, 3))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(3, 3, 3)))
                                                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jLabel114)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel89)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        jPanel14.setBackground(new java.awt.Color(226, 213, 204));

        jLabel26.setBackground(new java.awt.Color(219, 172, 152));
        jLabel26.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("PHIKUL TASTE");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextAreaCart.setColumns(20);
        jTextAreaCart.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCart);

        jLabel28.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Total : ");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTotalActionPerformed(evt);
            }
        });

        ClearBTN.setBackground(new java.awt.Color(210, 180, 140));
        ClearBTN.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        ClearBTN.setText("Clear");
        ClearBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        ClearBTN.setFocusPainted(false);
        ClearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBTNActionPerformed(evt);
            }
        });

        CheckoutBTN.setBackground(new java.awt.Color(210, 180, 140));
        CheckoutBTN.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        CheckoutBTN.setText("Checkout");
        CheckoutBTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        CheckoutBTN.setFocusPainted(false);
        CheckoutBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CheckoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ClearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBTN)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(CheckoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("ProductID    ProductName                 Qty.           Price      Total Price ");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Back.setBackground(new java.awt.Color(210, 180, 140));
        Back.setText("BACK");
        Back.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Back.setFocusPainted(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(17, 17, 17))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int chocoCakecount = 1;
    private boolean chocoCakeclick = true;
    
    private void chocoCakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCakeAddActionPerformed
        if (chocoCakeclick){
           jTextFieldChocoCake.setText(String.valueOf(chocoCakecount));
           chocoCakeclick = false;
       } else{
           chocoCakecount++;
           jTextFieldChocoCake.setText(String.valueOf(chocoCakecount));
       }
    }//GEN-LAST:event_chocoCakeAddActionPerformed

    private void jTextFieldChocoCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChocoCakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChocoCakeActionPerformed

    private void chocoCakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCakeMinusActionPerformed
        if (chocoCakecount > 0){
            chocoCakecount --;
            jTextFieldChocoCake.setText(String.valueOf(chocoCakecount));
        }
    }//GEN-LAST:event_chocoCakeMinusActionPerformed

    private int vanCakecount = 1;
    private boolean vanCakeclick = true;
    
    private void vanCakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanCakeAddActionPerformed
        if (vanCakeclick){
           jTextFieldvanCake.setText(String.valueOf(vanCakecount));
           vanCakeclick = false;
       } else{
           vanCakecount++;
           jTextFieldvanCake.setText(String.valueOf(vanCakecount));
       }
    }//GEN-LAST:event_vanCakeAddActionPerformed

    private void jTextFieldvanCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldvanCakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldvanCakeActionPerformed

    private void vanCakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanCakeMinusActionPerformed
       if (vanCakecount > 0){
            vanCakecount --;
            jTextFieldvanCake.setText(String.valueOf(vanCakecount));
        }
    }//GEN-LAST:event_vanCakeMinusActionPerformed
    private int redCakecount = 1;
    private boolean redCakeclick = true;
    private void redCakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCakeAddActionPerformed
        if (redCakeclick){
           jTextFieldredCake.setText(String.valueOf(redCakecount));
           redCakeclick = false;
       } else{
           redCakecount++;
           jTextFieldredCake.setText(String.valueOf(redCakecount));
       }
    }//GEN-LAST:event_redCakeAddActionPerformed

    private void jTextFieldredCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldredCakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldredCakeActionPerformed

    private void redCakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCakeMinusActionPerformed
        if (redCakecount > 0){
            redCakecount --;
            jTextFieldredCake.setText(String.valueOf(redCakecount));
        }
    }//GEN-LAST:event_redCakeMinusActionPerformed
    private int carrotCakecount = 1;
    private boolean carrotCakeclick = true;
    private void carrotCakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrotCakeAddActionPerformed
        if (carrotCakeclick){
           jTextFieldCarrotCake.setText(String.valueOf(carrotCakecount));
           carrotCakeclick = false;
       } else{
           carrotCakecount++;
           jTextFieldCarrotCake.setText(String.valueOf(carrotCakecount));
       }
    }//GEN-LAST:event_carrotCakeAddActionPerformed

    private void jTextFieldCarrotCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCarrotCakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCarrotCakeActionPerformed

    private void carrotCakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrotCakeMinusActionPerformed
        if (carrotCakecount > 0){
            carrotCakecount --;
            jTextFieldCarrotCake.setText(String.valueOf(carrotCakecount));
        }
    }//GEN-LAST:event_carrotCakeMinusActionPerformed
    private int lemonCakecount = 1;
    private boolean lemonCakeclick = true;
    private void lemonCakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonCakeAddActionPerformed
        if (lemonCakeclick){
           jTextFieldLemonCake.setText(String.valueOf(lemonCakecount));
           lemonCakeclick = false;
       } else{
           lemonCakecount++;
           jTextFieldLemonCake.setText(String.valueOf(lemonCakecount));
       }
    }//GEN-LAST:event_lemonCakeAddActionPerformed

    private void jTextFieldLemonCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLemonCakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLemonCakeActionPerformed
    
    private void lemonCakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonCakeMinusActionPerformed
        if (lemonCakecount > 0){
            lemonCakecount --;
            jTextFieldLemonCake.setText(String.valueOf(lemonCakecount));
        }
    }//GEN-LAST:event_lemonCakeMinusActionPerformed
    private double grandTotal = 0;
    private void chocoCakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCakeTrayActionPerformed

        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Chocolate Cake");

if (product != null) {
    try {
        int quantity = Integer.parseInt(jTextFieldChocoCake.getText().trim());

        if (quantity > 0) {
            double totalPrice = quantity * product.getProductPrice();
            grandTotal += totalPrice;

            String productDetails = product.getProductID() + "                  " +
                                    product.getProductName() + "                " +
                                    quantity + "            " +
                                    product.getProductPrice() + "               " +
                                    totalPrice + "\n";

            jTextAreaCart.append(productDetails);

            textFieldTotal.setText(String.format("%.2f", grandTotal));

            chocoCakecount = 0;
            jTextFieldChocoCake.setText("0");
        } 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
    }
} else {
    JOptionPane.showMessageDialog(this, "Product not found!");
}

if (chocoCakecount == 1) {
    chocoCakecount = 0;
    jTextFieldChocoCake.setText(String.valueOf(chocoCakecount));
}
    }//GEN-LAST:event_chocoCakeTrayActionPerformed

    private void classVanCupcakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classVanCupcakeMinusActionPerformed
        if (classVanCupcakecount > 0){
            classVanCupcakecount --;
            jTextFieldClassVanCupcake.setText(String.valueOf(classVanCupcakecount));
        }
    }//GEN-LAST:event_classVanCupcakeMinusActionPerformed

    private void jTextFieldClassVanCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassVanCupcakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassVanCupcakeActionPerformed
    private int classVanCupcakecount = 1;
    private boolean classVanCupcakeclick = true;
    private void classVanCupcakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classVanCupcakeAddActionPerformed
        if (classVanCupcakeclick){
           jTextFieldClassVanCupcake.setText(String.valueOf(classVanCupcakecount));
           classVanCupcakeclick = false;
       } else{
           classVanCupcakecount++;
           jTextFieldClassVanCupcake.setText(String.valueOf(classVanCupcakecount));
       }
    }//GEN-LAST:event_classVanCupcakeAddActionPerformed

    private void chocoCupcakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCupcakeMinusActionPerformed
        if (chocoCupcakecount > 0){
            chocoCupcakecount --;
            jTextFieldChocoCupcake.setText(String.valueOf(chocoCupcakecount));
        }
    }//GEN-LAST:event_chocoCupcakeMinusActionPerformed

    private void jTextFieldChocoCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChocoCupcakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChocoCupcakeActionPerformed
    private int chocoCupcakecount = 1;
    private boolean chocoCupcakeclick = true;
    private void chocoCupcakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCupcakeAddActionPerformed
        if (chocoCupcakeclick){
           jTextFieldChocoCupcake.setText(String.valueOf(chocoCupcakecount));
           chocoCupcakeclick = false;
       } else{
           chocoCupcakecount++;
           jTextFieldChocoCupcake.setText(String.valueOf(chocoCupcakecount));
       }
    }//GEN-LAST:event_chocoCupcakeAddActionPerformed

    private void redCupcakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCupcakeMinusActionPerformed
        if (redCupcakecount > 0){
            redCupcakecount --;
            jTextFieldRedCupcake.setText(String.valueOf(redCupcakecount));
        }
    }//GEN-LAST:event_redCupcakeMinusActionPerformed

    private void jTextFieldRedCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRedCupcakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRedCupcakeActionPerformed
    private int redCupcakecount = 1;
    private boolean redCupcakeclick = true;
    private void redCupcakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCupcakeAddActionPerformed
       if (redCupcakeclick){
           jTextFieldRedCupcake.setText(String.valueOf(redCupcakecount));
           redCupcakeclick = false;
       } else{
           redCupcakecount++;
           jTextFieldRedCupcake.setText(String.valueOf(redCupcakecount));
       }
    }//GEN-LAST:event_redCupcakeAddActionPerformed

    private void ubeCakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubeCakeMinusActionPerformed
        if (ubeCakecount > 0){
            ubeCakecount --;
            jTextFieldUbeCake.setText(String.valueOf(ubeCakecount));
        }
    }//GEN-LAST:event_ubeCakeMinusActionPerformed

    private void jTextFieldUbeCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUbeCakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUbeCakeActionPerformed
    private int ubeCakecount = 1;
    private boolean ubeCakeclick = true;
    private void ubeCakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubeCakeAddActionPerformed
        if (ubeCakeclick){
           jTextFieldUbeCake.setText(String.valueOf(ubeCakecount));
           ubeCakeclick = false;
       } else{
           ubeCakecount++;
           jTextFieldUbeCake.setText(String.valueOf(ubeCakecount));
       }
    }//GEN-LAST:event_ubeCakeAddActionPerformed

    private void saltedCarCupcakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saltedCarCupcakeMinusActionPerformed
       if (saltedCarCupcakecount > 0){
            saltedCarCupcakecount --;
            jTextFieldSaltedCarCupcake.setText(String.valueOf(saltedCarCupcakecount));
        }
    }//GEN-LAST:event_saltedCarCupcakeMinusActionPerformed

    private void jTextFieldSaltedCarCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaltedCarCupcakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaltedCarCupcakeActionPerformed
    private int saltedCarCupcakecount = 1;
    private boolean saltedCarCupcakeclick = true;
    private void saltedCarCupcakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saltedCarCupcakeAddActionPerformed
        if (saltedCarCupcakeclick){
           jTextFieldSaltedCarCupcake.setText(String.valueOf(saltedCarCupcakecount));
           saltedCarCupcakeclick = false;
       } else{
           saltedCarCupcakecount++;
           jTextFieldSaltedCarCupcake.setText(String.valueOf(saltedCarCupcakecount));
       }
    }//GEN-LAST:event_saltedCarCupcakeAddActionPerformed

    private void peanutButterCupcakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peanutButterCupcakeMinusActionPerformed
        if (peanutButterCupcakecount > 0){
            peanutButterCupcakecount --;
            jTextFieldPeanutButterCupcake.setText(String.valueOf(peanutButterCupcakecount));
        }
    }//GEN-LAST:event_peanutButterCupcakeMinusActionPerformed

    private void jTextFieldPeanutButterCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPeanutButterCupcakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPeanutButterCupcakeActionPerformed
    private int peanutButterCupcakecount = 1;
    private boolean peanutButterCupcakeclick = true;
    private void peanutButterCupcakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peanutButterCupcakeAddActionPerformed
        if (peanutButterCupcakeclick){
           jTextFieldPeanutButterCupcake.setText(String.valueOf(peanutButterCupcakecount));
           peanutButterCupcakeclick = false;
       } else{
           peanutButterCupcakecount++;
           jTextFieldPeanutButterCupcake.setText(String.valueOf(peanutButterCupcakecount));
       }
    }//GEN-LAST:event_peanutButterCupcakeAddActionPerformed

    private void matchaCupcakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchaCupcakeMinusActionPerformed
       if (matchaCupcakecount > 0){
            matchaCupcakecount --;
            jTextFieldMatchaCupcake.setText(String.valueOf(matchaCupcakecount));
        }
    }//GEN-LAST:event_matchaCupcakeMinusActionPerformed

    private void jTextFieldMatchaCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatchaCupcakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatchaCupcakeActionPerformed
    private int matchaCupcakecount = 1;
    private boolean matchaCupcakeclick = true;
    private void matchaCupcakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchaCupcakeAddActionPerformed
        if (matchaCupcakeclick){
           jTextFieldMatchaCupcake.setText(String.valueOf(matchaCupcakecount));
           matchaCupcakeclick = false;
       } else{
           matchaCupcakecount++;
           jTextFieldMatchaCupcake.setText(String.valueOf(matchaCupcakecount));
       }
    }//GEN-LAST:event_matchaCupcakeAddActionPerformed
    
    private void classicNewMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicNewMinusActionPerformed
        if (classicNewcount > 0){
            classicNewcount --;
            jTextFieldClassicNew.setText(String.valueOf(classicNewcount));
        }
    }//GEN-LAST:event_classicNewMinusActionPerformed

    private void jTextFieldClassicNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassicNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassicNewActionPerformed
    private int classicNewcount = 1;
    private boolean classicNewclick = true;
    private void classicNewAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicNewAddActionPerformed
        if (classicNewclick){
           jTextFieldClassicNew.setText(String.valueOf(classicNewcount));
           classicNewclick = false;
       } else{
           classicNewcount++;
           jTextFieldClassicNew.setText(String.valueOf(classicNewcount));
       }
    }//GEN-LAST:event_classicNewAddActionPerformed

    private void noBakeMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBakeMinusActionPerformed
        if (noBakecount > 0){
            noBakecount --;
            jTextFieldNoBake.setText(String.valueOf(noBakecount));
        }
    }//GEN-LAST:event_noBakeMinusActionPerformed

    private void jTextFieldNoBakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoBakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoBakeActionPerformed
    private int noBakecount = 1;
    private boolean noBakeclick = true;
    private void noBakeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBakeAddActionPerformed
        if (noBakeclick){
           jTextFieldNoBake.setText(String.valueOf(noBakecount));
           noBakeclick = false;
       } else{
           noBakecount++;
           jTextFieldNoBake.setText(String.valueOf(noBakecount));
       }
    }//GEN-LAST:event_noBakeAddActionPerformed

    private void chocoCheeseMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCheeseMinusActionPerformed
        if (chocoCheesecount > 0){
            chocoCheesecount --;
            jTextFieldChocoCheese.setText(String.valueOf(chocoCheesecount));
        }
    }//GEN-LAST:event_chocoCheeseMinusActionPerformed

    private void jTextFieldChocoCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChocoCheeseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChocoCheeseActionPerformed
    private int chocoCheesecount = 1;
    private boolean chocoCheeseclick = true;
    private void chocoCheeseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCheeseAddActionPerformed
        if (chocoCheeseclick){
           jTextFieldChocoCheese.setText(String.valueOf(chocoCheesecount));
           chocoCheeseclick = false;
       } else{
           chocoCheesecount++;
           jTextFieldChocoCheese.setText(String.valueOf(chocoCheesecount));
       }
    }//GEN-LAST:event_chocoCheeseAddActionPerformed

    private void pumpCheeseMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpCheeseMinusActionPerformed
        if (pumpCheesecount > 0){
            pumpCheesecount --;
            jTextFieldPumpCheese.setText(String.valueOf(pumpCheesecount));
        }
    }//GEN-LAST:event_pumpCheeseMinusActionPerformed

    private void jTextFieldPumpCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPumpCheeseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPumpCheeseActionPerformed
    private int pumpCheesecount = 1;
    private boolean pumpCheeseclick = true;
    private void pumpCheeseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpCheeseAddActionPerformed
        if (pumpCheeseclick){
           jTextFieldPumpCheese.setText(String.valueOf(pumpCheesecount));
           pumpCheeseclick = false;
       } else{
           pumpCheesecount++;
           jTextFieldPumpCheese.setText(String.valueOf(pumpCheesecount));
       }
    }//GEN-LAST:event_pumpCheeseAddActionPerformed

    private void japanCheeseMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japanCheeseMinusActionPerformed
        if (japanCheesecount > 0){
            japanCheesecount --;
            jTextFieldJapanCheese.setText(String.valueOf(japanCheesecount));
        }
    }//GEN-LAST:event_japanCheeseMinusActionPerformed

    private void jTextFieldJapanCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJapanCheeseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJapanCheeseActionPerformed
    private int japanCheesecount = 1;
    private boolean japanCheeseclick = true;
    private void japanCheeseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japanCheeseAddActionPerformed
        if (japanCheeseclick){
           jTextFieldJapanCheese.setText(String.valueOf(japanCheesecount));
           japanCheeseclick = false;
       } else{
           japanCheesecount++;
           jTextFieldJapanCheese.setText(String.valueOf(japanCheesecount));
       }
    }//GEN-LAST:event_japanCheeseAddActionPerformed

    private void caramelCheeseMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramelCheeseMinusActionPerformed
        if (caramelCheesecount > 0){
            caramelCheesecount --;
            jTextFieldCaramelCheese.setText(String.valueOf(caramelCheesecount));
        }
    }//GEN-LAST:event_caramelCheeseMinusActionPerformed

    private void jTextFieldCaramelCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCaramelCheeseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCaramelCheeseActionPerformed
    private int caramelCheesecount = 1;
    private boolean caramelCheeseclick = true;
    private void caramelCheeseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramelCheeseAddActionPerformed
       if (caramelCheeseclick){
           jTextFieldCaramelCheese.setText(String.valueOf(caramelCheesecount));
           caramelCheeseclick = false;
       } else{
           caramelCheesecount++;
           jTextFieldCaramelCheese.setText(String.valueOf(caramelCheesecount));
       }
    }//GEN-LAST:event_caramelCheeseAddActionPerformed

    private void chocoCookiesMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCookiesMinusActionPerformed
        if (chocoCookiescount > 0){
            chocoCookiescount --;
            jTextFieldChocoCookies.setText(String.valueOf(chocoCookiescount));
        }
    }//GEN-LAST:event_chocoCookiesMinusActionPerformed

    private void jTextFieldChocoCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChocoCookiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChocoCookiesActionPerformed
    private int chocoCookiescount = 1;
    private boolean chocoCookiesclick = true;
    private void chocoCookiesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCookiesAddActionPerformed
        if (chocoCookiesclick){
           jTextFieldChocoCookies.setText(String.valueOf(chocoCookiescount));
           chocoCookiesclick = false;
       } else{
           chocoCookiescount++;
           jTextFieldChocoCookies.setText(String.valueOf(chocoCookiescount));
       }
    }//GEN-LAST:event_chocoCookiesAddActionPerformed

    private void oatCookiesMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oatCookiesMinusActionPerformed
        if (oatCookiescount > 0){
            oatCookiescount --;
            jTextFieldOatCookies.setText(String.valueOf(oatCookiescount));
        }
    }//GEN-LAST:event_oatCookiesMinusActionPerformed

    private void jTextFieldOatCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOatCookiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOatCookiesActionPerformed
    private int oatCookiescount = 1;
    private boolean oatCookiesclick = true;
    private void oatCookiesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oatCookiesAddActionPerformed
        if (oatCookiesclick){
           jTextFieldOatCookies.setText(String.valueOf(oatCookiescount));
           oatCookiesclick = false;
       } else{
           oatCookiescount++;
           jTextFieldOatCookies.setText(String.valueOf(oatCookiescount));
       }
    }//GEN-LAST:event_oatCookiesAddActionPerformed

    private void doubleCookiesMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleCookiesMinusActionPerformed
        if (doubleCookiescount > 0){
            doubleCookiescount --;
            jTextFieldDoubleCookies.setText(String.valueOf(doubleCookiescount));
        }
    }//GEN-LAST:event_doubleCookiesMinusActionPerformed

    private void jTextFieldDoubleCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDoubleCookiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDoubleCookiesActionPerformed
    private int doubleCookiescount = 1;
    private boolean doubleCookiesclick = true;
    private void doubleCookiesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleCookiesAddActionPerformed
        if (doubleCookiesclick){
           jTextFieldDoubleCookies.setText(String.valueOf(doubleCookiescount));
           doubleCookiesclick = false;
       } else{
           doubleCookiescount++;
           jTextFieldDoubleCookies.setText(String.valueOf(doubleCookiescount));
       }
    }//GEN-LAST:event_doubleCookiesAddActionPerformed

    private void macaronCookiesMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macaronCookiesMinusActionPerformed
        if (macaronCookiescount > 0){
            macaronCookiescount --;
            jTextFieldMacaronCookies.setText(String.valueOf(macaronCookiescount));
        }
    }//GEN-LAST:event_macaronCookiesMinusActionPerformed

    private void jTextFieldMacaronCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMacaronCookiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMacaronCookiesActionPerformed
    private int macaronCookiescount = 1;
    private boolean macaronCookiesclick = true;
    private void macaronCookiesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macaronCookiesAddActionPerformed
        if (macaronCookiesclick){
           jTextFieldMacaronCookies.setText(String.valueOf(macaronCookiescount));
           macaronCookiesclick = false;
       } else{
           macaronCookiescount++;
           jTextFieldMacaronCookies.setText(String.valueOf(macaronCookiescount));
       }
    }//GEN-LAST:event_macaronCookiesAddActionPerformed

    private void gingerCookiesMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gingerCookiesMinusActionPerformed
        if (gingerCookiescount > 0){
            gingerCookiescount --;
            jTextFieldGingerCookies.setText(String.valueOf(gingerCookiescount));
        }
    }//GEN-LAST:event_gingerCookiesMinusActionPerformed

    private void jTextFieldGingerCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGingerCookiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGingerCookiesActionPerformed
    private int gingerCookiescount = 1;
    private boolean gingerCookiesclick = true;
    private void gingerCookiesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gingerCookiesAddActionPerformed
        if (gingerCookiesclick){
           jTextFieldGingerCookies.setText(String.valueOf(gingerCookiescount));
           gingerCookiesclick = false;
       } else{
           gingerCookiescount++;
           jTextFieldGingerCookies.setText(String.valueOf(gingerCookiescount));
       }
    }//GEN-LAST:event_gingerCookiesAddActionPerformed

    private void peanutCookiesMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peanutCookiesMinusActionPerformed
        if (peanutCookiescount > 0){
            peanutCookiescount --;
            jTextFieldPeanutCookies.setText(String.valueOf(peanutCookiescount));
        }
    }//GEN-LAST:event_peanutCookiesMinusActionPerformed

    private void jTextFieldPeanutCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPeanutCookiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPeanutCookiesActionPerformed
    private int peanutCookiescount = 1;
    private boolean peanutCookiesclick = true;
    private void peanutCookiesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peanutCookiesAddActionPerformed
        if (peanutCookiesclick){
           jTextFieldPeanutCookies.setText(String.valueOf(peanutCookiescount));
           peanutCookiesclick = false;
       } else{
           peanutCookiescount++;
           jTextFieldPeanutCookies.setText(String.valueOf(peanutCookiescount));
       }
    }//GEN-LAST:event_peanutCookiesAddActionPerformed

    private void blueMuffinsMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueMuffinsMinusActionPerformed
        if (blueMuffinscount > 0){
            blueMuffinscount --;
            jTextFieldBlueMuffins.setText(String.valueOf(blueMuffinscount));
        }
    }//GEN-LAST:event_blueMuffinsMinusActionPerformed

    private void jTextFieldBlueMuffinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBlueMuffinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBlueMuffinsActionPerformed
    private int blueMuffinscount = 1;
    private boolean blueMuffinsclick = true;
    private void blueMuffinsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueMuffinsAddActionPerformed
        if (blueMuffinsclick){
           jTextFieldBlueMuffins.setText(String.valueOf(blueMuffinscount));
           blueMuffinsclick = false;
       } else{
           blueMuffinscount++;
           jTextFieldBlueMuffins.setText(String.valueOf(blueMuffinscount));
       }
    }//GEN-LAST:event_blueMuffinsAddActionPerformed

    private void chipMuffinsMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipMuffinsMinusActionPerformed
        if (chipMuffinscount > 0){
            chipMuffinscount --;
            jTextFieldChipMuffins.setText(String.valueOf(chipMuffinscount));
        }
    }//GEN-LAST:event_chipMuffinsMinusActionPerformed

    private void jTextFieldChipMuffinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChipMuffinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChipMuffinsActionPerformed
    private int chipMuffinscount = 1;
    private boolean chipMuffinsclick = true;
    private void chipMuffinsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipMuffinsAddActionPerformed
        if (chipMuffinsclick){
           jTextFieldChipMuffins.setText(String.valueOf(chipMuffinscount));
           chipMuffinsclick = false;
       } else{
           chipMuffinscount++;
           jTextFieldChipMuffins.setText(String.valueOf(chipMuffinscount));
       }
    }//GEN-LAST:event_chipMuffinsAddActionPerformed

    private void appleMuffinsMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleMuffinsMinusActionPerformed
        if (appleMuffinscount > 0){
            appleMuffinscount --;
            jTextFieldAppleMuffins.setText(String.valueOf(appleMuffinscount));
        }
    }//GEN-LAST:event_appleMuffinsMinusActionPerformed

    private void jTextFieldAppleMuffinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAppleMuffinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAppleMuffinsActionPerformed
    private int appleMuffinscount = 1;
    private boolean appleMuffinsclick = true;
    private void appleMuffinsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleMuffinsAddActionPerformed
        if (appleMuffinsclick){
           jTextFieldAppleMuffins.setText(String.valueOf(appleMuffinscount));
           appleMuffinsclick = false;
       } else{
           appleMuffinscount++;
           jTextFieldAppleMuffins.setText(String.valueOf(appleMuffinscount));
       }
    }//GEN-LAST:event_appleMuffinsAddActionPerformed

    private void bananaMuffinsMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaMuffinsMinusActionPerformed
       if (bananaMuffinscount > 0){
            bananaMuffinscount --;
            jTextFieldBananaMuffins.setText(String.valueOf(bananaMuffinscount));
        }
    }//GEN-LAST:event_bananaMuffinsMinusActionPerformed

    private void jTextFieldBananaMuffinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBananaMuffinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBananaMuffinsActionPerformed
    private int bananaMuffinscount = 1;
    private boolean bananaMuffinsclick = true;
    private void bananaMuffinsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaMuffinsAddActionPerformed
        if (bananaMuffinsclick){
           jTextFieldBananaMuffins.setText(String.valueOf(bananaMuffinscount));
           bananaMuffinsclick = false;
       } else{
           bananaMuffinscount++;
           jTextFieldBananaMuffins.setText(String.valueOf(bananaMuffinscount));
       }
    }//GEN-LAST:event_bananaMuffinsAddActionPerformed

    private void lemonMuffinsMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonMuffinsMinusActionPerformed
        if (lemonMuffinscount > 0){
            lemonMuffinscount --;
            jTextFieldLemonMuffins.setText(String.valueOf(lemonMuffinscount));
        }
    }//GEN-LAST:event_lemonMuffinsMinusActionPerformed

    private void jTextFieldLemonMuffinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLemonMuffinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLemonMuffinsActionPerformed
    private int lemonMuffinscount = 1;
    private boolean lemonMuffinsclick = true;
    private void lemonMuffinsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonMuffinsAddActionPerformed
        if (lemonMuffinsclick){
           jTextFieldLemonMuffins.setText(String.valueOf(lemonMuffinscount));
           lemonMuffinsclick = false;
       } else{
           lemonMuffinscount++;
           jTextFieldLemonMuffins.setText(String.valueOf(lemonMuffinscount));
       }
    }//GEN-LAST:event_lemonMuffinsAddActionPerformed

    private void cornMuffinsMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cornMuffinsMinusActionPerformed
        if (cornMuffinscount > 0){
            cornMuffinscount --;
            jTextFieldCornMuffins.setText(String.valueOf(cornMuffinscount));
        }
    }//GEN-LAST:event_cornMuffinsMinusActionPerformed

    private void jTextFieldCornMuffinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCornMuffinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCornMuffinsActionPerformed
    private int cornMuffinscount = 1;
    private boolean cornMuffinsclick = true;
    private void cornMuffinsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cornMuffinsAddActionPerformed
        if (cornMuffinsclick){
           jTextFieldCornMuffins.setText(String.valueOf(cornMuffinscount));
           cornMuffinsclick = false;
       } else{
           cornMuffinscount++;
           jTextFieldCornMuffins.setText(String.valueOf(cornMuffinscount));
       }
    }//GEN-LAST:event_cornMuffinsAddActionPerformed

    private void classicCinnamonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicCinnamonMinusActionPerformed
        if (classicCinnamoncount > 0){
            classicCinnamoncount --;
            jTextFieldClassicCinnamon.setText(String.valueOf(classicCinnamoncount));
        }
    }//GEN-LAST:event_classicCinnamonMinusActionPerformed

    private void jTextFieldClassicCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassicCinnamonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassicCinnamonActionPerformed
    private int classicCinnamoncount = 1;
    private boolean classicCinnamonclick = true;
    private void classicCinnamonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicCinnamonAddActionPerformed
        if (classicCinnamonclick){
           jTextFieldClassicCinnamon.setText(String.valueOf(classicCinnamoncount));
           classicCinnamonclick = false;
       } else{
           classicCinnamoncount++;
           jTextFieldClassicCinnamon.setText(String.valueOf(classicCinnamoncount));
       }
    }//GEN-LAST:event_classicCinnamonAddActionPerformed

    private void appleCinnamonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleCinnamonMinusActionPerformed
        if (appleCinnamoncount > 0){
            appleCinnamoncount --;
            jTextFieldAppleCinnamon.setText(String.valueOf(appleCinnamoncount));
        }
    }//GEN-LAST:event_appleCinnamonMinusActionPerformed

    private void jTextFieldAppleCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAppleCinnamonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAppleCinnamonActionPerformed
    private int appleCinnamoncount = 1;
    private boolean appleCinnamonclick = true;
    private void appleCinnamonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleCinnamonAddActionPerformed
        if (appleCinnamonclick){
           jTextFieldAppleCinnamon.setText(String.valueOf(appleCinnamoncount));
           appleCinnamonclick = false;
       } else{
           appleCinnamoncount++;
           jTextFieldAppleCinnamon.setText(String.valueOf(appleCinnamoncount));
       }
    }//GEN-LAST:event_appleCinnamonAddActionPerformed

    private void nutellaCinnamonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutellaCinnamonMinusActionPerformed
        if (nutellaCinnamoncount > 0){
            nutellaCinnamoncount --;
            jTextFieldNutellaCinnamon.setText(String.valueOf(nutellaCinnamoncount));
        }
    }//GEN-LAST:event_nutellaCinnamonMinusActionPerformed

    private void jTextFieldNutellaCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNutellaCinnamonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNutellaCinnamonActionPerformed
    private int nutellaCinnamoncount = 1;
    private boolean nutellaCinnamonclick = true;
    private void nutellaCinnamonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutellaCinnamonAddActionPerformed
        if (nutellaCinnamonclick){
           jTextFieldNutellaCinnamon.setText(String.valueOf(nutellaCinnamoncount));
           nutellaCinnamonclick = false;
       } else{
           nutellaCinnamoncount++;
           jTextFieldNutellaCinnamon.setText(String.valueOf(nutellaCinnamoncount));
       }
    }//GEN-LAST:event_nutellaCinnamonAddActionPerformed

    private void chocoCinnamonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCinnamonMinusActionPerformed
        if (chocoCinnamoncount > 0){
            chocoCinnamoncount --;
            jTextFieldChocoCinnamon.setText(String.valueOf(chocoCinnamoncount));
        }
    }//GEN-LAST:event_chocoCinnamonMinusActionPerformed

    private void jTextFieldChocoCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChocoCinnamonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChocoCinnamonActionPerformed
    private int chocoCinnamoncount = 1;
    private boolean chocoCinnamonclick = true;
    private void chocoCinnamonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCinnamonAddActionPerformed
        if (chocoCinnamonclick){
           jTextFieldChocoCinnamon.setText(String.valueOf(chocoCinnamoncount));
           chocoCinnamonclick = false;
       } else{
           chocoCinnamoncount++;
           jTextFieldChocoCinnamon.setText(String.valueOf(chocoCinnamoncount));
       }
    }//GEN-LAST:event_chocoCinnamonAddActionPerformed

    private void caramelCinnamonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramelCinnamonMinusActionPerformed
        if (caramelCinnamoncount > 0){
            caramelCinnamoncount --;
            jTextFieldCaramelCinnamon.setText(String.valueOf(caramelCinnamoncount));
        }
    }//GEN-LAST:event_caramelCinnamonMinusActionPerformed

    private void jTextFieldCaramelCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCaramelCinnamonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCaramelCinnamonActionPerformed
    private int caramelCinnamoncount = 1;
    private boolean caramelCinnamonclick = true;
    private void caramelCinnamonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramelCinnamonAddActionPerformed
        if (caramelCinnamonclick){
           jTextFieldCaramelCinnamon.setText(String.valueOf(caramelCinnamoncount));
           caramelCinnamonclick = false;
       } else{
           caramelCinnamoncount++;
           jTextFieldCaramelCinnamon.setText(String.valueOf(caramelCinnamoncount));
       }
    }//GEN-LAST:event_caramelCinnamonAddActionPerformed

    private void pumpkinCinnamonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpkinCinnamonMinusActionPerformed
        if (pumpkinCinnamoncount > 0){
            pumpkinCinnamoncount --;
            jTextFieldPumpkinCinnamon.setText(String.valueOf(pumpkinCinnamoncount));
        }
    }//GEN-LAST:event_pumpkinCinnamonMinusActionPerformed

    private void jTextFieldPumpkinCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPumpkinCinnamonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPumpkinCinnamonActionPerformed
    private int pumpkinCinnamoncount = 1;
    private boolean pumpkinCinnamonclick = true;
    private void pumpkinCinnamonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpkinCinnamonAddActionPerformed
        if (pumpkinCinnamonclick){
           jTextFieldPumpkinCinnamon.setText(String.valueOf(pumpkinCinnamoncount));
           pumpkinCinnamonclick = false;
       } else{
           pumpkinCinnamoncount++;
           jTextFieldPumpkinCinnamon.setText(String.valueOf(pumpkinCinnamoncount));
       }
    }//GEN-LAST:event_pumpkinCinnamonAddActionPerformed

    private void textFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTotalActionPerformed
    
    private void vanCakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanCakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Vanilla Cake");

if (product != null) {
    try {
        int quantity = Integer.parseInt(jTextFieldvanCake.getText().trim());

        if (quantity > 0) {
            double totalPrice = quantity * product.getProductPrice();
            grandTotal += totalPrice;

            String productDetails = product.getProductID() + "                  " +
                                    product.getProductName() + "                      " +
                                    quantity + "            " +
                                    product.getProductPrice() + "               " +
                                    totalPrice + "\n";

            jTextAreaCart.append(productDetails);

            textFieldTotal.setText(String.format("%.2f", grandTotal));

            vanCakecount = 0;
            jTextFieldvanCake.setText("0");
        } 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
    }
} else {
    JOptionPane.showMessageDialog(this, "Product not found!");
}

if (vanCakecount == 1) {
    vanCakecount = 0;
    jTextFieldvanCake.setText(String.valueOf(vanCakecount));
}
    }//GEN-LAST:event_vanCakeTrayActionPerformed

    private void redCakeTray5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCakeTray5ActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Red Velvet Cake");

if (product != null) {
    try {
        int quantity = Integer.parseInt(jTextFieldredCake.getText().trim());

        if (quantity > 0) {
            double totalPrice = quantity * product.getProductPrice();
            grandTotal += totalPrice;

            String productDetails = product.getProductID() + "                  " +
                                    product.getProductName() + "                " +
                                    quantity + "            " +
                                    product.getProductPrice() + "               " +
                                    totalPrice + "\n";

            jTextAreaCart.append(productDetails);

            textFieldTotal.setText(String.format("%.2f", grandTotal));

            redCakecount = 0;
            jTextFieldredCake.setText("0");
        } 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
    }
} else {
    JOptionPane.showMessageDialog(this, "Product not found!");
}

if (redCakecount == 1) {
    redCakecount = 0;
    jTextFieldredCake.setText(String.valueOf(redCakecount));
}
    }//GEN-LAST:event_redCakeTray5ActionPerformed

    private void lemonCakeTray7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonCakeTray7ActionPerformed
       ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Lemon Cake");

if (product != null) {
    try {
        int quantity = Integer.parseInt(jTextFieldLemonCake.getText().trim());

        if (quantity > 0) {
            double totalPrice = quantity * product.getProductPrice();
            grandTotal += totalPrice;

            String productDetails = product.getProductID() + "                  " +
                                    product.getProductName() + "                      " +
                                    quantity + "            " +
                                    product.getProductPrice() + "               " +
                                    totalPrice + "\n";

            jTextAreaCart.append(productDetails);

            textFieldTotal.setText(String.format("%.2f", grandTotal));

            lemonCakecount = 0;
            jTextFieldLemonCake.setText("0");
        } 
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
    }
} else {
    JOptionPane.showMessageDialog(this, "Product not found!");
}

if (lemonCakecount == 1) {
    lemonCakecount = 0;
    jTextFieldLemonCake.setText(String.valueOf(lemonCakecount));
}
    }//GEN-LAST:event_lemonCakeTray7ActionPerformed

    private void carrotCakeTray8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrotCakeTray8ActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Carrot Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldCarrotCake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "                  " +
                                     product.getProductName() + "                      " +
                                     quantity + "            " +
                                     product.getProductPrice() + "               " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             carrotCakecount = 0;
             jTextFieldCarrotCake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (carrotCakecount == 1) {
        carrotCakecount = 0;
        jTextFieldCarrotCake.setText(String.valueOf(carrotCakecount));
    }
    }//GEN-LAST:event_carrotCakeTray8ActionPerformed

    private void ubeCakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubeCakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Ube Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldUbeCake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "                  " +
                                     product.getProductName() + "                      " +
                                     quantity + "            " +
                                     product.getProductPrice() + "               " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             ubeCakecount = 0;
             jTextFieldUbeCake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (ubeCakecount == 1) {
        ubeCakecount = 0;
        jTextFieldUbeCake.setText(String.valueOf(ubeCakecount));
    }
    }//GEN-LAST:event_ubeCakeTrayActionPerformed

    private void classVanCupcakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classVanCupcakeTrayActionPerformed
       ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Vanilla Cup Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldClassVanCupcake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "                  " +
                                     product.getProductName() + "                " +
                                     quantity + "            " +
                                     product.getProductPrice() + "           " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             classVanCupcakecount = 0;
             jTextFieldClassVanCupcake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (classVanCupcakecount == 1) {
        classVanCupcakecount = 0;
        jTextFieldClassVanCupcake.setText(String.valueOf(classVanCupcakecount));
    }
    
    }//GEN-LAST:event_classVanCupcakeTrayActionPerformed

    private void chocoCupcakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCupcakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Chocolate Cup Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldChocoCupcake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             chocoCupcakecount = 0;
             jTextFieldChocoCupcake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (chocoCupcakecount == 1) {
        chocoCupcakecount = 0;
        jTextFieldChocoCupcake.setText(String.valueOf(chocoCupcakecount));
    }
    
    }//GEN-LAST:event_chocoCupcakeTrayActionPerformed

    private void redCupcakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCupcakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Red Velvet Cup Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldRedCupcake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             redCupcakecount = 0;
             jTextFieldRedCupcake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (redCupcakecount == 1) {
        redCupcakecount = 0;
        jTextFieldRedCupcake.setText(String.valueOf(redCupcakecount));
    }
    
    }//GEN-LAST:event_redCupcakeTrayActionPerformed

    private void saltedCarCupcakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saltedCarCupcakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Salted Caramel Cup Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldSaltedCarCupcake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             saltedCarCupcakecount = 0;
             jTextFieldSaltedCarCupcake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (saltedCarCupcakecount == 1) {
        saltedCarCupcakecount = 0;
        jTextFieldSaltedCarCupcake.setText(String.valueOf(saltedCarCupcakecount));
    }
    }//GEN-LAST:event_saltedCarCupcakeTrayActionPerformed

    private void peanutButterCupcakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peanutButterCupcakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Peanut Butter Cup Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldPeanutButterCupcake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             peanutButterCupcakecount = 0;
             jTextFieldPeanutButterCupcake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (peanutButterCupcakecount == 1) {
        peanutButterCupcakecount = 0;
        jTextFieldPeanutButterCupcake.setText(String.valueOf(peanutButterCupcakecount));
    }
    }//GEN-LAST:event_peanutButterCupcakeTrayActionPerformed

    private void matchaCupcakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchaCupcakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Matcha Cup Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldMatchaCupcake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             matchaCupcakecount = 0;
             jTextFieldMatchaCupcake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (matchaCupcakecount == 1) {
        matchaCupcakecount = 0;
        jTextFieldMatchaCupcake.setText(String.valueOf(matchaCupcakecount));
    }
    }//GEN-LAST:event_matchaCupcakeTrayActionPerformed

    private void classicNewTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicNewTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Classic Newyork Cheese Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldClassicNew.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             classicNewcount = 0;
             jTextFieldClassicNew.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (classicNewcount == 1) {
        classicNewcount = 0;
        jTextFieldClassicNew.setText(String.valueOf(classicNewcount));
    }
    }//GEN-LAST:event_classicNewTrayActionPerformed

    private void noBakeTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBakeTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("No Bake Cheese Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldNoBake.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             noBakecount = 0;
             jTextFieldNoBake.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (noBakecount == 1) {
        noBakecount = 0;
        jTextFieldNoBake.setText(String.valueOf(noBakecount));
    }
    }//GEN-LAST:event_noBakeTrayActionPerformed

    private void chocoCheeseTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCheeseTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Chocolate Cheese Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldChocoCheese.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             chocoCheesecount = 0;
             jTextFieldChocoCheese.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (chocoCheesecount == 1) {
        chocoCheesecount = 0;
        jTextFieldChocoCheese.setText(String.valueOf(chocoCheesecount));
    }
    }//GEN-LAST:event_chocoCheeseTrayActionPerformed

    private void pumpCheeseTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpCheeseTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Pumpkin Cheese Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldPumpCheese.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             pumpCheesecount = 0;
             jTextFieldPumpCheese.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (pumpCheesecount == 1) {
        pumpCheesecount = 0;
        jTextFieldPumpCheese.setText(String.valueOf(pumpCheesecount));
    }
    }//GEN-LAST:event_pumpCheeseTrayActionPerformed

    private void japanCheeseTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japanCheeseTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Japanese Cheese Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldJapanCheese.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             japanCheesecount = 0;
             jTextFieldJapanCheese.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (japanCheesecount == 1) {
        japanCheesecount = 0;
        jTextFieldJapanCheese.setText(String.valueOf(japanCheesecount));
    }
    }//GEN-LAST:event_japanCheeseTrayActionPerformed

    private void caramelCheeseTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramelCheeseTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Caramel Cheese Cake");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldCaramelCheese.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             caramelCheesecount = 0;
             jTextFieldCaramelCheese.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (caramelCheesecount == 1) {
        caramelCheesecount = 0;
        jTextFieldCaramelCheese.setText(String.valueOf(caramelCheesecount));
    }
    }//GEN-LAST:event_caramelCheeseTrayActionPerformed

    private void chocoCookiesTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCookiesTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Chocolate Cookies");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldChocoCookies.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             chocoCookiescount = 0;
             jTextFieldChocoCookies.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (chocoCookiescount == 1) {
        chocoCookiescount = 0;
        jTextFieldChocoCookies.setText(String.valueOf(chocoCookiescount));
    }
    }//GEN-LAST:event_chocoCookiesTrayActionPerformed

    private void oatCookiesTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oatCookiesTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Oat Meal Raisin Cookies");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldOatCookies.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             oatCookiescount = 0;
             jTextFieldOatCookies.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (oatCookiescount == 1) {
        oatCookiescount = 0;
        jTextFieldOatCookies.setText(String.valueOf(oatCookiescount));
    }
    }//GEN-LAST:event_oatCookiesTrayActionPerformed

    private void doubleCookiesTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleCookiesTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Double Chocolate Cookies");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldDoubleCookies.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             doubleCookiescount = 0;
             jTextFieldDoubleCookies.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (doubleCookiescount == 1) {
        doubleCookiescount = 0;
        jTextFieldDoubleCookies.setText(String.valueOf(doubleCookiescount));
    }
    }//GEN-LAST:event_doubleCookiesTrayActionPerformed

    private void macaronCookiesTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macaronCookiesTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Macaron Cookies");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldMacaronCookies.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             macaronCookiescount = 0;
             jTextFieldMacaronCookies.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (macaronCookiescount == 1) {
        macaronCookiescount = 0;
        jTextFieldMacaronCookies.setText(String.valueOf(macaronCookiescount));
    }
    }//GEN-LAST:event_macaronCookiesTrayActionPerformed

    private void gingerCookiesTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gingerCookiesTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("GInger Bread Cookies");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldGingerCookies.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             gingerCookiescount = 0;
             jTextFieldGingerCookies.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (gingerCookiescount == 1) {
        gingerCookiescount = 0;
        jTextFieldGingerCookies.setText(String.valueOf(gingerCookiescount));
    }
    }//GEN-LAST:event_gingerCookiesTrayActionPerformed

    private void peanutCookiesTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peanutCookiesTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Peanut Butter Cookies");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldPeanutCookies.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             peanutCookiescount = 0;
             jTextFieldPeanutCookies.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (peanutCookiescount == 1) {
        peanutCookiescount = 0;
        jTextFieldPeanutCookies.setText(String.valueOf(peanutCookiescount));
    }
    }//GEN-LAST:event_peanutCookiesTrayActionPerformed

    private void blueMuffinsTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueMuffinsTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Blue Berry Muffin");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldBlueMuffins.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             blueMuffinscount = 0;
             jTextFieldBlueMuffins.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (blueMuffinscount == 1) {
        blueMuffinscount = 0;
        jTextFieldBlueMuffins.setText(String.valueOf(blueMuffinscount));
    }
    }//GEN-LAST:event_blueMuffinsTrayActionPerformed

    private void chipMuffinsTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipMuffinsTrayActionPerformed
       ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Chocolate Chip Muffin");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldChipMuffins.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             chipMuffinscount = 0;
             jTextFieldChipMuffins.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (chipMuffinscount == 1) {
        chipMuffinscount = 0;
        jTextFieldChipMuffins.setText(String.valueOf(chipMuffinscount));
    }
    }//GEN-LAST:event_chipMuffinsTrayActionPerformed

    private void appleMuffinsTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleMuffinsTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Apple Cinnmon Muffin");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldAppleMuffins.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             appleMuffinscount = 0;
             jTextFieldAppleMuffins.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (appleMuffinscount == 1) {
        appleMuffinscount = 0;
        jTextFieldAppleMuffins.setText(String.valueOf(appleMuffinscount));
    }
    }//GEN-LAST:event_appleMuffinsTrayActionPerformed

    private void bananaMuffinsTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaMuffinsTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Banana Muffin");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldBananaMuffins.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             bananaMuffinscount = 0;
             jTextFieldBananaMuffins.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (bananaMuffinscount == 1) {
        bananaMuffinscount = 0;
        jTextFieldBananaMuffins.setText(String.valueOf(bananaMuffinscount));
    }
    }//GEN-LAST:event_bananaMuffinsTrayActionPerformed

    private void lemonMuffinsTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonMuffinsTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Lemon Puppy Seed Muffin");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldLemonMuffins.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             lemonMuffinscount = 0;
             jTextFieldLemonMuffins.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (lemonMuffinscount == 1) {
        lemonMuffinscount = 0;
        jTextFieldLemonMuffins.setText(String.valueOf(lemonMuffinscount));
    }
    }//GEN-LAST:event_lemonMuffinsTrayActionPerformed

    private void cornMuffinsTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cornMuffinsTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Corn Muffin");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldCornMuffins.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             cornMuffinscount = 0;
             jTextFieldCornMuffins.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (cornMuffinscount == 1) {
        cornMuffinscount = 0;
        jTextFieldCornMuffins.setText(String.valueOf(cornMuffinscount));
    }
    }//GEN-LAST:event_cornMuffinsTrayActionPerformed

    private void classicCinnamonTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicCinnamonTrayActionPerformed
        ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Classic Cinnamon Roll");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldClassicCinnamon.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             classicCinnamoncount = 0;
             jTextFieldClassicCinnamon.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (classicCinnamoncount == 1) {
        classicCinnamoncount = 0;
        jTextFieldClassicCinnamon.setText(String.valueOf(classicCinnamoncount));
    }
    }//GEN-LAST:event_classicCinnamonTrayActionPerformed

    private void appleCinnamonTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleCinnamonTrayActionPerformed
         ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Apple Cinnamon Roll");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldAppleCinnamon.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             appleCinnamoncount = 0;
             jTextFieldAppleCinnamon.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (appleCinnamoncount == 1) {
        appleCinnamoncount = 0;
        jTextFieldAppleCinnamon.setText(String.valueOf(appleCinnamoncount));
    }
    }//GEN-LAST:event_appleCinnamonTrayActionPerformed

    private void nutellaCinnamonTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutellaCinnamonTrayActionPerformed
         ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Nutella Cinnamon Roll");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldNutellaCinnamon.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             nutellaCinnamoncount = 0;
             jTextFieldNutellaCinnamon.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (nutellaCinnamoncount == 1) {
        nutellaCinnamoncount = 0;
        jTextFieldNutellaCinnamon.setText(String.valueOf(nutellaCinnamoncount));
    }
    }//GEN-LAST:event_nutellaCinnamonTrayActionPerformed

    private void chocoCinnamonTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocoCinnamonTrayActionPerformed
         ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Chocolate Cinnamon Roll");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldChocoCinnamon.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             chocoCinnamoncount = 0;
             jTextFieldChocoCinnamon.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (chocoCinnamoncount == 1) {
        chocoCinnamoncount = 0;
        jTextFieldChocoCinnamon.setText(String.valueOf(chocoCinnamoncount));
    }
    }//GEN-LAST:event_chocoCinnamonTrayActionPerformed

    private void caramelCinnamonTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramelCinnamonTrayActionPerformed
         ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Caramel Cinnamon Roll");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldCaramelCinnamon.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "             " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             caramelCinnamoncount = 0;
             jTextFieldCaramelCinnamon.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (caramelCinnamoncount == 1) {
        caramelCinnamoncount = 0;
        jTextFieldCaramelCinnamon.setText(String.valueOf(caramelCinnamoncount));
    }
    }//GEN-LAST:event_caramelCinnamonTrayActionPerformed

    private void pumpkinCinnamonTrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpkinCinnamonTrayActionPerformed
         ProductDatabase productDatabase = new ProductDatabase();
        Product product = productDatabase.getProductByName("Pumpkin Cinnamon Roll");

    if (product != null) {
        try {
         int quantity = Integer.parseInt(jTextFieldPumpkinCinnamon.getText().trim());

         if (quantity > 0) {
              double totalPrice = quantity * product.getProductPrice();
             grandTotal += totalPrice;

             String productDetails = product.getProductID() + "         " +
                                     product.getProductName() + "             " +
                                     quantity + "         " +
                                     product.getProductPrice() + "        " +
                                     totalPrice + "\n";

             jTextAreaCart.append(productDetails);

             textFieldTotal.setText(String.format("%.2f", grandTotal));

             pumpkinCinnamoncount = 0;
             jTextFieldPumpkinCinnamon.setText("0");
            } 
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Please enter a valid number for the quantity!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Product not found!");
    }
    if (pumpkinCinnamoncount == 1) {
        pumpkinCinnamoncount = 0;
        jTextFieldPumpkinCinnamon.setText(String.valueOf(pumpkinCinnamoncount));
    }
    }//GEN-LAST:event_pumpkinCinnamonTrayActionPerformed

    private void ClearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBTNActionPerformed
        ProductBSS productBSS = new ProductBSS();
           if (productBSS != null) {
           productBSS.clearLastItemInCart(jTextAreaCart); 
           calculateTotal();
           }
    }//GEN-LAST:event_ClearBTNActionPerformed

    private void CheckoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutBTNActionPerformed
        String cartDetails = jTextAreaCart.getText();
     String total = textFieldTotal.getText();

    if (cartDetails.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "The Cart is Empty.", "", JOptionPane.WARNING_MESSAGE);
    } else {
        if ("Order".equals(typeOfOrder)) {
       
        OrderJFrame orderFrame = new OrderJFrame(cartDetails);
        orderFrame.setVisible(true);
    } else if ("PreOrder".equals(typeOfOrder)) {
    
        PreOrderJFrame preOrderFrame = new PreOrderJFrame(cartDetails, total);
        preOrderFrame.setVisible(true);
    }
    this.dispose(); 
       
    }
    }//GEN-LAST:event_CheckoutBTNActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        TypeOfOrderJFrame type = new TypeOfOrderJFrame(cartDetails, total, paymentFrame, ProductID);
        type.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton CheckoutBTN;
    private javax.swing.JButton ClearBTN;
    private javax.swing.JButton appleCinnamonAdd;
    private javax.swing.JButton appleCinnamonMinus;
    private javax.swing.JButton appleCinnamonTray;
    private javax.swing.JButton appleMuffinsAdd;
    private javax.swing.JButton appleMuffinsMinus;
    private javax.swing.JButton appleMuffinsTray;
    private javax.swing.JButton bananaMuffinsAdd;
    private javax.swing.JButton bananaMuffinsMinus;
    private javax.swing.JButton bananaMuffinsTray;
    private javax.swing.JButton blueMuffinsAdd;
    private javax.swing.JButton blueMuffinsMinus;
    private javax.swing.JButton blueMuffinsTray;
    private javax.swing.JButton caramelCheeseAdd;
    private javax.swing.JButton caramelCheeseMinus;
    private javax.swing.JButton caramelCheeseTray;
    private javax.swing.JButton caramelCinnamonAdd;
    private javax.swing.JButton caramelCinnamonMinus;
    private javax.swing.JButton caramelCinnamonTray;
    private javax.swing.JButton carrotCakeAdd;
    private javax.swing.JButton carrotCakeMinus;
    private javax.swing.JButton carrotCakeTray8;
    private javax.swing.JButton chipMuffinsAdd;
    private javax.swing.JButton chipMuffinsMinus;
    private javax.swing.JButton chipMuffinsTray;
    private javax.swing.JButton chocoCakeAdd;
    private javax.swing.JButton chocoCakeMinus;
    private javax.swing.JButton chocoCakeTray;
    private javax.swing.JButton chocoCheeseAdd;
    private javax.swing.JButton chocoCheeseMinus;
    private javax.swing.JButton chocoCheeseTray;
    private javax.swing.JButton chocoCinnamonAdd;
    private javax.swing.JButton chocoCinnamonMinus;
    private javax.swing.JButton chocoCinnamonTray;
    private javax.swing.JButton chocoCookiesAdd;
    private javax.swing.JButton chocoCookiesMinus;
    private javax.swing.JButton chocoCookiesTray;
    private javax.swing.JButton chocoCupcakeAdd;
    private javax.swing.JButton chocoCupcakeMinus;
    private javax.swing.JButton chocoCupcakeTray;
    private javax.swing.JButton classVanCupcakeAdd;
    private javax.swing.JButton classVanCupcakeMinus;
    private javax.swing.JButton classVanCupcakeTray;
    private javax.swing.JButton classicCinnamonAdd;
    private javax.swing.JButton classicCinnamonMinus;
    private javax.swing.JButton classicCinnamonTray;
    private javax.swing.JButton classicNewAdd;
    private javax.swing.JButton classicNewMinus;
    private javax.swing.JButton classicNewTray;
    private javax.swing.JButton cornMuffinsAdd;
    private javax.swing.JButton cornMuffinsMinus;
    private javax.swing.JButton cornMuffinsTray;
    private javax.swing.JButton doubleCookiesAdd;
    private javax.swing.JButton doubleCookiesMinus;
    private javax.swing.JButton doubleCookiesTray;
    private javax.swing.JButton gingerCookiesAdd;
    private javax.swing.JButton gingerCookiesMinus;
    private javax.swing.JButton gingerCookiesTray;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaCart;
    private javax.swing.JTextField jTextFieldAppleCinnamon;
    private javax.swing.JTextField jTextFieldAppleMuffins;
    private javax.swing.JTextField jTextFieldBananaMuffins;
    private javax.swing.JTextField jTextFieldBlueMuffins;
    private javax.swing.JTextField jTextFieldCaramelCheese;
    private javax.swing.JTextField jTextFieldCaramelCinnamon;
    private javax.swing.JTextField jTextFieldCarrotCake;
    private javax.swing.JTextField jTextFieldChipMuffins;
    private javax.swing.JTextField jTextFieldChocoCake;
    private javax.swing.JTextField jTextFieldChocoCheese;
    private javax.swing.JTextField jTextFieldChocoCinnamon;
    private javax.swing.JTextField jTextFieldChocoCookies;
    private javax.swing.JTextField jTextFieldChocoCupcake;
    private javax.swing.JTextField jTextFieldClassVanCupcake;
    private javax.swing.JTextField jTextFieldClassicCinnamon;
    private javax.swing.JTextField jTextFieldClassicNew;
    private javax.swing.JTextField jTextFieldCornMuffins;
    private javax.swing.JTextField jTextFieldDoubleCookies;
    private javax.swing.JTextField jTextFieldGingerCookies;
    private javax.swing.JTextField jTextFieldJapanCheese;
    private javax.swing.JTextField jTextFieldLemonCake;
    private javax.swing.JTextField jTextFieldLemonMuffins;
    private javax.swing.JTextField jTextFieldMacaronCookies;
    private javax.swing.JTextField jTextFieldMatchaCupcake;
    private javax.swing.JTextField jTextFieldNoBake;
    private javax.swing.JTextField jTextFieldNutellaCinnamon;
    private javax.swing.JTextField jTextFieldOatCookies;
    private javax.swing.JTextField jTextFieldPeanutButterCupcake;
    private javax.swing.JTextField jTextFieldPeanutCookies;
    private javax.swing.JTextField jTextFieldPumpCheese;
    private javax.swing.JTextField jTextFieldPumpkinCinnamon;
    private javax.swing.JTextField jTextFieldRedCupcake;
    private javax.swing.JTextField jTextFieldSaltedCarCupcake;
    private javax.swing.JTextField jTextFieldUbeCake;
    private javax.swing.JTextField jTextFieldredCake;
    private javax.swing.JTextField jTextFieldvanCake;
    private javax.swing.JButton japanCheeseAdd;
    private javax.swing.JButton japanCheeseMinus;
    private javax.swing.JButton japanCheeseTray;
    private javax.swing.JButton lemonCakeAdd;
    private javax.swing.JButton lemonCakeMinus;
    private javax.swing.JButton lemonCakeTray7;
    private javax.swing.JButton lemonMuffinsAdd;
    private javax.swing.JButton lemonMuffinsMinus;
    private javax.swing.JButton lemonMuffinsTray;
    private javax.swing.JButton macaronCookiesAdd;
    private javax.swing.JButton macaronCookiesMinus;
    private javax.swing.JButton macaronCookiesTray;
    private javax.swing.JButton matchaCupcakeAdd;
    private javax.swing.JButton matchaCupcakeMinus;
    private javax.swing.JButton matchaCupcakeTray;
    private javax.swing.JButton noBakeAdd;
    private javax.swing.JButton noBakeMinus;
    private javax.swing.JButton noBakeTray;
    private javax.swing.JButton nutellaCinnamonAdd;
    private javax.swing.JButton nutellaCinnamonMinus;
    private javax.swing.JButton nutellaCinnamonTray;
    private javax.swing.JButton oatCookiesAdd;
    private javax.swing.JButton oatCookiesMinus;
    private javax.swing.JButton oatCookiesTray;
    private javax.swing.JButton peanutButterCupcakeAdd;
    private javax.swing.JButton peanutButterCupcakeMinus;
    private javax.swing.JButton peanutButterCupcakeTray;
    private javax.swing.JButton peanutCookiesAdd;
    private javax.swing.JButton peanutCookiesMinus;
    private javax.swing.JButton peanutCookiesTray;
    private javax.swing.JButton pumpCheeseAdd;
    private javax.swing.JButton pumpCheeseMinus;
    private javax.swing.JButton pumpCheeseTray;
    private javax.swing.JButton pumpkinCinnamonAdd;
    private javax.swing.JButton pumpkinCinnamonMinus;
    private javax.swing.JButton pumpkinCinnamonTray;
    private javax.swing.JButton redCakeAdd;
    private javax.swing.JButton redCakeMinus;
    private javax.swing.JButton redCakeTray5;
    private javax.swing.JButton redCupcakeAdd;
    private javax.swing.JButton redCupcakeMinus;
    private javax.swing.JButton redCupcakeTray;
    private javax.swing.JButton saltedCarCupcakeAdd;
    private javax.swing.JButton saltedCarCupcakeMinus;
    private javax.swing.JButton saltedCarCupcakeTray;
    private javax.swing.JTextField textFieldTotal;
    private javax.swing.JButton ubeCakeAdd;
    private javax.swing.JButton ubeCakeMinus;
    private javax.swing.JButton ubeCakeTray;
    private javax.swing.JButton vanCakeAdd;
    private javax.swing.JButton vanCakeMinus;
    private javax.swing.JButton vanCakeTray;
    // End of variables declaration//GEN-END:variables
}
