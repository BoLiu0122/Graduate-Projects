/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupplierRole.SupplierWorkAreaJPanel;

/**
 *
 * @author Bo
 */
public class SupplierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EnterpriseDirectory EnterpriseDirectory, EcoSystem business) {
        return new SupplierWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
}
