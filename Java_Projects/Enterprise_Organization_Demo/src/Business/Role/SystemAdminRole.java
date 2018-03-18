/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Useraccount.UserAccount;
import Interface.SystemAdmin.SystemAdminManage;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class SystemAdminRole extends Role{

    

    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, EcoSystem b) {
        return new SystemAdminManage(p,b);
    }
    
}
