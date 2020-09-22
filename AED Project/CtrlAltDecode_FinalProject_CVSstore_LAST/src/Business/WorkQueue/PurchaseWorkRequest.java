/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Tianyu
 */
public class PurchaseWorkRequest extends WorkRequest{
    
    private String purchaseResult = "";

    public String getPurchaseResult() {
        return purchaseResult;
    }

    public void setPurchaseResult(String purchaseResult) {
        this.purchaseResult = purchaseResult;
    }    
    
}
