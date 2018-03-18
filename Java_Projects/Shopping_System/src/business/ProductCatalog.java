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
public class ProductCatalog {
    private String suppliername;

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }
    private ArrayList<Product> product;
    
    public ProductCatalog(){
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
    
     public Product searchProduct(int id)
    {
        for(Product p : product)
        {
            if(p.getProductid()==id)
                {
                    return p;
                }
        }
        return null;
    }
}
