/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LandOwnerEvaluator;
import Business.Role.Role;
import Business.land.Land;
import java.util.ArrayList;

/**
 *
 * @author yangyufan
 */
public class LandOwnerEvaluatorOrg extends Organization{
    private ArrayList<Land> tobeevaluated;
    public LandOwnerEvaluatorOrg(){
        super(Type.LandownerEvaluatorOrg.getValue());
        tobeevaluated = new ArrayList<Land>();
    }

    public ArrayList<Land> getTobeevaluated() {
        return tobeevaluated;
    }
    
    public Land findland(int id){
        for(Land ld : tobeevaluated){
            if(ld.getId()==id){
                return ld;
            }
        }
        return null;
    }
    
    public boolean checkiflandrequestexists(Land l){
        for(Land ld : tobeevaluated){
            if(ld.getId()==l.getId()){
                return true;
            }
        }
        return false;
    }
    
    
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LandOwnerEvaluator());
        return roles;
    }
}
