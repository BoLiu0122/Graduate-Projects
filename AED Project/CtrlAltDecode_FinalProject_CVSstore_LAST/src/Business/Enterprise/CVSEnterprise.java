/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.OrderDirectory;
import Business.Order.ProductDirectory;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Bo
 */
public class CVSEnterprise extends Enterprise {
    private ProductDirectory productDirectory;
    private WorkQueue collectWorkQueue;
    private WorkQueue buyWorkQueue;
    private WorkQueue returnWorkQueue;
    private OrderDirectory orderDirectory;
    private double drugProfit;
    private double freshFoodProfit;
    private double toolProfit;
    private double drinkProfit;
    
    public CVSEnterprise(String name){
        super(name,EnterpriseType.CVS);
        productDirectory = new ProductDirectory();
        collectWorkQueue = new WorkQueue();
        buyWorkQueue = new WorkQueue(); 
        returnWorkQueue = new WorkQueue(); 
        orderDirectory = new OrderDirectory();
        freshFoodProfit = 0;
        toolProfit = 0;
        drinkProfit = 0;
        drugProfit = 0;
    }

    public WorkQueue getReturnWorkQueue() {
        return returnWorkQueue;
    }

    public void setReturnWorkQueue(WorkQueue returnWorkQueue) {
        this.returnWorkQueue = returnWorkQueue;
    }
    
    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }
    
    public WorkQueue getCollectWorkQueue() {
        return collectWorkQueue;
    }

    public void setCollectWorkQueue(WorkQueue collectWorkQueue) {
        this.collectWorkQueue = collectWorkQueue;
    }

    public WorkQueue getBuyWorkQueue() {
        return buyWorkQueue;
    }

    public void setBuyWorkQueue(WorkQueue buyWorkQueue) {
        this.buyWorkQueue = buyWorkQueue;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public double getFreshProfit() {
        return drugProfit;
    }

    public void setDrugProfit(double drugProfit) {
        this.drugProfit = drugProfit;
    }

    public double getDrugProfit() {
        return drugProfit;
    }

    public void setFeshFoodProfit(double foodProfit) {
        this.freshFoodProfit = foodProfit;
    }

    public double getToolProfit() {
        return toolProfit;
    }

    public void setToolProfit(double toolProfit) {
        this.toolProfit = toolProfit;
    }

    public double getDrinkProfit() {
        return drinkProfit;
    }

    public void setDrinkProfit(double drinkProfit) {
        this.drinkProfit = drinkProfit;
    }
    
    public void addDrugProfit(double drugProfit) {
        this.drugProfit += drugProfit;
    }

    public void addFreshFoodProfit(double foodProfit) {
        this.freshFoodProfit += foodProfit;
    }

    public void addToolProfit(double toolProfit) {
        this.toolProfit += toolProfit;
    }

    public void addDrinkProfit(double addDrinkProfit) {
        this.drinkProfit += drinkProfit;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
