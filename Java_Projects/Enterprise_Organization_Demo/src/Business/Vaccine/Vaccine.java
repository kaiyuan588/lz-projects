/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author Ruby
 */
public class Vaccine {
    private String vaccinename;
    private String againstdisease;
    private int inventory;

    public String getVaccinename() {
        return vaccinename;
    }

    public void setVaccinename(String vaccinename) {
        this.vaccinename = vaccinename;
    }

    public String getAgainstdisease() {
        return againstdisease;
    }

    public void setAgainstdisease(String againstdisease) {
        this.againstdisease = againstdisease;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return this.vaccinename + "";
    }
    
   
}
