/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Provider){
            enterprise = new ServiceProvider(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Distributor){
            enterprise = new Distributor(name);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Supplier){
            enterprise = new Supplier(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public Enterprise findEnterprise(String name){
        for(Enterprise ep : enterpriseList){
            if(name.equals(ep.getName())){
                return ep;
            }
        }
        return null;
    }
    
}
