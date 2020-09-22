/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.SupplierEnterprise;
import Business.Organization.PublicDepartOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PublicDepartRole.PublicDepartWorkAreaJPanel;

/**
 *
 * @author Bo
 */
public class PublicDepartRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EnterpriseDirectory enterpriseDirectory, EcoSystem business) {
        return new PublicDepartWorkAreaJPanel(userProcessContainer, account,organization, business, (SupplierEnterprise)enterprise, enterpriseDirectory);
    }
    
    
}
