/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.City.City;
import Business.Construction.Construction;
import Business.Order.AgentRequest;
import Business.Order.LandOrder;
import Business.Realestate.RealEstate;
import Business.Role.Role;
import Business.land.Land;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class Developer extends Enterprise{
        
    private ArrayList<RealEstate> realestatelist;
    private ArrayList<Construction> constructionlist;
    private ArrayList<Land> landlist;
    private ArrayList<LandOrder> orderlist;
    private ArrayList<AgentRequest> agentrequestlist;
    
    public Developer (String name, City city) {
        super(name, EnterpriseType.Developer, city);
        realestatelist = new ArrayList<RealEstate>();
        landlist = new ArrayList<Land>();
        constructionlist = new ArrayList<Construction>();
        orderlist = new ArrayList<LandOrder>();
        agentrequestlist = new ArrayList<AgentRequest>();
    }

    public ArrayList<LandOrder> getOrderlist() {
        return orderlist;
    }

    public ArrayList<AgentRequest> getAgentrequestlist() {
        return agentrequestlist;
    }
    

    public ArrayList<RealEstate> getRealestatelist() {
        return realestatelist;
    }
    
    public ArrayList<Construction> getConstructionlist() {
        return constructionlist;
    }
    
    public ArrayList<Land> getLandlist() {
        return landlist;
    }
    
     public Land findLand(String ad){
        for(Land l : landlist){
            if(l.getAddress().equals(ad)){
                return l;
            }
        }
        return null;
    }
     
    public RealEstate findRealEstate(int id){
        for(RealEstate r: realestatelist){
            if(r.getId() == id){
                return r;
            }
        }
        return null;
    }
     
     public void deleteConstruction(Construction construction) {
        constructionlist.remove(construction);
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
