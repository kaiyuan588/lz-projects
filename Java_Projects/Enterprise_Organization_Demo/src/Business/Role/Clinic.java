/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Useraccount.UserAccount;
import Interface.Provider.ProviderWorkArea;
import Interface.SateliteClinic.ClinicWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class Clinic extends Role{
    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, EcoSystem b) {
        return new ClinicWorkArea(p,b,e,ua,(ClinicOrganization)o);
    }
}
