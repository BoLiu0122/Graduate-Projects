/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PublicDepartRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tianyu
 */
public class PublicDepartOrganization extends Organization{

    public PublicDepartOrganization() {
        super(Organization.Type.PublicDepart.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PublicDepartRole());
        return roles;
    }
     
}