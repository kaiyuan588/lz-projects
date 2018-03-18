/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Agency;
import Business.Enterprise.Enterprise;
import Business.Organization.AgencyDeveloperAgentOrg;
import Business.Organization.Organization;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import UserInterface.AgencyDeveloperAgentRole.AgencyDeveloperAgentManage;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class AgencyDeveloperAgent extends Role{
    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, Rssystem b) {
        return new AgencyDeveloperAgentManage(p,b,(Agency)e,(AgencyDeveloperAgentOrg)o);
    }

    
}
