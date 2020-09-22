/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.CVSAdminRole;
import Business.Role.Role;
import Business.Role.DeliveryPlatformAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Tianyu
 */
public class DeliveryAdminOrganization extends Organization{

    public DeliveryAdminOrganization() {
        super(Organization.Type.DeliveryPlatformAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryPlatformAdminRole());
        return roles;
    }
     
}
