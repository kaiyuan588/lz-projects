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
    public PersonDirectory(){
        person = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return person;
    }
    
    public void deletePerson(Person ps){
        person.remove(ps);
    }
    
    public Person findPerson(String fn){
        for(Person s : person ){
            if(s.getFullname().equals(fn))
                return s;
        }
        return null;
    }
    
}
