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
public class Business {
    private SupplierDirectory supplierdirectory;
    private MarketOfferCatalog marketoffercatalog;
    private MarketList marketlist;
    private ProductDirectory productdirectory;
    private CustomerDirectory customerdirectory;
    private OrderList orderlist;
   

    public Business() {
        supplierdirectory = new SupplierDirectory();
        marketoffercatalog = new MarketOfferCatalog();
        marketlist = new MarketList();
        productdirectory = new ProductDirectory();
        customerdirectory = new CustomerDirectory();
        orderlist = new OrderList();
    }

    public OrderList getOrderlist() {
        return orderlist;
    }

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }

    public ProductDirectory getProductdirectory() {
        return productdirectory;
    }

    public SupplierDirectory getSupplierdirectory() {
        return supplierdirectory;
    }

    public MarketOfferCatalog getMarketoffercatalog() {
        return marketoffercatalog;
    }

    public MarketList getMarketlist() {
        return marketlist;
    }

    
    
    
    
}
