/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Realestate;

import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class Floor {
    private int floornum;
    private ArrayList<Room> roomlist;

    public Floor() {
        roomlist = new ArrayList<Room>();
    }

    public void setFloornum(int floornum) {
        this.floornum = floornum;
    }

    public int getFloornum() {
        return floornum;
    }

    public ArrayList<Room> getRoomlist() {
        return roomlist;
    }
    
    
}
