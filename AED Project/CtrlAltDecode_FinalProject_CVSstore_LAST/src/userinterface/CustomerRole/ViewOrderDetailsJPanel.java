/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Order.Order;
import Business.Order.OrderItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xtdon
 */
public class ViewOrderDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderDetailsJPanel
     */
    private Order order;
    private JPanel upc;
    public ViewOrderDetailsJPanel(Order order, JPanel upc) {
        initComponents();
        
        this.order = order;
        this.upc = upc;
        populateOrderTable();
    }
    
    public void populateOrderTable()
    {
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.setRowCount(0);
        double totalPrice = 0;
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
        txtTotalPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Price", "Quantity", "Total Price", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.setRowHeight(24);
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 138, 844, 127));

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 294, 176, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("$");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 299, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Total price:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 299, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 356, -1, 38));

        jLabel2.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel2.setText("View Orders");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 64, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
