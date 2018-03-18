/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Realestate.RealEstate;
import Business.Role.LandOwnerManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class LandOwnerManagerOrg extends Organization{
    public LandOwnerManagerOrg() {
        super(Type.LandownerManager.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LandOwnerManager());
        return roles;
    }
}
