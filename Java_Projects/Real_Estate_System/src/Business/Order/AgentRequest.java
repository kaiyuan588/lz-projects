/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Enterprise.Agency;
import Business.Enterprise.Developer;
import Business.Realestate.RealEstate;

/**
 *
 * @author Ruby
 */
public class AgentRequest extends Request{
    private Developer developer;
    private Agency agency;

    public AgentRequest(Developer developer, Agency agency, RealEstate realestate, int requestid, String Date) {
        super(realestate, requestid, Date);
        this.developer = developer;
        this.agency = agency;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public Agency getAgency() {
        return agency;
    }
    
    
    
    
}
