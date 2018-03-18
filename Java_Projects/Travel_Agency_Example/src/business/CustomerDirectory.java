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
    private ArrayList<Person> person;

    public CustomerDirectory(ArrayList<Person> person) {
        this.person = person;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }
    
    public CustomerDirectory(){
        person = new ArrayList<Person>(); 
    }
    
    public Person addPerson(){
        Person pe = new Person();
        person.add(pe);
        return pe;
    }

}
