
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruby
 */
public class Flight {
    
    private int flightid;
    private String depart;
    private String arrive;
    private String airport;
    private double []seatprice;
    
    

    public void setFlightid(int flightid) {
        this.flightid = flightid;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public double[] getSeatprice() {
        return seatprice;
    }

    public void setSeatprice(double[] seatprice) {
        this.seatprice = seatprice;
    }

    

    

    

    
    public int getFlightid() {
        return flightid;
    }

    public String getDepart() {
        return depart;
    }

    public String getArrive() {
        return arrive;
    }

    public String getAirport() {
        return airport;
    }
    
    
    
    
}
