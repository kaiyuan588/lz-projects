/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Realestate.RealEstate;

/**
 *
 * @author Ruby
 */
public abstract class Request {
    private RealEstate realestate;
    private int requestid;
    private String Date;
    private Boolean status;

    public Request(RealEstate realestate, int requestid, String Date) {
        this.realestate = realestate;
        this.requestid = requestid;
        this.Date = Date;
    }

    public RealEstate getRealestate() {
        return realestate;
    }

    public int getRequestid() {
        return requestid;
    }

    public String getDate() {
        return Date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    
    
    @Override
    public String toString() {
        return String.valueOf(this.requestid);
    }
    
}
