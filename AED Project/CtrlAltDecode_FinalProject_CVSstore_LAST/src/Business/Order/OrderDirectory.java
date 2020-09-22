/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author xtdon
 */
public class OrderDirectory {
    private ArrayList<Order> orderDirectory;
    
    public OrderDirectory()
    {
        orderDirectory = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    public void addOrder(Order o)
    {
        orderDirectory.add(o);
       
    }
    
    public void removeOrderItem(Order o){
        orderDirectory.remove(o);
    }
}
