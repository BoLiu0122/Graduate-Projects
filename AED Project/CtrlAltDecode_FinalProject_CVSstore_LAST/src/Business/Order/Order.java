/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Enterprise.CVSEnterprise;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author xtdon
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private String orderNumber;
    //private static int count = 0;
    private CVSEnterprise enterprise;
    private UserAccount customerAccount;
    private String status;
    
    public Order()
    {
        
        orderNumber = String.valueOf(Calendar.getInstance().getTimeInMillis());
        orderItemList = new ArrayList<OrderItem>();
    }

    public CVSEnterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(CVSEnterprise enterprise) {
        this.enterprise = enterprise;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public OrderItem addOrderItem(Product p, int q, double price)
    {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }
    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
    
    public double getTotalPrice(){
        double total = 0;
        for(OrderItem o: orderItemList){
            total += o.getTotalPrice();
        }
        
        return total;
    }

    public UserAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(UserAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double getFoodProfit(){
        double profit = 0;
        for(OrderItem oi: orderItemList){
            profit += oi.getFoodProfit();
        }
        return profit;
    }
    
    public double getToiletryProfit(){
        double profit = 0;
        for(OrderItem oi: orderItemList){
            profit += oi.getToiletryProfit();
        }
        return profit;
    }
    public double getFreshProfit(){
        double profit = 0;
        for(OrderItem oi: orderItemList){
            profit += oi.getFreshProfit();
        }
        return profit;
    }
    public double getToolProfit(){
        double profit = 0;
        for(OrderItem oi: orderItemList){
            profit += oi.getToolProfit();
        }
        return profit;
    }
    
    @Override
    public String toString(){
        return orderNumber + "";
    }
}
