/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

import userinterface.CustomerRole.*;
import Business.Order.Order;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author xtdon
 */
public class ViewCVSOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderJPanel
     */
    private Order order;
    private JPanel upc;
    
    public ViewCVSOrderJPanel(Order order, JPanel upc) {
        initComponents();
        this.order = order;
        this.upc = upc;
        populatePurchaseBar();
    }
    
    public void populatePurchaseBar(){
        if(order.getStatus().equals("Placed")){
            populateBar.setValue(16);
        }
        else if(order.getStatus().equals("Order Received")){
            populateBar.setValue(33);
        }
        else if(order.getStatus().equals("Packing up")){
            populateBar.setValue(50);
        }
        else if(order.getStatus().equals("Collected the package")){
            populateBar.setValue(66);
        }
        else if(order.getStatus().equals("Package is on the way!")){
            populateBar.setValue(83);
        }
        else if(order.getStatus().equals("Package Received")){
            populateBar.setValue(100);
        }
        else{
            populateBar.setValue(0);
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

        populateBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        populateBar.setBackground(new java.awt.Color(255, 255, 255));
        populateBar.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        populateBar.setStringPainted(true);
        add(populateBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 663, 70));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Placed------------------------------16%\nOrder Received-----------------------33%\nPacking up--------------------------50%\nCollected the package-----------------66%\nPackage is on the way-----------------83%\nPackage Received--------------------100%");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 451, 147));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JProgressBar populateBar;
    // End of variables declaration//GEN-END:variables
}
