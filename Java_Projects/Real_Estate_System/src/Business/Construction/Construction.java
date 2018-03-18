/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Construction;

import Business.Realestate.RealEstate;

/**
 *
 * @author 55303
 */
public class Construction {
    private String name;
    private int ID;
    private ConstructionType type;
    private String address;
    private double area;
    private double price;
    private double cost;
    private String developer;
    private double topprice;
    private double bottomprice;
    private RealEstate realestate;

    public RealEstate getRealestate() {
        return realestate;
    }

    public void setRealestate(RealEstate realestate) {
        this.realestate = realestate;
    }
    
     public enum ConstructionType{
        Residence("Residence"),
        Sanitation("Sanitation"),
        OfficeBuilding("OfficeBuilding"),
        CommericalCenter("CommericalCenter"),
        Military("Military"),
        TransportationCenter("TransportationCenter"),
        Education("Education"),
        Governance("Governance");
        
        private String value;
        private ConstructionType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
       
    }

    public Construction(ConstructionType type) {
        this.type = type;
    }
     
    
    public double getCost() {
        return cost;
    }
    

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ConstructionType getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTopprice() {
        return topprice;
    }

    public void setTopprice(double topprice) {
        this.topprice = topprice;
    }

    public double getBottomprice() {
        return bottomprice;
    }

    public void setBottomprice(double bottomprice) {
        this.bottomprice = bottomprice;
    }
   
      @Override
        public String toString() {
            return name;
        }
}
