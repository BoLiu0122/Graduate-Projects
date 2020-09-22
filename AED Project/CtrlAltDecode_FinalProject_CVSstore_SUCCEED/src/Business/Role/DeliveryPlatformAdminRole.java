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
import userinterface.DeliveryPlatformAdminRole.DeliveryPlatformAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Kaushik
 */
public class DeliveryPlatformAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EnterpriseDirectory EnterpriseDirectory, EcoSystem business) {
        return new DeliveryPlatformAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }

    
    
}
