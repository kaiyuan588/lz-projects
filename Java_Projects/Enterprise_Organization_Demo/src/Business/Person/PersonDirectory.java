/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class PersonDirectory {
    private ArrayList<Person> personlist;

    public PersonDirectory() {
        personlist = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }
    
    public Person createPerson(String name){
        Person person = new Person();
        person.setName(name);
        personlist.add(person);
        return person;
    }
    public boolean checkuniquepersonid(int id){
        for(int i=0; i<personlist.size(); i++){
            if(id==personlist.get(i).getId())
                return false;
        }
        return true;
    }
}
