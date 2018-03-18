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
public class PersonDirectory {
    private ArrayList<Person> person;

    public ArrayList<Person> getPerson() {
        return person;
    }

    public PersonDirectory(ArrayList<Person> person) {
        this.person = person;
    }

    public PersonDirectory(){
        person = new ArrayList<Person>();
    }
    
    public Person addPerson(){
        Person pe = new Person();
        person.add(pe);
        return pe;
    }
    
    public void deletePerson(Person ps){
        person.remove(ps);
    }
    
}
