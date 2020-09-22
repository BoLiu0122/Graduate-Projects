/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author Kaushik
 * @author Tianyu
 */
public class DrugProduct extends Product {
    public DrugProduct(){
        super(ProductType.Drug);
    }
    @Override 
    public double getSalesPrice(){
        return price;
    }
}
