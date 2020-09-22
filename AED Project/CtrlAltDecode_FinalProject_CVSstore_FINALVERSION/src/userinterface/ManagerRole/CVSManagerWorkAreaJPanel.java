/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.CVSEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerBuyWorkRequest;
//import Business.WorkQueue.PlaceOrderWorkRequest;
import Business.WorkQueue.PurchaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import userinterface.ReceivingRole.RequestShippingJPanel;

/**
 *
 * @author Bo
 */
public class CVSManagerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private CVSEnterprise enterprise;
    private UserAccount userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    /**
     * Creates new form GroManagerWorkAreaJPanel
     */
    public CVSManagerWorkAreaJPanel(JPanel userProcessContainer, CVSEnterprise enterprise,UserAccount userAccount,EnterpriseDirectory enterpriseDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.enterpriseDirectory = enterpriseDirectory;
        valueLabel.setText(enterprise.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnViewOrders = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnPurchaseReq = new javax.swing.JButton();
        btnProfit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 50, 100, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(153, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 52, 158, 26));

        btnViewOrders.setBackground(new java.awt.Color(0, 153, 153));
        btnViewOrders.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        btnViewOrders.setText("View Grocery Store Orders >>");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });
        add(btnViewOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 219, 325, 50));

        btnReturn.setBackground(new java.awt.Color(0, 153, 153));
        btnReturn.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        btnReturn.setText("View return request >>");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 287, 325, 53));

        btnPurchaseReq.setBackground(new java.awt.Color(0, 153, 153));
        btnPurchaseReq.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        btnPurchaseReq.setText("View Customer Purchasing Request >>");
        btnPurchaseReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseReqActionPerformed(evt);
            }
        });
        add(btnPurchaseReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 358, 330, 56));

        btnProfit.setBackground(new java.awt.Color(0, 153, 153));
        btnProfit.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        btnProfit.setText("View Profits >>");
        btnProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfitActionPerformed(evt);
            }
        });
        add(btnProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 432, 325, 49));

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel1.setText("Manager Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 113, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestShippingJPanel", new CVSOrdersJPanel(userProcessContainer, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestShippingJPanel", new ReturnWorkAreaJPanel(userProcessContainer, enterprise, userAccount));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnPurchaseReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseReqActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("PurchaseRequestJPanel", new PurchaseRequestJPanel(userProcessContainer, enterprise, userAccount, enterpriseDirectory));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPurchaseReqActionPerformed

    private void btnProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfitActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AnnualProfitJPanel", new AnnualProfitJPanel(userProcessContainer,enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProfitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfit;
    private javax.swing.JButton btnPurchaseReq;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}