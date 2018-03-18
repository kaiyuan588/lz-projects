/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Agency;
import Business.Enterprise.Enterprise;
import Business.Order.Quote;
import Business.Organization.AgencyCustomerOrg;
import Business.Organization.Organization;
import Business.Realestate.RealEstate;
import Business.Realestate.Room;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import UserInterface.AgencyCustomerRole.CustomerManage;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class AgencyCustomer extends Role{
    private CustomerType customertype;
    private ArrayList<Quote> quotelist;
    
    public AgencyCustomer(CustomerType customertype) {
        this.customertype = customertype;
        this.quotelist = new ArrayList<Quote>();
    }
    
    public enum CustomerType{
        NormalCitizen("Normal Citizen"),
        PublicServiceEmployee("Public Service Employee"),
        GovernmentEmployee("GovernmentEmployee");
        
        private String value;
        private CustomerType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public CustomerType getCustomertype() {
        return customertype;
    }

    public ArrayList<Quote> getQuotelist() {
        return quotelist;
    }
    
    public Quote findQuote(RealEstate r, Room rm, UserAccount ua){
       for(Quote q : quotelist){
           if(q.getRealestate().equals(r) && q.getRoom().equals(rm) && q.getUa().equals(ua)){
               return q;
           }
       }
       return null;
    }
    
    
    
    @Override
    public JPanel createWorkArea(JPanel p, UserAccount ua, Organization o, Enterprise e, Rssystem b) {
        return new CustomerManage(p,b,(Agency)e,(AgencyCustomerOrg)o,ua);
    }
    
}
