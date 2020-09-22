package userinterface.SupplierRole;

import Business.Enterprise.SupplierEnterprise;
import Business.Order.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Bo
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierEnterprise enterprise;
    public CreateNewProductJPanel(JPanel upc, SupplierEnterprise enterprise){
        initComponents();
        userProcessContainer = upc;
        this.enterprise = enterprise;
        
        populateComboBox();
    }
    
    private void populateComboBox() {
        comboType.removeAllItems();

        for (Product.ProductType type : Product.ProductType.values()) {
            comboType.addItem(type);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel1.setText("Create  New  Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 36, 317, 39));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Product ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 189, 175, 30));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtId.setEnabled(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 189, 200, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Product Price :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 237, 175, 30));

        txtPrice.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 237, 200, 30));

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 333, -1, 41));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 375, -1, 46));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Product Type :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 93, 175, 30));

        txtName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 141, 200, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Availability Num :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 285, -1, 30));

        txtAvail.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 285, 200, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Product Name :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 141, 175, 30));

        comboType.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        comboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fresh", "Food", "Tool", "Toiletry" }));
        add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 96, 200, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        Product p = enterprise.getProductCatalog().createAndAddProduct((Product.ProductType)comboType.getSelectedItem());
        
        String stringAvai = txtAvail.getText();       
        try{
            p.setAvail(Integer.parseInt(stringAvai));
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Availability Number must be a number");
            return;
        }
        
        if(txtName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Price cannot be empty");
            return;
        }
        p.setProdName(txtName.getText());
        
        String stringPrice = txtPrice.getText();       
        try
        {
            p.setPrice(Double.parseDouble(stringPrice));
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Price must be a number");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();

        Component[] comps = userProcessContainer.getComponents();
        for(Component comp: comps)
        {
            if(comp instanceof SupplierWorkAreaJPanel)
            {
                SupplierWorkAreaJPanel manageP = (SupplierWorkAreaJPanel)comp;
                manageP.refreshTable();
            }
        }

        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
