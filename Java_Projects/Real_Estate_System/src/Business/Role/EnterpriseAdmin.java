/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import UserInterface.AgencyAdminRole.AgencyManage;
import UserInterface.DeveloperAdminRole.DeveloperManage;
import UserInterface.LandOwnerAdminRole.LandOwnerManage;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class EnterpriseAdmin extends Role{
    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, Rssystem b) {
        if(e.getEnterpriseType().getValue().equals("Agency")){
            return new AgencyManage(p,b,ua,o,e);
        }
        if(e.getEnterpriseType().getValue().equals("Developer")){
            return new DeveloperManage(p,b,ua,o,e);
        }
        if(e.getEnterpriseType().getValue().equals("LandOwner")){
            return new LandOwnerManage(p,b,ua,o,e);
        }
        return null;
        
    }
}
