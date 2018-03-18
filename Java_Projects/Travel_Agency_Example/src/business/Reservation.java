/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ruby
 */
public class Reservation {
    private int idnum;
    private String firstname;
    private String lastname;
    private int flightnumber;
    private long date;
    private String seat;
    private int reservationcode;
    private double finalprice;
    
    public static void updatetime(String args[]) {
      Date dNow = new Date();
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public double getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(double finalprice) {
        this.finalprice = finalprice;
    }

    public int getReservationcode() {
        return reservationcode;
    }

    public void setReservationcode(int reservationcode) {
        this.reservationcode = reservationcode;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getIdnum() {
        return idnum;
    }

    public void setIdnum(int idnum) {
        this.idnum = idnum;
    }

   

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(int flightnumber) {
        this.flightnumber = flightnumber;
    }
    
    @Override
    public String toString() {
        return this.reservationcode+ "";
    }
}
