/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class History {
    
    private ArrayList<PlaneInfo> history;
    
    public History()
    {
        history=new ArrayList<PlaneInfo>();
    }

    public ArrayList<PlaneInfo> getHistory() {
        return history;
    }

    public void History(ArrayList<PlaneInfo> history) {
        this.history = history;
    }
    
    public PlaneInfo addPlanes()
    {
        PlaneInfo pi= new PlaneInfo();
        history.add(pi);
        return pi;
    }
    
    public void deletePlanes(PlaneInfo p){
        
        history.remove(p);
    }
    
}
