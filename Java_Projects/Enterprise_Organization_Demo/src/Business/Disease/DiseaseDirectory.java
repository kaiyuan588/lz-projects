/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class DiseaseDirectory {
    private ArrayList<Disease> diseasedirectory;

    public ArrayList<Disease> getDiseasedirectory() {
        return diseasedirectory;
    }
    
    public DiseaseDirectory(){
        diseasedirectory = new ArrayList<Disease>();
    }
}
