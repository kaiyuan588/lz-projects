/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Enterprise.Agency;
import Business.Enterprise.Developer;
import Business.Realestate.RealEstate;
import Business.Realestate.Room;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Ruby
 */
public class RealEstateOrder extends Order{
    private RealEstate realestate;
    private Agency agency;
    private Developer developer;
    private UserAccount ua;
    private Room room;
    private Quote quote;

    public RealEstateOrder(RealEstate realestate, Agency agency,UserAccount ua, Room room, Quote quote) {
        this.realestate = realestate;
        this.agency = agency;
        this.developer = realestate.getDeveloper();
        this.ua = ua;
        this.room = room;
        this.quote = quote;
    }

    public Quote getQuote() {
        return quote;
    }

    public UserAccount getUa() {
        return ua;
    }

    public RealEstate getRealestate() {
        return realestate;
    }

    public Agency getAgency() {
        return agency;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public Room getRoom() {
        return room;
    }
    
    
    
    
    
    
        
}
