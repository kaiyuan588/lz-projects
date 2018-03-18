/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Realestate;

import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class RealEstateDirectory {
    private ArrayList<RealEstate> relist;
    
    public RealEstateDirectory(){
        relist = new ArrayList<RealEstate>();
    }

    public ArrayList<RealEstate> getRelist() {
        return relist;
    }
    
    
}
