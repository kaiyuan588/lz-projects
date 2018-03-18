/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Ruby
 */
public class ConfigureABusiness {
    
    public static Business Initialize (){
        Business b = new Business();
        PersonDirectory pd = b.getPersondirectory();
        UserAccountDirectory ud = b.getUseraccountdirectory();
        String thisLine = null;
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("user.txt"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    UserAccount u = ud.addUser();
                    String[] a = thisLine.split(",");
                    u.setUsername(a[0]);
                    u.setPassword(a[1]);
                    u.setFullname(a[2]);
                    u.setAccountrole(a[3]);
                    if(a[4].equals("Active")){
                        u.setStatus(true);
                    }else{u.setStatus(false);}
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("person.txt"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Person p = pd.addPerson();
                    UserAccount target = null;
                    String[] a = thisLine.split(",");
                    p.setFirstname(a[0]);
                    p.setLastname(a[1]);
                    p.setFullname(a[0]+" "+a[1]);
                    for(int i=0;i<b.getUseraccountdirectory().getUseraccount().size();i++){
                        if(b.getUseraccountdirectory().getUseraccount().get(i).getFullname().equals(p.getFullname())){
                            target = b.getUseraccountdirectory().getUseraccount().get(i);
                            p.getUseraccount().add(target);
                        }
                    }
                    System.out.println(p.getUseraccount());
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}
