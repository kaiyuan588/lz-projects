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
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public abstract class Role {
//    private RoleType roletype;
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        Developer("Developer"),
        Landowner("Landowner"),
        EnterpriseAdmin("EnterpriseAdmin"),
        LandOwnerBuyer("LandOwnerBuer"),
        LandOwnerEvaluator("LandOwnerEvaluator");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

//    public enum RoleType{
//        SystemAdmin("SystemAdmin"),
//        Developer("Developer"),
//        Landowner("Landowner"),
//        EnterpriseAdmin("EnterpriseAdmin");
//        
//        private String value;
//        private RoleType(String value){
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//    
    public abstract JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, Rssystem b);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    
    
}
