/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Organization.Organization;
import Business.Useraccount.UserAccount;
import Interface.DistributorAdmin.DistributorManage;
import Interface.ProviderAdmin.ProviderManage;
import Interface.SupplierAdmin.SupplierManage;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class EnterpriseAdmin extends Role {

    
    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, EcoSystem b) {
        if(e.getEnterpriseType().getValue().equals("Provider")){
            return new ProviderManage(p,b,ua,o,e);//To change body of generated methods, choose Tools | Templates.
        }
        if(e.getEnterpriseType().getValue().equals("Distributor")){
            return new DistributorManage(p,b,ua,o,e);//To change body of generated methods, choose Tools | Templates.
        }
        if(e.getEnterpriseType().getValue().equals("Supplier")){
            return new SupplierManage(p,b,ua,o,e);
        }
        return null;
        
    }
    
}
