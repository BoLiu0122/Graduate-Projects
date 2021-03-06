/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PurchasingRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.CVSEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JPanel;

/**
 *
 * @author Tianyu
 */
public class PurchaserWorAreaJPanel extends javax.swing.JPanel implements ItemListener {

    /**
     * Creates new form PurchaserWorAreaJPanel
     */
    private JPanel upc;
    private EnterpriseDirectory enterpriseDirectory;
    private CVSEnterprise enterprise;
    private UserAccount account;
    private EcoSystem system;


    /** Creates new form ProductManagerWorkAreaJPanel */
    public PurchaserWorAreaJPanel(JPanel upc, UserAccount account, EnterpriseDirectory enterpriseDirectory, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.enterpriseDirectory = enterpriseDirectory;
        this.enterprise = (CVSEnterprise)enterprise;
        this.account = account;
        this.system = system;
        populateNetworkCombo();
        comboNetwork.setSelectedIndex(0);
        populateSupplierCombo((Network)comboNetwork.getSelectedItem());
        comboNetwork.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent event) {
       if (event.getStateChange() == ItemEvent.SELECTED) {
          Network n = (Network)event.getItem();
          populateSupplierCombo(n);
       }
    }
    
    public void populateNetworkCombo()
    {
        comboNetwork.removeAllItems();
        
        for(Network n: system.getNetworkList())
        {
            comboNetwork.addItem(n);
        }
        
    }
    
    public void populateSupplierCombo(Network n)
    {
        comboSupplier.removeAllItems();
        
        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList())
        {
            if(e instanceof SupplierEnterprise){
                comboSupplier.addItem(e);
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

        btnBrowsePro = new javax.swing.JButton();
        btnViewRequest = new javax.swing.JButton();
        comboSupplier = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        comboNetwork = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBrowsePro.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnBrowsePro.setText("Browse Product List >>");
        btnBrowsePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseProActionPerformed(evt);
            }
        });

        btnViewRequest.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnViewRequest.setText("View Collect Request >>");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        comboSupplier.setEditable(true);
        comboSupplier.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupplierActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Enterprise :");

        comboNetwork.setEditable(true);
        comboNetwork.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboNetwork.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                comboNetworkPopupMenuCanceled(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Network :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboSupplier, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboNetwork, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(322, 322, 322))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowsePro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnBrowsePro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseProActionPerformed
        // TODO add your handling code here:
        SupplierEnterprise supplier = (SupplierEnterprise)comboSupplier.getSelectedItem();
        
        BrowseProductsJPanel browse = new BrowseProductsJPanel(upc, supplier, account, enterprise);
        upc.add("CustomerWorkAreaJPanel", browse);
        CardLayout layout = (CardLayout)upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnBrowseProActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        ViewRequestJPanel view = new ViewRequestJPanel(upc, account, enterprise);
        upc.add("CustomerWorkAreaJPanel", view);
        CardLayout layout = (CardLayout)upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void comboSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupplierActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboSupplierActionPerformed

    private void comboNetworkPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboNetworkPopupMenuCanceled
        // TODO add your handling code here:
        if(comboNetwork.getSelectedItem() != null){
            Network network = (Network)comboNetwork.getSelectedItem();
            
            comboSupplier.removeAllItems();
        
            for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(e instanceof SupplierEnterprise){
                    comboSupplier.addItem(e);
                }
            }
        }
    }//GEN-LAST:event_comboNetworkPopupMenuCanceled


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowsePro;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JComboBox comboNetwork;
    private javax.swing.JComboBox comboSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

    
    
