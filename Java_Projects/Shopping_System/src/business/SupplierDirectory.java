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
public class SupplierDirectory {
    private ArrayList<Supplier> supplier;
    
    public SupplierDirectory(){
        supplier = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplier() {
        return supplier;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplier.add(s);
        return s;
    }
    public void deleteSupplier(Supplier s){
        supplier.remove(s);
    }
}
