/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.City.City;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Ruby
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private City city;
    public Enterprise(String name, EnterpriseType type, City city) {
        super(name);
        this.enterpriseType = type;
        this.city = city;
        organizationDirectory = new OrganizationDirectory();
    }

    public City getCity() {
        return city;
    }
    
    
    public enum EnterpriseType{
        LandOwner("LandOwner"),Developer("Developer"),Agency("Agency");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
