/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Realestate;

import Business.Construction.Construction;
import Business.Enterprise.Developer;
import Business.Enterprise.LandOwner;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class RealEstate {
    private String address;
    private LandOwner owner;
    private Developer developer;
    private double unitprice;
    private double wholearea;
    private int id;
    private ArrayList<BufferedImage> realestateimglist; 
    private RealEstateType realestatetype;
    private Construction construction;
    private ArrayList<Floor> floorlist;
    

    public enum RealEstateType{
        Residence("Residence"),Public("Public");
        
        private String value;

        private RealEstateType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    
    public RealEstate(Developer developer, RealEstateType realestatetype, Construction construction) {
        this.developer = developer;
        this.realestatetype = realestatetype;
        this.construction = construction;
        floorlist = new ArrayList<Floor>();
        realestateimglist = new ArrayList<BufferedImage>(); 
    }

    public double getWholearea() {
        return wholearea;
    }

    public RealEstateType getRealestatetype() {
        return realestatetype;
    }

    public ArrayList<BufferedImage> getRealestateimglist() {
        return realestateimglist;
    }

    public ArrayList<Floor> getFloorlist() {
        return floorlist;
    }

    public Construction getConstruction() {
        return construction;
    }

    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LandOwner getOwner() {
        return owner;
    }

    public void setOwner(LandOwner owner) {
        this.owner = owner;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    

    public void setArea(double area) {
        this.wholearea = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    public Room findRoom(int id){
        for(Floor f: floorlist){
            for(Room r: f.getRoomlist()){
                if(r.getRoomid()==id){
                    return r;
                }
            }
        }
        return null;
    }
    
}
