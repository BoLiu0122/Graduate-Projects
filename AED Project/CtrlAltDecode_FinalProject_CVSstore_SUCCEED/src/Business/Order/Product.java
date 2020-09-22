/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.Calendar;

/**
 *
 * @author Bo
 */
public abstract class Product {
    public enum ProductType{
        Drug("Drug"),
        FreshFood("Fresh Food"),
        Drink("Drink"),
        Tool("Tool");
        
        private String value;
        
        private ProductType(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
    
    private ProductType productType;
    private String prodName;
    double price;
    private double costPrice;
    private String modelNumber;
    private int available;
    

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }
    
    public abstract double getSalesPrice();
    
    public Product(ProductType type) {
        //count++;
        modelNumber = String.valueOf(Calendar.getInstance().getTimeInMillis());
        this.productType = type;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getAvail() {
        return available;
    }

    public void setAvail(int avail) {
        this.available = avail;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }
    
    
}
