/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.State.State;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class CountryNetwork {
    private String name;
    private ArrayList<State> statelist;
    
    public CountryNetwork(){
        statelist = new ArrayList<State>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<State> getStatelist() {
        return statelist;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public State findState(String name){
        for(State s : statelist){
            if(name.equals(s.getName())){
                return s;
            }
        }
        return null;
    }
    
    public boolean checkUniqueState(String name){
        Boolean e = null;
        for (State s : statelist){
            if(s.getName().equals(name)){
                e = false;
                return false;
            }
        }
        if(e == null){
            return true;
        }
        return true;
    }
}
