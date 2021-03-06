/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceivingRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.DeliveryPlatformEnterprise;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Organization.ReceivingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReceiveWorkRequest;
import Business.WorkQueue.SendWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Kaushik
 */
public class RequestSendingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestSendingJPanel
     */
    private JPanel userProcessContainer;
    private DeliveryPlatformEnterprise enterprise;
    private UserAccount userAccount;
    
    public RequestSendingJPanel(JPanel userProcessContainer, UserAccount account, DeliveryPlatformEnterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        valueLabel.setText(enterprise.getName());
        
        
        populateOrderCombo();
        
        String path = "src/images/shipping.jpeg";
        ImageIcon icon = new ImageIcon(path);
        icon.setImage(icon.getImage().getScaledInstance(155,155,Image.SCALE_DEFAULT));
        picLabel.setIcon(icon);
    }
    public void populateOrderCombo(){
        orderComboBox.removeAllItems();
        for(WorkRequest workRequest : userAccount.getReceiveWorkQueue().getWorkRequestList()) {
            if(((ReceiveWorkRequest)workRequest).getReceiveResult().equals("Prepare"))
            {
                orderComboBox.addItem(workRequest);
            }
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

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orderComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(0, 153, 153));
        submitJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitJButton.setText("Request Order");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 238, -1, 42));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("My Order :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 167, 108, 26));

        orderComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(orderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 166, 218, 30));

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 309, -1, 46));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(153, 0, 0));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 114, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 114, -1, -1));
        add(picLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel2.setText("Sending Request");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 41, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Order order = ((WorkRequest)orderComboBox.getSelectedItem()).getOrder();
        ((ReceiveWorkRequest)orderComboBox.getSelectedItem()).setReceiveResult("Sent");
        
        SendWorkRequest request = new SendWorkRequest();
        request.setOrder(order);
        request.setSender(userAccount);
        request.setStatus("Pending");

        userAccount.getSendWorkQueue().getWorkRequestList().add(request);
        enterprise.getSendingWorkQueue().getWorkRequestList().add(request);
        order.setStatus("Collected the package");
        populateOrderCombo();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ReceivingWorkAreaJPanel dwjp = (ReceivingWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox orderComboBox;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
