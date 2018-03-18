/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.City.City;
import Business.Enterprise.Developer;
import Business.Enterprise.LandOwner;
import Business.Network.CountryNetwork;
import Business.Person.Person;
import Business.Role.DeveloperManager;
import Business.Role.LandOwnerManager;
import Business.Role.SystemAdminRole;
import Business.State.State;

/**
 *
 * @author Ruby
 */
public class Configure {
    public static Rssystem configure(){
        
        Rssystem system = Rssystem.getInstance();
//        CountryNetwork nt = system.createAndAddNetwork();
//        nt.setName("TestNt");
//        State s = new State(nt);
//        s.setName("TestS");
//        City c = new City(s);
//        c.setName("TestC");
//        Developer d = new Developer("TestD",c);
//        LandOwner lo = new LandOwner("TestLO",c);
//        nt.getStatelist().add(s);
//        s.getCitylist().add(c);
//        c.getEnterpriseDirectory().getEnterpriseList().add(d);
//        c.getEnterpriseDirectory().getEnterpriseList().add(lo);
        Person person = system.getPersondirectory().createPerson("Lai Zhang");
//        Person persond = d.getPersondirectory().createPerson("Test D");
//        Person personlo = lo.getPersondirectory().createPerson("Test lo");
        system.getUseraccountdirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
//        d.getUseraccountdirectory().createUserAccount("d", "d", persond, new DeveloperManager());
//        lo.getUseraccountdirectory().createUserAccount("lo", "lo", personlo, new LandOwnerManager());
        return system;
        
        
    }
}
