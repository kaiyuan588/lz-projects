/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeveloperManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class DeveloperManagerOrg extends Organization{
    public DeveloperManagerOrg() {
        super(Type.DeveloperManager.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeveloperManager());
        return roles;
    }
}
