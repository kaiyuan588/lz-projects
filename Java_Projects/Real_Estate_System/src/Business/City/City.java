/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import Business.Construction.Construction;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Realestate.RealEstate;
import Business.State.State;
import Business.land.Land;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class City {
    private String name;
    private State state;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Land> landtobesold;
    private ArrayList<Construction> evaluatedConslist;
    private ArrayList<RealEstate> estatetobesold;

    public City(State state) {
        this.state = state;
        landtobesold = new ArrayList<Land>();
        evaluatedConslist = new ArrayList<Construction>();
        enterpriseDirectory = new EnterpriseDirectory();
        estatetobesold = new ArrayList<RealEstate>();
    }

    public State getState() {
        return state;
    }

    public ArrayList<RealEstate> getEstatetobesold() {
        return estatetobesold;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public ArrayList<Land> getLandtobesold() {
        return landtobesold;
    }
     public ArrayList<Construction> getEvaluatedConslist() {
        return evaluatedConslist;
    }
     
    public Land findonshelfland(Land l){
        for(Land ld : landtobesold){
            if(ld.getId()==l.getId()){
                return ld;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean checkUniqueEnterprise(String name){
        Boolean e1 = null;
        for (Enterprise e : enterpriseDirectory.getEnterpriseList()){
            if(e.getName().equals(name)){
                e1 = false;
                return false;
            }
        }
        if(e1 == null){
            return true;
        }
        return true;
    }
        public Construction findevaluatedCons(Construction l){
        for(Construction con : evaluatedConslist){
            if(con.getID()==l.getID()){
                return con;
            }
        }
        return null;
    }
        
    public RealEstate findRealEstate(int id){
        for(RealEstate r: estatetobesold){
            if(r.getId() == id){
                return r;
            }
        }
        return null;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
    
}
