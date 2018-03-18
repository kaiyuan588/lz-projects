/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.Useraccount.UserAccount;

/**
 *
 * @author Ruby
 */
public class Configure {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = system.getPersondirectory().createPerson("Lai Zhang");
        
        UserAccount ua = system.getUseraccountdirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        
        return system;
        
        
    }
}
