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
public class ReservationDirectory {
    private ArrayList<Reservation> reservation;

    public ReservationDirectory(ArrayList<Reservation> reservation) {
        this.reservation = reservation;
    }

    public ArrayList<Reservation> getReservation() {
        return reservation;
    }

    public ReservationDirectory(){
        reservation = new ArrayList<Reservation>(); 
    }
    
    public Reservation addReservation(){
        Reservation re = new Reservation();
        reservation.add(re);
        return re;
    }
    
    public void cancelReservation(Reservation r){
        
        reservation.remove(r);
    }

}
