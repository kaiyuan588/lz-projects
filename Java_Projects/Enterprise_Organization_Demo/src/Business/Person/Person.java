/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Useraccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class Person {
    private String name;
    private int id;
    private ArrayList<UserAccount> useraccount;
    
    public Person(){
        useraccount = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUseraccount() {
        return useraccount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
