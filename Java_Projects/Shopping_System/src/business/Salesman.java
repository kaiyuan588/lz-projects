/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class Salesman {
    private String fullname;
    private String marketname;
    private ArrayList<UserAccount> useraccount;
    private ArrayList<Order> orderlist;
    
    public Salesman(){
        useraccount = new ArrayList<UserAccount>();
        orderlist = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }
    
    public Order addOrder(){
        Order o = new Order();
        orderlist.add(o);
        return o;
    }
    public void deleteOrder(Order o){
        orderlist.remove(o);
    }
    

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMarketname() {
        return marketname;
    }

    public void setMarketname(String marketname) {
        this.marketname = marketname;
    }

    public ArrayList<UserAccount> getUseraccount() {
        return useraccount;
    }
    
    @Override
    public String toString() {
        return this.getFullname()+ "";
    }


    
    
    
}
