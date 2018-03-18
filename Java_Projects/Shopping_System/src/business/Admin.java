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
public class Admin {
    private String fullname;
    private ArrayList<UserAccount> useraccount;
    public Admin(){
        useraccount = new ArrayList<UserAccount>();
    }

    public String getFullname() {
        return fullname;
    }

    public ArrayList<UserAccount> getUseraccount() {
        return useraccount;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    @Override
    public String toString() {
        return this.getFullname()+ "";
    }
}
