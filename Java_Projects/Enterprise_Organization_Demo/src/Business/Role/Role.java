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
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        Provider("Provider"),
        DistributorManager("Distributor Manager"),
        EnterpriseAdmin("EnterpriseAdmin"),
        ProviderManager("Provider Manager"),
        SateliteClinic("SateliteClinic");
        
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
    
    public abstract JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, EcoSystem b);
    
    
    
}
