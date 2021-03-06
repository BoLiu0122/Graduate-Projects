/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.CVSEnterprise;
import Business.Order.Order;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerBuyWorkRequest;
import Business.WorkQueue.ReturnWorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xtdon
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel upc;
    private CVSEnterprise enterprise;
    private UserAccount account;
    private EcoSystem system;
    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    public CustomerWorkAreaJPanel(JPanel upc, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.enterprise = (CVSEnterprise)enterprise;
        this.account = account;
        this.system = system;
        
        populateOrderTable();
        
        String path = "src/images/CustomerWa.jpg";
        ImageIcon icon = new ImageIcon(path);
        icon.setImage(icon.getImage().getScaledInstance(255,155,Image.SCALE_DEFAULT));
        picLabel.setIcon(icon);
    }
    
    public void populateOrderTable()
    {
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.setRowCount(0);
        
        for(Order o: ((CustomerRole)account.getRole()).getOrderCatalog().getOrderDirectory()){
            Object row[] = new Object[4];
            row[0] = o;
            row[1] = String.valueOf(o.getOrderNumber());
            row[2] = String.valueOf(o.getTotalPrice());
            row[3] = o.getStatus();
            model.addRow(row);            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnViewOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        btnViewRequest = new javax.swing.JButton();
        btnBrowsePro = new javax.swing.JButton();
        picLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Orders :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 134, 45));

        btnViewOrder.setBackground(new java.awt.Color(0, 153, 153));
        btnViewOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnViewOrder.setText("Track Package");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, 50));

        orderTable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order", "Order Number", "Total Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.setRowHeight(24);
        jScrollPane2.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
            orderTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 773, 187));

        btnReturn.setBackground(new java.awt.Color(0, 153, 153));
        btnReturn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 125, 46));

        btnViewRequest.setBackground(new java.awt.Color(0, 153, 153));
        btnViewRequest.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnViewRequest.setText("View Collecting Request");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });
        add(btnViewRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 302, 47));

        btnBrowsePro.setBackground(new java.awt.Color(0, 153, 153));
        btnBrowsePro.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBrowsePro.setText("Browse Product Catalog >>");
        btnBrowsePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseProActionPerformed(evt);
            }
        });
        add(btnBrowsePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 317, 47));
        add(picLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setText("View Order Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 220, 50));

        jLabel2.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel2.setText("Customer Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order order = (Order)orderTable.getValueAt(selectedRow, 0);
        ViewOrderJPanel browse = new ViewOrderJPanel(order, upc);
        upc.add("ViewOrderJPanel", browse);
        CardLayout layout = (CardLayout)upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        ViewRequestJPanel view = new ViewRequestJPanel(upc, account, enterprise);
        upc.add("ViewRequestJPanel", view);
        CardLayout layout = (CardLayout)upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order order = (Order)orderTable.getValueAt(selectedRow, 0);
        if(!order.getStatus().equals("Package Shipped")){
            JOptionPane.showMessageDialog(null, "Cannot return this order!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ReturnWorkRequest request = new ReturnWorkRequest();
        order.setStatus("Returning");
        request.setOrder(order);
        request.setSender(account);
        request.setStatus("Pending");
        request.getOrder().setCustomerAccount(account);
        account.getSendWorkQueue().getWorkRequestList().add(request);
        enterprise.getReturnWorkQueue().getWorkRequestList().add(request);
        populateOrderTable();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnBrowseProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseProActionPerformed
        // TODO add your handling code here:
        BuyProductsJPanel view = new BuyProductsJPanel(upc, account, enterprise, system);
        upc.add("CustomerWorkAreaJPanel", view);
        CardLayout layout = (CardLayout)upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnBrowseProActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)orderTable.getValueAt(selectedRow, 0);
        ViewOrderDetailsJPanel view = new ViewOrderDetailsJPanel(order, upc);
        upc.add("ViewOrderDetailsJPanel", view);
        CardLayout layout = (CardLayout)upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowsePro;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel picLabel;
    // End of variables declaration//GEN-END:variables
}
