/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruby
 */
public class Plane {
    private int flightid;
    private String company;
    private String model;
    private int totalseats;
    private double totalrevenue;

    public double getTotalrevenue() {
        return totalrevenue;
    }

    public void setTotalrevenue(double totalrevenue) {
        this.totalrevenue = totalrevenue;
    }

    public void setFlightid(int flightid) {
        this.flightid = flightid;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    
    

    public int getFlightid() {
        return flightid;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

 
    
    

    

    
    
    
}
