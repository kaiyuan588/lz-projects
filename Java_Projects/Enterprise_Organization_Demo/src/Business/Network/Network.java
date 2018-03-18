/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.State.State;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class Network {
    private String name;
    private ArrayList<State> statelist;
    
    public Network(){
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
    
    
}
