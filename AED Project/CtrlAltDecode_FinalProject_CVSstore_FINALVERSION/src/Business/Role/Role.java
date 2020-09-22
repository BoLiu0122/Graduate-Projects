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

/**
 *
 * @author Kaushik
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        PublicDepartOfficer("Public Department Officer"),
        Accountant("Accountant"),
        Customer("Customer"),
        Manager("Manager"),
        Purchaser("Purchaser"),
        ReceivingOfficer("Receiving Officer"),
        SendingOfficer("Sending Officer"),
        Supplier("Supplier");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EnterpriseDirectory EnterpriseDirectory,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}