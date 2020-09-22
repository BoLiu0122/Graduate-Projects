/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author Kaushik
 */
public class DrinkProduct extends Product {
    public DrinkProduct(){
        super(ProductType.Drink);
    }
    @Override 
    public double getSalesPrice(){
        double sales = price*1.0625;
        sales = (double) Math.round(sales * 100) / 100;
        return sales;
    }
}
