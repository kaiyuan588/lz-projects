
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
public class Master {
    private ArrayList<Flight> master;
    
    public Master()
    {
        master=new ArrayList<Flight>();
    }

    public ArrayList<Flight> getMaster() {
        return master;
    }

    public void Master(ArrayList<Flight> master) {
        this.master = master;
    }
    
    public Flight getFId(int id) {
        for (int i = 0; i < master.size(); ++i) {
            if (master.get(i).getFlightid() == id) {
                return master.get(i);
            }
        }
        return null;
    }
    
    public Flight addFlight(){
        Flight f= new Flight();
        master.add(f);
        return f;
    }
}
