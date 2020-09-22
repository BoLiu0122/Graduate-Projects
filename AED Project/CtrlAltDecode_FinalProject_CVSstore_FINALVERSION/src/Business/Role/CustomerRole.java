/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Order.OrderDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author Tianyu
 */
public class CustomerRole extends Role {
   private OrderDirectory orderCatalog;
   public CustomerRole(){
       orderCatalog = new OrderDirectory();
   }

    public OrderDirectory getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(OrderDirectory orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EnterpriseDirectory EnterpriseDirectory, EcoSystem business) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account, enterprise, business);
    }
    
}
