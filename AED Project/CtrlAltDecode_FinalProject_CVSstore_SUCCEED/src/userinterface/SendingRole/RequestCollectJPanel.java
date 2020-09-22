/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SendingRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.DeliveryPlatformEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Organization.PurchasingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CollectWorkRequest;
import Business.WorkQueue.PurchaseWorkRequest;
import Business.WorkQueue.SendWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bo
 */
public class RequestCollectJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestCollectJPanel
     */
    private JPanel userProcessContainer;
    private DeliveryPlatformEnterprise enterprise;
    private UserAccount userAccount;
    
    public RequestCollectJPanel(JPanel userProcessContainer, UserAccount account, DeliveryPlatformEnterprise enterprise) {
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
            if(((SendWorkRequest)workRequest).getSendResult().equals("Prepare"))
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

        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        orderComboBox = new javax.swing.JComboBox();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("My Order : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 188, -1, -1));

        submitJButton.setBackground(new java.awt.Color(0, 153, 153));
        submitJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitJButton.setText("Request Order");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 248, 169, 47));

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 301, -1, 49));

        orderComboBox.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        orderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(orderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 184, 194, 32));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(153, 0, 0));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 132, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 132, -1, -1));
        add(picLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel2.setText("Collect Request");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 43, -1, -1));

        jButton1.setText("Send email");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Order order = ((WorkRequest)orderComboBox.getSelectedItem()).getOrder();
        ((SendWorkRequest)orderComboBox.getSelectedItem()).setSendResult("Sent");
        
        CollectWorkRequest request = new CollectWorkRequest();
        request.setOrder(order);
        request.setSender(userAccount);
        request.setStatus("Pending");

        userAccount.getSendWorkQueue().getWorkRequestList().add(request);
        if(request.getOrder().getCustomerAccount() == null){
            request.getOrder().getEnterprise().getCollectWorkQueue().getWorkRequestList().add(request);
        }
        else{
            request.getOrder().getCustomerAccount().getReceiveWorkQueue().getWorkRequestList().add(request);
        }
        order.setStatus("Package is on the way!");
        populateOrderCombo();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SendingWorkAreaJPanel dwjp = (SendingWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sendMailToCustomer("weieric69@gmail.com","","");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void sendMailToCustomer(String toMail, String msg, String username){
        System.out.println("Now start sending Email!");
        final String usname = "CtrlAltDecode5100@gmail.com";
        final String passwrd = "2019Fighting!";
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        //props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable", "true");
        //props.put("mail.smtp.port","465");
        
        Session session=Session.getDefaultInstance(props,
             new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication(){
                 return new PasswordAuthentication(usname,passwrd);
                }
             });
        
        try{
         Message message=new MimeMessage(session);
         message.setFrom(new InternetAddress("CtrlAltDecode5100@gmail.com"));
         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toMail));
         message.setSubject("Package Status Update");
         message.setContent("<font color=black>Your package is on the way! <b>"+usname+"</b>,<br>" +
                 "<b>New work request received, Please check your work queue.<br></font>","text/html");
         //message.setText(message);
         Transport.send(message);
         JOptionPane.showMessageDialog(null, "Delivery status update email has been sent to customer!");
     }catch(MessagingException e){
        e.printStackTrace();
     
        
        
}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox orderComboBox;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
