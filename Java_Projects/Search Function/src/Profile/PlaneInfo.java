/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ruby
 */
public class PlaneInfo {
    
    private int id;
    private boolean avail;
    private String mft;
    private int madeyear;
    private int seats;
    private int model;
    private String airliner;
    private long update;
    private String airport;
    private String expdate;
    
    
   public static void updatetime(String args[]) {
      Date dNow = new Date();
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public String getMft() {
        return mft;
    }

    public void setMft(String mft) {
        this.mft = mft;
    }

    public int getMadeyear() {
        return madeyear;
    }

    public void setMadeyear(int madeyear) {
        this.madeyear = madeyear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public long getUpdate() {
        return update;
    }

    public void setUpdate(long update) {
        this.update = update;
    }

  

   

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    @Override
    public String toString() {
        return this.id+ "";
    }
    
    
}
