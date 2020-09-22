/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Bo
 */
public class DeliveryPlatformEnterprise extends Enterprise {
    private WorkQueue ReceivingWorkQueue;
    private WorkQueue SendingWorkQueue;
    
    public DeliveryPlatformEnterprise(String name){
        super(name,Enterprise.EnterpriseType.DeliveryPlatform);
        ReceivingWorkQueue = new WorkQueue();
        SendingWorkQueue = new WorkQueue();
    }
    
    public WorkQueue getReceivingWorkQueue() {
        return ReceivingWorkQueue;
    }

    public void setReceivingWorkQueue(WorkQueue ReceivingWorkQueue) {
        this.ReceivingWorkQueue = ReceivingWorkQueue;
    }

    public WorkQueue getSendingWorkQueue() {
        return SendingWorkQueue;
    }

    public void setSendingWorkQueue(WorkQueue SendingWorkQueue) {
        this.SendingWorkQueue = SendingWorkQueue;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
