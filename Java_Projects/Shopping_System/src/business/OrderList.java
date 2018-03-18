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
public class OrderList {
    private ArrayList<Order> order;
    
    public OrderList(){
        order = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrder() {
        return order;
    }
    
    public Order addOrder(){
        Order o = new Order();
        order.add(o);
        return o;
    }
    public void deleteOrder(Order o){
        order.remove(o);
    }
}
