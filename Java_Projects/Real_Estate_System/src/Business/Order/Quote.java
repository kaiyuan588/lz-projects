/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Realestate.RealEstate;
import Business.Realestate.Room;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Ruby
 */
public class Quote {
    private UserAccount ua;
    private Room room;
    private double unitprice;
    private double discount;
    private RealEstate realestate;
    private int quoteid;
    private double totalprice;
    private double agencycharge;

    public Quote(UserAccount ua, Room room, RealEstate realestate) {
        this.ua = ua;
        this.room = room;
        this.realestate = realestate;
        this.quoteid = (int)(System.currentTimeMillis()%1000000000);
    }

    public UserAccount getUa() {
        return ua;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public double getAgencycharge() {
        return agencycharge;
    }

    public void setAgencycharge(double agencycharge) {
        this.agencycharge = agencycharge;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public Room getRoom() {
        return room;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public double getDiscount() {
        return discount;
    }

    public RealEstate getRealestate() {
        return realestate;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getQuoteid() {
        return quoteid;
    }

    @Override
    public String toString() {
        return String.valueOf(this.quoteid);
    }
    
    
}
