/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Realestate;

/**
 *
 * @author Ruby
 */
public class Room {
    private int roomid;
    private double roomarea;
    private boolean status;

    public Room() {
        this.status = true;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public double getRoomarea() {
        return roomarea;
    }

    public void setRoomarea(double roomarea) {
        this.roomarea = roomarea;
    }

    @Override
    public String toString() {
        return String.valueOf(this.roomid);
    }
    
    

    
}
