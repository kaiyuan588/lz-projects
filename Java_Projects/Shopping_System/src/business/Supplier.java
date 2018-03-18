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
public class Supplier {
    private String suppliername;
    private ArrayList<UserAccount> useraccount;
    private ProductCatalog productcatalog;
    
    public Supplier(){
        useraccount = new ArrayList<UserAccount>();
        productcatalog = new ProductCatalog();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public ProductCatalog getProductcatalog() {
        return productcatalog;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public ArrayList<UserAccount> getUseraccount() {
        return useraccount;
    }
    
    @Override
    public String toString() {
        return this.getSuppliername()+ "";
    }

  
    
    
}
