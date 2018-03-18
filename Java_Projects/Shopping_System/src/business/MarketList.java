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
public class MarketList {
    private ArrayList<Market> market;

    public ArrayList<Market> getMarket() {
        return market;
    }

    public MarketList() {
        market = new ArrayList<Market>();
    }
    
    public Market findMarket(String fn){
         for(Market m : market){
            if(m.getMarketname().equals(fn)){
                return m;
            } 
         }
         return null;
     } 
    
}
