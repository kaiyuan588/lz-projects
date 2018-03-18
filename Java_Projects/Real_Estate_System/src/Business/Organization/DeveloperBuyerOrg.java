/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.DevelopersBuyer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 55303
 */
public class DeveloperBuyerOrg extends Organization{
     public DeveloperBuyerOrg() {
        super(Type.DeveloperManager.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DevelopersBuyer());
        return roles;
    }
}
