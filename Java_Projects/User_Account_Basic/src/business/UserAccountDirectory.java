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
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccount;

    
    public ArrayList<UserAccount> getUseraccount() {
        return useraccount;
    }
    
    public UserAccountDirectory(){
        useraccount = new ArrayList<UserAccount>();
    }
    
    public UserAccount addUser(){
        UserAccount ua = new UserAccount();
        useraccount.add(ua);
        return ua;
    }
    
    public void deleteUser(UserAccount ua){
        useraccount.remove(ua);
    }
}
