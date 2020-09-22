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
import Business.Order.OrderItem;
import Business.Order.Product;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerBuyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.PurchasingRole.ViewOrderItemDetailJPanel;
import userinterface.PurchasingRole.ViewProductDetailJPanel;

/**
 *
 * @author xtdon
 */
public class BuyProductsJPanel extends javax.swing.JPanel {
    private JPanel upc;
    private CVSEnterprise enterprise;
    private UserAccount account;
    private EcoSystem system;
    private boolean isCheckout = false;
    private Order order;
    private double totalPrice;
    /**
     * Creates new form BuyProductJPanel
     */
    public BuyProductsJPanel(JPanel upc, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.enterprise = (CVSEnterprise)enterprise;
        this.account = account;
        this.system = system;
        populateProductTable();
        if(!isCheckout)
            order = new Order();
        populateOrderTable();
        
    }
    
    public void populateOrderTable()
    {
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.setRowCount(0);
        
        for(OrderItem oi: order.getOrderItemList())
        {
            Object row[] = new Object[5];
            row[0] = oi;
            row[2] = oi.getQuantity();
            row[1] = oi.getSalesPrice();
            row[3] = oi.getQuantity()*oi.getProduct().getSalesPrice();
            row[4] = oi.getProduct().getProductType();
            model.addRow(row);
            totalPrice += oi.getQuantity()*oi.getProduct().getSalesPrice();
        }
        txtTotalPrice.setText(String.valueOf(totalPrice));
    }
    
    public void populateProductTable()
    {
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
        
        for(Product p: ((CVSEnterprise)enterprise).getProductDirectory().getProductList()){
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3] = p.getAvail();
            row[4] = p.getProductType();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addtoCartButton6 = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        viewProdjButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total Price", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            orderTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 755, 146));

        productTable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Product Id", "Price", "Avail", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setRowHeight(24);
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 759, 174));

        quantitySpinner.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 200, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 302, -1, 30));

        jLabel7.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel7.setText("Item in cart");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 270, -1));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 130, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Product List:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 240, -1));

        addtoCartButton6.setBackground(new java.awt.Color(0, 204, 102));
        addtoCartButton6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });
        add(addtoCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, 43));

        btnCheckOut.setBackground(new java.awt.Color(255, 51, 51));
        btnCheckOut.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckOut.setText("Check out>>");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 140, 50));

        btnRemoveOrderItem.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveOrderItem.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });
        add(btnRemoveOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 140, 46));

        viewProdjButton2.setBackground(new java.awt.Color(0, 153, 153));
        viewProdjButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewProdjButton2.setText("View Product");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });
        add(viewProdjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, 41));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Total price ->");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 117, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("$");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 568, -1, 40));

        jLabel4.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel4.setText("BUY");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(!order.getOrderItemList().isEmpty()){
            for(OrderItem oi : order.getOrderItemList())
            {

                int oldAvail = oi.getProduct().getAvail();
                int newAvail = oldAvail + oi.getQuantity();
                oi.getProduct().setAvail(newAvail);
            }
        }
        
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        
        Component[] componentArray = upc.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkAreaJPanel dwjp = (CustomerWorkAreaJPanel) component;
        dwjp.populateOrderTable();
        layout.previous(upc);

    }//GEN-LAST:event_btnBackActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product p = (Product)productTable.getValueAt(selectedRow, 0);
        int fetchQty = (Integer)quantitySpinner.getValue();
        if(fetchQty <= 0)
        {
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than or equal to 0!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
            
        if(fetchQty <= p.getAvail())
        {
            boolean alreadyPresent = false;
            for(OrderItem oi : order.getOrderItemList())
            {
                if(oi.getProduct() == p)
                {
                    int oldAvail = p.getAvail();
                    int newAvail = oldAvail - fetchQty;
                    p.setAvail(newAvail);
                    oi.setQuantity(fetchQty + oi.getQuantity());
                    alreadyPresent = true;
                    populateProductTable();
                    populateOrderTable();
                }
            }
            if(!alreadyPresent)
            {
                int oldAvail = p.getAvail();
                int newAvail = oldAvail - fetchQty;
                p.setAvail(newAvail);
                order.addOrderItem(p, fetchQty, p.getSalesPrice());
                populateProductTable();
                populateOrderTable();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Quantity is greater than availability", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        if(!order.getOrderItemList().isEmpty())
        {
            CustomerBuyWorkRequest request = new CustomerBuyWorkRequest();
            order.setStatus("Placed");
            request.setOrder(order);
            request.setSender(account);
            request.setStatus("Pending");
            request.getOrder().setCustomerAccount(account);
            account.getSendWorkQueue().getWorkRequestList().add(request);
            enterprise.getBuyWorkQueue().getWorkRequestList().add(request);
            ((CustomerRole)account.getRole()).getOrderCatalog().addOrder(order);

            JOptionPane.showMessageDialog(null, "Order placed successfully!");
            order = new Order();
            populateProductTable();
            populateOrderTable();
            isCheckout = true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No order placed!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int row = orderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        OrderItem p = (OrderItem)orderTable.getValueAt(row, 0);
        int oldAvail = p.getProduct().getAvail();
        int oldQty = p.getQuantity();
        int newQty = oldAvail + oldQty;
        p.getProduct().setAvail(newQty);
        order.removeOrderItem(p);
        JOptionPane.showMessageDialog(null, "Order item removed from cart!");

        populateProductTable();
        populateOrderTable();

    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        // TODO add your handling code here:
        int row = productTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Product p = (Product)productTable.getValueAt(row, 0);
        ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(upc, p);
        upc.add("ViewProductDetailJPanelCust", vpdjp);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);

    }//GEN-LAST:event_viewProdjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables
}
