/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.City.City;
import Business.Order.AgentRequest;
import Business.Order.RealEstateOrder;
import Business.Order.CustomerRequest;
import Business.Realestate.RealEstate;
import Business.Realestate.Room;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class Agency extends Enterprise{

    private ArrayList<RealEstate> realestateOnsale;
    private ArrayList<CustomerRequest> customerrequestlist;
    private ArrayList<RealEstateOrder> orderlist;
    private ArrayList<AgentRequest> agentrequestlist;

    public Agency (String name, City city) {
        super(name, EnterpriseType.Agency, city);
        realestateOnsale = new ArrayList<RealEstate>();
        customerrequestlist = new ArrayList<CustomerRequest>();
        orderlist = new ArrayList<RealEstateOrder>();
        agentrequestlist = new ArrayList<AgentRequest>();
        
    }

    public ArrayList<RealEstate> getRealestateOnsale() {
        return realestateOnsale;
    }

    public ArrayList<CustomerRequest> getCustomerrequestlist() {
        return customerrequestlist;
    }

    public ArrayList<AgentRequest> getAgentrequestlist() {
        return agentrequestlist;
    }

    public boolean checkIfCustomerRequestExists(RealEstate r, Room rm, UserAccount ua){
        for(CustomerRequest rq : customerrequestlist){
            if(rq.getRealestate().getId()==r.getId() && rq.getRoom().getRoomid()==rm.getRoomid() && ua.getUsername()==ua.getUsername()){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkIfAgencyRequestExists(RealEstate r, Developer d){
        for(AgentRequest rq : agentrequestlist){
            if(rq.getRealestate().getId()==r.getId() && rq.getDeveloper().getName()==d.getName() && rq.getDeveloper().getOrganizationID()==d.getOrganizationID()){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkIfCustomerOrderExists(RealEstate r, Room rm, UserAccount ua){
        for(RealEstateOrder rq : orderlist){
            if(rq.getRealestate().getId()==r.getId() && rq.getRoom().getRoomid()==rm.getRoomid() && ua.getUsername()==ua.getUsername()){
                return true;
            }
        }
        return false;
    }
    

    public ArrayList<RealEstateOrder> getOrderlist() {
        return orderlist;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
