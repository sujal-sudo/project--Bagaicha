package Bagaicha;

import Bagaicha.connectorBagaicha;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class PRODUCTS extends javax.swing.JFrame {
    public PRODUCTS() {
        initComponents();
        
       String sql = "select * from Product";

            try (Connection connection = new connectorBagaicha().openConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                ResultSet rs=preparedStatement.executeQuery();

            while (rs.next()){
                String id=String.valueOf(rs.getInt("Product_id"));
                String pname=rs.getString("Product_name");
                String quantity = rs.getString("Quantity");
                String price=rs.getString("Price");

                String tbData[]={id,pname,quantity,price};
                DefaultTableModel tblModel =(DefaultTableModel)producttable.getModel();
//                                     tblModel.setRowCount(0);
                tblModel.addRow(tbData);

            }

            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
  
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        productidField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        billingbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 153, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("PRODUCTID");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("MANAGE PRODUCTS");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("NAME");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("QUANTITY");

        nameField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 153, 0));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        quantityField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        quantityField.setForeground(new java.awt.Color(255, 153, 0));
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        productidField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        productidField.setForeground(new java.awt.Color(255, 153, 0));
        productidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productidFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText(" PRICE PER 1");
        jLabel7.setToolTipText("");

        priceField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        priceField.setForeground(new java.awt.Color(255, 153, 0));
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(255, 153, 0));
        addbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.setFocusable(false);
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(255, 153, 0));
        editbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("EDIT");
        editbtn.setFocusable(false);
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(255, 153, 0));
        deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("DELETE");
        deletebtn.setFocusable(false);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(255, 153, 0));
        clearbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("CLEAR");
        clearbtn.setFocusable(false);
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        producttable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE PER 1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        producttable.setGridColor(new java.awt.Color(0, 0, 0));
        producttable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        producttable.setShowGrid(true);
        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(producttable);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("PRODUCTS LIST");

        close.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 153, 0));
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        billingbtn.setBackground(new java.awt.Color(255, 153, 0));
        billingbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        billingbtn.setForeground(new java.awt.Color(255, 255, 255));
        billingbtn.setText("BILLING");
        billingbtn.setFocusable(false);
        billingbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingbtnMouseClicked(evt);
            }
        });
        billingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingbtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(255, 153, 0));
        logoutbtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Log Out");
        logoutbtn.setFocusable(false);
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(productidField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addbtn)
                        .addGap(33, 33, 33)
                        .addComponent(editbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deletebtn)
                        .addGap(32, 32, 32)
                        .addComponent(clearbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(billingbtn)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn)
                    .addComponent(clearbtn)
                    .addComponent(editbtn)
                    .addComponent(addbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(billingbtn)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void productidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productidFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:

        String product = productidField.getText();
        
        String name = nameField.getText();
        String quantity = quantityField.getText();
        
        String price = priceField.getText();
        

//        ProductDetails user = new ProductDetails(id, name, quant, pric);

        if (product.isEmpty() || name.isEmpty() || quantity.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        else {
            int id = Integer.parseInt(product);
            int quant = Integer.parseInt(quantity);
            double pric = Double.parseDouble(price);
           
            String sql = "INSERT INTO Product (Product_id, Product_name, Quantity, Price) VALUES (?, ?, ?, ?);";

            try (Connection connection = new connectorBagaicha().openConnection(); 
                    PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setInt(3, quant);
                preparedStatement.setDouble(4, pric);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Product added successfully");
                     dispose();
                    
                    SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new PRODUCTS().setVisible(true);
                    }
                });
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Product addition failed");
                }

            } catch (SQLException ex) {
                System.out.println("error: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_addbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        String product = productidField.getText();
        String name = nameField.getText();
        String quantity = quantityField.getText();
        
        String price = priceField.getText();
        
        if (product.isEmpty() || name.isEmpty() || quantity.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid credentials");
        } else {
            int productid= Integer.parseInt(product);
            int quant=Integer.parseInt(quantity);
            Double Price=Double.parseDouble(price);
            
            String sql2="update Product set Product_name=?,Quantity=?, Price=? where Product_id=?";
             
             try (Connection connection = new connectorBagaicha().openConnection(); 
                    PreparedStatement preparedStatement = connection.prepareStatement(sql2)) {

                
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, quant);
                preparedStatement.setDouble(3, Price);
                preparedStatement.setInt(4,productid);
               

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Product edited");
                  
                    dispose();
                    
                    SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new PRODUCTS().setVisible(true);
                    }
                });
                } else {
                    JOptionPane.showMessageDialog(null, "Product edit failed");
                }

            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }       
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        productidField.setText("");
        nameField.setText("");
        priceField.setText("");
        quantityField.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        String product = productidField.getText();

        if (product.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide Product id");
        } else {
            
            int productid=Integer.parseInt(product);
           String sql3="delete from Product where product_id=?";
           
           try (Connection connection = new connectorBagaicha().openConnection(); 
                    PreparedStatement preparedStatement = connection.prepareStatement(sql3)) {
               preparedStatement.setInt(1, productid);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Product deleted");
                     dispose();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new PRODUCTS().setVisible(true);
                    }
                });
                } else {
                    JOptionPane.showMessageDialog(null, "Product deletion failed");
                }

            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)producttable.getModel();
        int Myindex=producttable.getSelectedRow();
       productidField.setText(model.getValueAt(Myindex,0).toString());

        nameField.setText(model.getValueAt(Myindex,1).toString());
        quantityField.setText(model.getValueAt(Myindex,2).toString());
        priceField.setText(model.getValueAt(Myindex,3).toString());
    }//GEN-LAST:event_producttableMouseClicked

    private void billingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billingbtnActionPerformed

    private void billingbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingbtnMouseClicked
        // TODO add your handling code here:
        AdminWork billing=new AdminWork();
        
        this.dispose();
        billing.setVisible(true);
        
    }//GEN-LAST:event_billingbtnMouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        login logout=new login();
        this.dispose();
        logout.setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

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
                java.util.logging.Logger.getLogger(PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(PRODUCTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new PRODUCTS().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton billingbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel close;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField productidField;
    private javax.swing.JTable producttable;
    private javax.swing.JTextField quantityField;
    // End of variables declaration//GEN-END:variables
}
