/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Enterprise.Developer;
import Business.Enterprise.LandOwner;
import Business.land.Land;


/**
 *
 * @author Ruby
 */
public class LandOrder extends Order{
    
    private Developer developer;
    private LandOwner landowner;
    private Land land;

    public LandOrder(Developer developer, LandOwner landowner, Land land) {
        this.developer = developer;
        this.landowner = landowner;
        this.land = land;
    }

    public Land getLand() {
        return land;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public LandOwner getLandowner() {
        return landowner;
    }

    
    
    
    
    
    
    
}
