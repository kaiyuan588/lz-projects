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
public class MarketOfferCatalog {
    private ArrayList<MarketOffer> marketoffer;
    
    public MarketOfferCatalog(){
        marketoffer = new ArrayList<MarketOffer>();
    }

    public ArrayList<MarketOffer> getMarketoffer() {
        return marketoffer;
    }
    
    public MarketOffer addMarketOffer(){
        MarketOffer mo = new MarketOffer();
        marketoffer.add(mo);
        return mo;
    }
    public void deleteMarketOffer(MarketOffer mo){
        marketoffer.remove(mo);
    }
    public MarketOffer findMarketOffer(String fn, int id){
         for(MarketOffer mo : marketoffer){
            if((mo.getMarketname().equals(fn))&&(mo.getProductid() == id)){
                return mo;
            } 
         }
         return null;
     } 
}
