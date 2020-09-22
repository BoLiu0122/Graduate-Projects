package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AccountantRole;
import Business.Role.CustomerRole;
import Business.Role.CVSAdminRole;
import Business.Role.ManagerRole;
import Business.Role.PurchasingRole;
import Business.Role.ReceivingRole;
import Business.Role.SendingRole;
import Business.Role.DeliveryPlatformAdminRole;
import Business.Role.SupplyFactoryAdminRole;
import Business.Role.SupplierRole;
import Business.Role.SystemAdminRole;
import Business.Role.PublicDepartRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Bo
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        

        return system;
    }
    
}
