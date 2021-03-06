/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceivingRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.DeliveryPlatformEnterprise;
import Business.Organization.ReceivingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReceiveWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shuhanliu
 */
public class ReceivingWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private DeliveryPlatformEnterprise enterprise;
    private UserAccount userAccount;
    private ReceivingOrganization receivingOrganization;
    ReceiveWorkRequest request;

    /**
     * Creates new form ReceivingWorkAreaJPanel
     */
    public ReceivingWorkAreaJPanel(JPanel userProcessContainer, Organization organization, UserAccount account, DeliveryPlatformEnterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.receivingOrganization = (ReceivingOrganization)organization;
        valueLabel.setText(enterprise.getName());
        
        populateTable();
        populateOrderCombo();
        populateProcessCombo();
        
        String path = "src/images/shipping.jpeg";
        ImageIcon icon = new ImageIcon(path);
        icon.setImage(icon.getImage().getScaledInstance(155,155,Image.SCALE_DEFAULT));
        picLabel.setIcon(icon);
    }
    
    public void populateProcessCombo(){
        processComboBox.removeAllItems();
        for(WorkRequest workRequest : userAccount.getReceiveWorkQueue().getWorkRequestList()) {
            if(workRequest.getStatus().equals("Received")){
                processComboBox.addItem(workRequest);
            }
        }
    }
    
    public void populateOrderCombo(){
        orderComboBox.removeAllItems();
        
        for(WorkRequest workRequest : userAccount.getReceiveWorkQueue().getWorkRequestList()) {
            if(workRequest.getStatus().equals("Processing")){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        orderComboBox = new javax.swing.JComboBox();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnRequestSending = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        processComboBox = new javax.swing.JComboBox();
        picLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order", "Sender", "Receiver", "Work Status", "Order Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(24);
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 901, 188));

        assignJButton.setBackground(new java.awt.Color(0, 153, 153));
        assignJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        assignJButton.setText("Assign to me>>");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 333, 175, 44));

        processJButton.setBackground(new java.awt.Color(0, 153, 153));
        processJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        processJButton.setText("Process Order");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 333, 223, 45));

        refreshJButton.setBackground(new java.awt.Color(0, 153, 153));
        refreshJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Pick up Order :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 422, -1, -1));

        submitJButton.setBackground(new java.awt.Color(0, 153, 153));
        submitJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitJButton.setText("Complete Order");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 414, 222, 41));

        orderComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(orderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 424, 222, 21));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 88, -1, -1));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(153, 0, 0));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 88, -1, -1));

        btnRequestSending.setBackground(new java.awt.Color(0, 153, 153));
        btnRequestSending.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnRequestSending.setText("Request Sending >>");
        btnRequestSending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestSendingActionPerformed(evt);
            }
        });
        add(btnRequestSending, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 222, 39));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("My Order :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 343, -1, -1));

        processComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        processComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(processComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 324, 223, 62));
        add(picLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel3.setText("View Product Details");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 26, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        request = (ReceiveWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(!request.getStatus().equals("Pending")){
            JOptionPane.showMessageDialog(null, "Order is Completed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        userAccount.getReceiveWorkQueue().getWorkRequestList().add(request);
        
        request.setReceiver(userAccount);
        request.setStatus("Received");
        
        populateTable();
        populateProcessCombo();
        populateOrderCombo();

    }//GEN-LAST:event_assignJButtonActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : enterprise.getReceivingWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = request.getOrder().getStatus();
            
            model.addRow(row);
        }
    }
        
    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        request = (ReceiveWorkRequest)processComboBox.getSelectedItem();
        request.setStatus("Processing");
        populateTable();
        populateProcessCombo();
        populateOrderCombo();

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        //request.setReceiveResult((orderComboBox.getSelectedItem()).toString());
        ((ReceiveWorkRequest)orderComboBox.getSelectedItem()).setReceiveResult("Prepare");
        ((ReceiveWorkRequest)orderComboBox.getSelectedItem()).setStatus("Completed");
        //request.setReceiveResult("Completed");
        populateTable();
        populateProcessCombo();
        populateOrderCombo();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnRequestSendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestSendingActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestSendingJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestSendingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnRequestSending;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orderComboBox;
    private javax.swing.JLabel picLabel;
    private javax.swing.JComboBox processComboBox;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
