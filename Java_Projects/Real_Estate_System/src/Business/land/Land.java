/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.land;

import Business.Enterprise.LandOwner;

/**
 *
 * @author Ruby
 */
public class Land {
    private LandOwner landowner;
    private String address;
    private double area;
    private double unitprice;
    private double topprice;
    private double bottomprice;
    private String category;
    private int id;
    private boolean status;
    

    public Land(LandOwner landowner) {
        this.landowner = landowner;
        this.status = true;
    }

    public LandOwner getLandowner() {
        return landowner;
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
    
    

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
    
    
}
