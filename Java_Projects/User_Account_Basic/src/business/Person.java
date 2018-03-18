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
public class Person {
    private String fullname;
    private ArrayList<UserAccount> useraccount;
    private String firstname;
    private String lastname;
    
    public ArrayList<UserAccount> getUseraccount() {
        return useraccount;
    }
    
    public Person(){
        useraccount = new ArrayList<UserAccount>();
    }
    
    public UserAccount addUser(){
        UserAccount ua = new UserAccount();
        useraccount.add(ua);
        return ua;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    @Override
    public String toString() {
        return this.getFirstname()+"";
    }

  

    
}
