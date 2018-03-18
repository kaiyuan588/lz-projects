/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class ProductDirectory {
    private ArrayList<Product> product;
    
    public ProductDirectory(){
        product = new ArrayList<Product>();
    }

    public ArrayList<Product> getproduct() {
        return product;
    }
    
    public Product addProduct(){
        Product p = new Product();
        product.add(p);
        return p;
    }
    public void deleteProduct(Product p){
        product.remove(p);
    }
    public Product searchProduct(int id){
         for(Product product : product){
            if(product.getProductid() == id){
                return product;
            } 
         }
         return null;
     }
}
