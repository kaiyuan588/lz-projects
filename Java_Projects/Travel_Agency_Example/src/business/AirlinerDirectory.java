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
public class AirlinerDirectory {
    private ArrayList<Flight> airliner;

    public ArrayList<Flight> getAirliner() {
        return airliner;
    }

    public void Airliner(ArrayList<Flight> airliner) {
        this.airliner = airliner;
    }
    
    public AirlinerDirectory(){
        airliner = new ArrayList<Flight>(); 
    }
    
    public Flight addFlight(){
        Flight fl = new Flight();
        airliner.add(fl);
        return fl;
    }
    
    public void deleteFlights(Flight f){
        
        airliner.remove(f);
    }
    
    
}
