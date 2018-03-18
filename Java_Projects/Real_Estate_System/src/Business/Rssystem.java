/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.CountryNetwork;
import Business.Organization.Organization;
import Business.Realestate.RealEstate;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Ruby
 */
public class Rssystem extends Organization{

    private static Rssystem business;
    private ArrayList<CountryNetwork> networkList;
    private ArrayList<RealEstate> realestatelist;

    public static Rssystem getInstance() {
        if (business == null) {
            business = new Rssystem();
        }
        return business;
    }

    private Rssystem() {
        super(null);
        networkList = new ArrayList<>();
        realestatelist = new ArrayList<RealEstate>();
    }

    public ArrayList<RealEstate> getRealestatelist() {
        return realestatelist;
    }

    public ArrayList<CountryNetwork> getNetworkList() {
        return networkList;
    }
    
    public CountryNetwork createAndAddNetwork() {
        CountryNetwork network = new CountryNetwork();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    public CountryNetwork findNetwork(String name){
        for(CountryNetwork nt : networkList){
            if(nt.getName().equals(name)){
                return nt;
            }
        }
        return null;
    }
    public boolean checkUniqueNetwork(String name){
        Boolean e = null;
        for (CountryNetwork nt : networkList){
            if(nt.getName().equals(name)){
                e = false;
                return false;
            }
        }
        if(e == null){
            return true;
        }
        return true;
    }
}
