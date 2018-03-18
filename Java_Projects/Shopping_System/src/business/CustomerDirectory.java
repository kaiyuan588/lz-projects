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
public class CustomerDirectory {
    private ArrayList<Customer> customer;
    
    public CustomerDirectory(){
        customer = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }
    
    public Customer addCustomer(){
        Customer c = new Customer();
        customer.add(c);
        return c;
    }
    public void deleteCustomer(Customer c){
        customer.remove(c);
    }
}
