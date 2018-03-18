package Business.Organization;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ruby
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.DeveloperManager.getValue())){
            organization = new DeveloperManagerOrg();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.LandownerManager.getValue())){
            organization = new LandOwnerManagerOrg();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
    

//    public Organization findOrg(String name){
//        Organization organization = null;
//        for(int i=0; i<organizationList.size(); i++){
//            if(name.equals(organizationList.get(i).getName())){
//                organization = organizationList.get(i);
//                break;
//            }
//        }
//        return organization;
//    }
//    

    public Organization findOrgbyID(int id){
        Organization organization = null;
        for(int i=0; i<organizationList.size(); i++){
            if(id==organizationList.get(i).getOrganizationID()){
                organization = organizationList.get(i);
                break;
            }
        }
        return organization;
    }
    
    
    public boolean checkuniqueroganizationid(int id){
        for(int i=0; i<organizationList.size(); i++){
            if(id==organizationList.get(i).getOrganizationID())
                return false;
        }
        return true;
    }
    
    
}
