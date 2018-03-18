/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Clinic;
import Business.Role.Role;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class ClinicOrganization extends Organization {
    private VaccineDirectory vaccinedirectory;
    private ProviderOrganization po;
    public ClinicOrganization() {
        super(Type.SateliteClinic.getValue());
        vaccinedirectory = new VaccineDirectory();
        
    }

    public ProviderOrganization getPo() {
        return po;
    }

    public void setPo(ProviderOrganization po) {
        this.po = po;
    }

    public VaccineDirectory getVaccinedirectory() {
        return vaccinedirectory;
    }
    
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Clinic());
        return roles;
    }
}
