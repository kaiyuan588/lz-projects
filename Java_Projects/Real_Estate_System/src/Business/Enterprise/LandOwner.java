/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.City.City;
import Business.Order.LandOrder;
import Business.Organization.LandOwnerEvaluatorOrg;
import Business.Organization.Organization;
import Business.Realestate.RealEstate;
import Business.Role.Role;
import Business.land.Land;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class LandOwner extends Enterprise{
    private ArrayList<RealEstate> realestatelist;
    private ArrayList<Land> landlist;
    private ArrayList<Land> evaluatedlandlist;
    private ArrayList<Land> pricedlandlist;
    private ArrayList<LandOrder> orderlist;
    
    public LandOwner (String name, City city) {
        super(name, EnterpriseType.LandOwner, city);
        realestatelist = new ArrayList<RealEstate>();
        landlist = new ArrayList<Land>();
        evaluatedlandlist = new ArrayList<Land>();
        pricedlandlist = new ArrayList<Land>();
        orderlist = new ArrayList<LandOrder>();
    }

    public ArrayList<LandOrder> getOrderlist() {
        return orderlist;
    }

    

    public ArrayList<Land> getPricedlandlist() {
        return pricedlandlist;
    }

    
    public ArrayList<Land> getLand() {
        return landlist;
    }

    public ArrayList<Land> getEvaluatedlandlist() {
        return evaluatedlandlist;
    }
    

    public ArrayList<RealEstate> getRealestatelist() {
        return realestatelist;
    }
    
    public Land findevaluatedland(Land l){
        for(Land ld : evaluatedlandlist){
            if(ld.getId()==l.getId()){
                return ld;
            }
        }
        return null;
    }
    
    public Land findpricedland(Land l){
        for(Land ld : pricedlandlist){
            if(ld.getId()==l.getId()){
                return ld;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public boolean checkuniqueLand(int id){
        if(landlist.size()!=0){
            for(int i=0; i<landlist.size(); i++){
                if(id==landlist.get(i).getId())
                    return false;
            }
            return true;
        }else{
            return true;
        }
    }
    
    public ArrayList<LandOwnerEvaluatorOrg> findLandOwnerEvaluator(){
        ArrayList<LandOwnerEvaluatorOrg> evaluatorlist = new ArrayList<LandOwnerEvaluatorOrg>();
        for(Organization o : super.getOrganizationDirectory().getOrganizationList()){
            if(o.getName().equals(Type.LandownerEvaluatorOrg.getValue())){
                evaluatorlist.add((LandOwnerEvaluatorOrg)o);
            }
        }
        return evaluatorlist;
    }
}
