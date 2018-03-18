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
public class Market {
    private String marketname;
    private ArrayList<Customer> customer;
    private ArrayList<Salesman> salesman;

    public Market() {
        customer = new ArrayList<Customer>();
        salesman = new ArrayList<Salesman>();
    }

    public String getMarketname() {
        return marketname;
    }

    

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public ArrayList<Salesman> getSalesman() {
        return salesman;
    }

    public void setMarketname(String marketname) {
        this.marketname = marketname;
    }

    
    public Customer addCustomer(){
        Customer c = new Customer();
        customer.add(c);
        return c;
    }
    public void deleteCustomer(Customer c){
        customer.remove(c);
    }
    
    public Salesman addSalesman(){
        Salesman sm = new Salesman();
        salesman.add(sm);
        return sm;
    }
    public void deleteCustomer(Salesman sm){
        salesman.remove(sm);
    }
    public Customer searchCustomer(String fn){
        for(Customer c : customer){
            if(c.getFullname().equals(fn)){
                return c;
            }
        }
        return null;
    }
    
   
    
}
