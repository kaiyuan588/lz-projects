/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Construction;

import java.util.ArrayList;

/**
 *
 * @author 55303
 */
public class ConstructionDirectory {
      private ArrayList<Construction> conslist;
    
    public ConstructionDirectory(){
        conslist = new ArrayList<Construction>();
    }

    public ArrayList<Construction> getConslist() {
        return conslist;
    }
    public void deleteConstruction(Construction construction) {
        conslist.remove(construction);
    }
}
