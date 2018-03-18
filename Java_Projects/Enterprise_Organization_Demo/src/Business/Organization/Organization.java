/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.Useraccount.UserAccount;
import Business.Useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public abstract class Organization {
    private String name;
    private PersonDirectory persondirectory;
    private UserAccountDirectory useraccountdirectory;
    private int organizationID;
    public enum Type{
        SystemAdmin(" System Admin Organization"),
        Provider("Provider Organization"),
        ProviderManager("Provider Manager"),
        EnterpriseAdmin("Enterprise Admin"),
        Distributor("Distributor Organization"),
        SateliteClinic("Satelite Clinic Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Person findperson(int id){
        for(Person p : persondirectory.getPersonlist()){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
    
    public Person findpersonname(String name){
        for(Person p : persondirectory.getPersonlist()){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
    
    public UserAccount finduser(String un){
        for(UserAccount ua : useraccountdirectory.getUserAccountList()){
            if(ua.getUsername().equals(un)){
                return ua;
            }
        }
        return null;
    }
    public Organization(String name){
        this.name = name;
        persondirectory = new PersonDirectory();
        useraccountdirectory = new UserAccountDirectory();
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
