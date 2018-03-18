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
public class RoleManage {
    private ArrayList<Supplier> supplier;
    private ArrayList<Salesman> salesman;
    private ArrayList<Admin> admin;
    public RoleManage(){
        supplier = new ArrayList<Supplier>();
        salesman = new ArrayList<Salesman>();
        admin = new ArrayList<Admin>();
    }

    public ArrayList<Admin> getAdmin() {
        return admin;
    }

    public ArrayList<Supplier> getSupplier() {
        return supplier;
    }

    public ArrayList<Salesman> getSalesman() {
        return salesman;
    }
    public Salesman findSalesman(String fn){
         for(Salesman s : salesman){
            if(s.getFullname().equals(fn)){
                return s;
            } 
         }
         return null;
     } 
    public Supplier findSupplier(String fn){
        for(Supplier s : supplier){
            if(s.getSuppliername().equals(fn))
                return s;
        }
        return null;
    }
}
