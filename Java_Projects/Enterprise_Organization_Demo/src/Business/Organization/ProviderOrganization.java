/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Disease.DiseaseDirectory;
import Business.Role.Role;
import Business.Role.Provider;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class ProviderOrganization extends Organization{

    
    private ArrayList<ClinicOrganization> clinic;
    private VaccineDirectory vaccinedirectory;
    
    
    public ProviderOrganization() {
        super(Type.Provider.getValue());
        vaccinedirectory = new VaccineDirectory();
        clinic = new ArrayList<ClinicOrganization>();
    }

    public ArrayList<ClinicOrganization> getClinic() {
        return clinic;
    }

    public VaccineDirectory getVaccinedirectory() {
        return vaccinedirectory;
    }
    
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Provider());
        return roles;
    }
    
}
