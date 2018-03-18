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
public class Person {
    private String fullname;
    private String personrole;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPersonrole() {
        return personrole;
    }

    public void setPersonrole(String personrole) {
        this.personrole = personrole;
    }
    @Override
    public String toString() {
        return this.getFullname()+ "";
    }
}
