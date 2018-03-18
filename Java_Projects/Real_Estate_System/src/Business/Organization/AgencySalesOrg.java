/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AgencySales;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class AgencySalesOrg extends Organization{
    public AgencySalesOrg() {
        super(Type.AgencySalesOrg.getValue());
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AgencySales());
        return roles;
    }
}
