/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.CVSAdminRole;
import Business.Role.Role;
import Business.Role.SupplyFactoryAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Kaushik
 */
public class SupplierAdminOrganization extends Organization{

    public SupplierAdminOrganization() {
        super(Organization.Type.SupplyFactoryAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplyFactoryAdminRole());
        return roles;
    }
     
}
