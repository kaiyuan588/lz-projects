
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruby
 */
public class Airliner {
    private ArrayList<Plane> airliner;

    public ArrayList<Plane> getAirliner() {
        return airliner;
    }

    public void Airliner(ArrayList<Plane> airliner) {
        this.airliner = airliner;
    }
    
    public Airliner(){
        airliner= new ArrayList<Plane>();
    }
    
    public Plane addPlane(){
        Plane pl =new Plane();
        airliner.add(pl);
        return pl;
    }
}
