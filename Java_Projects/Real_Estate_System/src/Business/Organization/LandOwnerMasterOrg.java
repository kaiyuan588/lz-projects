/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.LandOwnerMaster;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author yangyufan
 */

public class LandOwnerMasterOrg extends Organization{
    public LandOwnerMasterOrg(){
        super(Type.LandownerMasterOrg.getValue());
    }
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LandOwnerMaster());
        return roles;
    }
}
