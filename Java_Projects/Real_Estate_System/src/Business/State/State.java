/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.City.City;
import Business.Network.CountryNetwork;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class State {
    private String name;
    private CountryNetwork network;
    private ArrayList<City> citylist;
    
    public State(CountryNetwork cn){
        this.network = cn;
        citylist = new ArrayList<City>();
    }

    public CountryNetwork getNetwork() {
        return network;
    }
    
    
    public String getName() {
        return name;
    }

    public ArrayList<City> getCitylist() {
        return citylist;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    public boolean checkUniqueCity(String name){
        Boolean e = null;
        for (City c : citylist){
            if(c.getName().equals(name)){
                e = false;
                return false;
            }
        }
        if(e == null){
            return true;
        }
        return true;
    }
    
    public City findCity(String name){
        for(City c : citylist){
            if(name.equals(c.getName())){
                return c;
            }
        }
        return null;
    }
}
