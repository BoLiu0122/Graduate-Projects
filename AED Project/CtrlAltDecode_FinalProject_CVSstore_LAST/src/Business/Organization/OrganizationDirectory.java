/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.AccountingDepart.getValue())){
            organization = new AccountingDepartOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customers.getValue())){
            organization = new Customers();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Purchasing.getValue())){
            organization = new PurchasingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Receiving.getValue())){
            organization = new ReceivingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Sending.getValue())){
            organization = new SendingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PublicDepart.getValue())){
            organization = new PublicDepartOrganization();
            organizationList.add(organization);
        }
       
        return organization;
    }
}