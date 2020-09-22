/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.ProductDirectory;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Tianyu
 */
public class SupplierEnterprise extends Enterprise {
    private ProductDirectory productCatalog;
    private WorkQueue purchasingWorkQueue;
    private WorkQueue tallyWorkQueue;
    
    public SupplierEnterprise(String name){
        super(name, Enterprise.EnterpriseType.SupplyFactory);
        productCatalog = new ProductDirectory();
        purchasingWorkQueue = new WorkQueue();
        tallyWorkQueue = new WorkQueue();
    }

    public ProductDirectory getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductDirectory productCatalog) {
        this.productCatalog = productCatalog;
    }

    public WorkQueue getPurchasingWorkQueue() {
        return purchasingWorkQueue;
    }

    public void setPurchasingWorkQueue(WorkQueue PurchasingWorkQueue) {
        this.purchasingWorkQueue = PurchasingWorkQueue;
    }

    public WorkQueue getTallyWorkQueue() {
        return tallyWorkQueue;
    }

    public void setTallyWorkQueue(WorkQueue tallyWorkQueue) {
        this.tallyWorkQueue = tallyWorkQueue;
    }
       
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
