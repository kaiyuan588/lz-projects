/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.City.City;
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
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, City city){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.LandOwner){
            enterprise = new LandOwner(name,city);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Developer){
            enterprise = new Developer(name,city);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Agency){
            enterprise = new Agency(name,city);
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
