
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruby
 */
public class Customer {
    private ArrayList<Person>customer;

    public Customer() {
        customer=new ArrayList<Person>();
    }

    public ArrayList<Person> getCustomer() {
        return customer;
    }

    public void Customer(ArrayList<Person> customer) {
        this.customer = customer;
    }
    
    public Person addPerson(){
        Person p = new Person();
        customer.add(p);
        return p;
    }
    
    public Person getFId(int id) {
        for (int i = 0; i < customer.size(); ++i) {
            if (customer.get(i).getFlightid() == id) {
                return customer.get(i);
            }
        }
        return null;
    }
}
