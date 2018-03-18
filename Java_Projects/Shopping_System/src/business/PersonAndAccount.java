/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Ruby
 */
public class PersonAndAccount {
    private RoleManage rolemanage;
    private UserAccountDirectory useraccountdirectory;
    private PersonDirectory persondirectory;
    
    public PersonAndAccount(){
        rolemanage = new RoleManage();
        useraccountdirectory = new UserAccountDirectory();
        persondirectory = new PersonDirectory();
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public RoleManage getRolemanage() {
        return rolemanage;
    }


    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }
    
    
}
