/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bo
 */
public class ProductDirectory {
    private List<Product> productList;

    public ProductDirectory() {
        productList = new ArrayList<Product>();
    }
    
    public List<Product> getProductList(){
        return productList;
    }
    
    public void addProducts(Order order){
        Product p = null;
        for(OrderItem oi: order.getOrderItemList()){
            p = createAndAddProduct(oi.getProduct().getProductType());
            p.setAvail(oi.getQuantity());
            p.setPrice(oi.getSalesPrice());
            p.setProdName(oi.getProduct().getProdName());
            p.setCostPrice(oi.getProduct().getPrice());
            p.setModelNumber(oi.getProduct().getModelNumber());
        }
    }
    
    public Product createAndAddProduct(Product.ProductType type){
        Product product = null;
        if(type == Product.ProductType.FreshFood){
            product = new FreshFoodProduct();
            productList.add(product);
        }
        else if(type == Product.ProductType.Drug){
            product = new DrugProduct();
            productList.add(product);
        }
        else if(type == Product.ProductType.Tool){
            product = new ToolProduct();
            productList.add(product);
        }
        else if(type == Product.ProductType.Drink){
            product = new DrinkProduct();
            productList.add(product);
        }
        return product;
    }
    
    public void removeProduct(Product p){
        productList.remove(p);
    }
    
    public Product searchProduct(String id){
        for (Product product : productList) {
            if(product.getModelNumber()==id){
                return product;
            }
        }
        return null;
    }
    
}
