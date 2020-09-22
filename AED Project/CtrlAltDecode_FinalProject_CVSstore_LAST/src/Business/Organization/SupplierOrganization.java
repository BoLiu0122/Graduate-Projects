/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.OrderDirectory;
import Business.Role.SupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SupplierOrganization extends Organization{
    
    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }
}
