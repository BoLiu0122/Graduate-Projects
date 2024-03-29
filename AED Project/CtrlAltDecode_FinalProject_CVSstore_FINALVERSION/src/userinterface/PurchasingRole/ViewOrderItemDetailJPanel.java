/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PurchasingRole;

import Business.Order.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Tianyu
 */
public class ViewOrderItemDetailJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private OrderItem oi;
    /**
     * Creates new form ViewOrderItemDetailJPanel
     */
    public ViewOrderItemDetailJPanel(JPanel upc, OrderItem oi) {
        initComponents();
        this.upc = upc;
        this.oi = oi;
        txtProductName.setText(oi.getProduct().getProdName());
        txtProductId.setText(String.valueOf(oi.getProduct().getModelNumber()));
        txtQuantity.setText(String.valueOf(oi.getProduct().getAvail()));
        txtSalesPrice.setText(String.valueOf(oi.getSalesPrice()));
        txtPaidPrice.setText(String.valueOf(oi.getProduct().getPrice()));
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
        jLabel2 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        txtProductId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPaidPrice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel1.setText("View  Order  Item  Detail");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Product Name:");

        txtProductName.setEditable(false);
        txtProductName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtProductName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        backButton1.setBackground(new java.awt.Color(0, 153, 153));
        backButton1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        txtProductId.setEditable(false);
        txtProductId.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtProductId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Product ID:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price:");

        txtSalesPrice.setEditable(false);
        txtSalesPrice.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Quantity:");

        txtQuantity.setEditable(false);
        txtQuantity.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Paid Price:");

        txtPaidPrice.setEditable(false);
        txtPaidPrice.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSalesPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(txtProductId)
                                            .addComponent(txtProductName))))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txtPaidPrice))
                                .addGap(44, 44, 44)))))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPaidPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
        
    }//GEN-LAST:event_backButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtPaidPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalesPrice;
    // End of variables declaration//GEN-END:variables
}
