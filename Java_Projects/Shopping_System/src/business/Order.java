/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Ruby
 */
public class Order {
    private String customername;
    private double actualprice;
    private double targetprice;
    private String salesmanname;
    private int productid;
    private String marketname;
    private int quantity;

    public double getTargetprice() {
        return targetprice;
    }

    public void setTargetprice(double targetprice) {
        this.targetprice = targetprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMarketname() {
        return marketname;
    }

    public void setMarketname(String marketname) {
        this.marketname = marketname;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public double getActualprice() {
        return actualprice;
    }

    public void setActualprice(double actualprice) {
        this.actualprice = actualprice;
    }

    public String getSalesmanname() {
        return salesmanname;
    }

    public void setSalesmanname(String salesmanname) {
        this.salesmanname = salesmanname;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.getProductid())+ "";
    }
    
}
