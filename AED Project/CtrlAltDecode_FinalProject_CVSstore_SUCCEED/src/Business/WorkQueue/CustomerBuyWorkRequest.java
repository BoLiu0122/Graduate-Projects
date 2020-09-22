/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Tianyu
 */
public class CustomerBuyWorkRequest extends WorkRequest {
    private String customerBuyResult;

    public String getCustomerBuyResult() {
        return customerBuyResult;
    }

    public void setCustomerBuyResult(String customerBuytResult) {
        this.customerBuyResult = customerBuytResult;
    }
}
