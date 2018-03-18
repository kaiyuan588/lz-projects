/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class VaccineDirectory {
    private ArrayList<Vaccine> vaccinedirectory;
    
    public VaccineDirectory(){
        vaccinedirectory = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccinedirectory() {
        return vaccinedirectory;
    }
    
    
}
