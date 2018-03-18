/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Provider;
import Business.Role.ProviderManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class ProviderManagerOrganization extends Organization {
     ProviderManagerOrganization() {
        super(Type.ProviderManager.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderManager());
        return roles;
    }
}
