/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributorInventory;
import Business.Role.Provider;
import Business.Role.Role;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class DistributorInvetOrganization extends Organization{
    private VaccineDirectory vaccinedirectory;
    
    
    public DistributorInvetOrganization() {
        super(Type.Distributor.getValue());
        vaccinedirectory = new VaccineDirectory();
        
    }

    

    public VaccineDirectory getVaccinedirectory() {
        return vaccinedirectory;
    }
    
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorInventory());
        return roles;
    }
}
