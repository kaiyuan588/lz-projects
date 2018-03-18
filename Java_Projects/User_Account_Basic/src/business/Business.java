/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Ruby
 */
public class Business {
    private PersonDirectory persondirectory;
    private UserAccountDirectory useraccountdirectory;
    
    public Business() {
        persondirectory = new PersonDirectory();
        useraccountdirectory = new UserAccountDirectory();
    }
    
    public String passwordtohash(String inputpassword){
        
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(inputpassword.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    
    
    
}
