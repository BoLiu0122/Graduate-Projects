/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author Bo
 */
public class OrderItem {
    private int quantity;
    private double salesPrice;
    private Product product;

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public double getTotalPrice(){
        return salesPrice*quantity;
    }
    
    public double getFoodProfit(){
        if(product instanceof FreshFoodProduct){
            return (salesPrice-product.getCostPrice())*quantity;
        }
        return 0;
    }
    public double getFreshProfit(){
        if(product instanceof DrugProduct){
            return (salesPrice-product.getCostPrice())*quantity;
        }
        return 0;
    }
    public double getToolProfit(){
        if(product instanceof ToolProduct){
            return (salesPrice-product.getCostPrice())*quantity;
        }
        return 0;
    }
    public double getToiletryProfit(){
        if(product instanceof DrinkProduct){
            return (salesPrice-product.getCostPrice())*quantity;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return product.getProdName();
    }
}
