/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
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
    private PersonDirectory personlist;
    
    
    public enum Type{
        SystemAdmin("System Admin Organization"),
        LandownerManager("Landowner Manager Organization"),
        EnterpriseAdmin("Enterprise Admin"),
        DeveloperManager("Developer Organization"),
        LandownerMasterOrg("LandOwner Master Organization"),
        LandownerEvaluatorOrg("LandOwner Evaluator Organization"),
        AgencyCustomerOrg("Agency Customer Organization"),
        AgencyDeveloperAgentOrg("Agency Developer Agent Organization"),
        AgencySalesOrg("Agency Sales Organization");
        

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
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
    
    public PersonDirectory getPersonlist() {
        return personlist;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
