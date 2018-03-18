/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Agency;
import Business.Enterprise.Enterprise;
import Business.Organization.LandOwnerEvaluatorOrg;
import Business.Organization.Organization;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import UserInterface.LandOwnerEvaluatorRole.EvaluatorManage;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class LandOwnerEvaluator extends Role{
    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, Rssystem b) {
        return new EvaluatorManage(p,b,ua,e,o);
    }

    
}
