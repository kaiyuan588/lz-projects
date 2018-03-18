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
public class CustomerRequest extends Request{
    private UserAccount customeraccount;
    
    
    private CustomerRequestType requesttype;
    private Room room;
    
    public enum CustomerRequestType {
        Sales,
        Purchase;
    }

    public CustomerRequest(UserAccount customeraccount, RealEstate realestate, String Date, int requestid, CustomerRequestType requesttype, Room room) {
        super(realestate,requestid,Date);
        this.customeraccount = customeraccount;
        this.requesttype = requesttype;
        this.room = room;
    }

    public UserAccount getCustomeraccount() {
        return customeraccount;
    }

    public CustomerRequestType getRequesttype() {
        return requesttype;
    }

    public Room getRoom() {
        return room;
    }

    
    
    
    
    
    
    
}
