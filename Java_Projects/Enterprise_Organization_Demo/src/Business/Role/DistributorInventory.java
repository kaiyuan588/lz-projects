/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DistributorInvetOrganization;
import Business.Organization.Organization;
import Business.Organization.ProviderOrganization;
import Business.Useraccount.UserAccount;
import Interface.DistributorManager.DistributorWorkArea;
import Interface.Provider.ProviderWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class DistributorInventory extends Role{
    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, EcoSystem b) {
        return new DistributorWorkArea(p,b,e,ua,(DistributorInvetOrganization)o);
    }
}
