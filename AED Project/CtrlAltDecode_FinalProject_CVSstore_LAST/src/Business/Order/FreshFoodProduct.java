
package Business.Order;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xtdon
 */
public class FreshFoodProduct extends Product {
    public FreshFoodProduct(){
        super(ProductType.FreshFood);
    }
    
    @Override 
    public double getSalesPrice(){
        return price;
    }
}
