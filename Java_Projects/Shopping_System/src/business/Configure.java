/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author Ruby
 */
public class Configure {
    public static PersonAndAccount InitializePersonAndAccount (){
        PersonAndAccount pa = new PersonAndAccount();
        UserAccountDirectory ud = pa.getUseraccountdirectory();
        
        String thisLine = null;
        try {
                BufferedReader br = new BufferedReader(new FileReader("user.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    UserAccount u = ud.addUser();
                    String[] a = thisLine.split(",");
                    u.setUsername(a[0]);
                    u.setPassword(a[1]);
                    u.setFullname(a[2]);
                    u.setAccountrole(a[3]);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("salesman.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Salesman sm = new Salesman();
                    String[] a = thisLine.split(",");
                    sm.setFullname(a[0]);
                    sm.setMarketname(a[1]);
                    pa.getRolemanage().getSalesman().add(sm);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        /*Add useraccount to salesman*/
        for(int i=0;i<pa.getRolemanage().getSalesman().size();i++){
            Person ps = new Person();
            ps.setFullname(pa.getRolemanage().getSalesman().get(i).getFullname());
            ps.setPersonrole("Salesman");
            pa.getPersondirectory().getPerson().add(ps);
            for(int j=0; j<pa.getUseraccountdirectory().getUseraccount().size();j++){
                if(pa.getUseraccountdirectory().getUseraccount().get(j).getFullname().equals(pa.getRolemanage().getSalesman().get(i).getFullname())){
                    pa.getRolemanage().getSalesman().get(i).getUseraccount().add(pa.getUseraccountdirectory().getUseraccount().get(j));
                }
            }
        }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("supplier.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Supplier sp = new Supplier();
                    String[] a = thisLine.split(",");
                    sp.setSuppliername(a[0]);
                    pa.getRolemanage().getSupplier().add(sp);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        /*Add useraccount to supplier*/
        for(int i=0;i<pa.getRolemanage().getSupplier().size();i++){
            Person ps = new Person();
            ps.setFullname(pa.getRolemanage().getSupplier().get(i).getSuppliername());
            ps.setPersonrole("Supplier");
            pa.getPersondirectory().getPerson().add(ps);
            for(int j=0; j<pa.getUseraccountdirectory().getUseraccount().size();j++){
                if(pa.getUseraccountdirectory().getUseraccount().get(j).getFullname().equals(pa.getRolemanage().getSupplier().get(i).getSuppliername())){
                    pa.getRolemanage().getSupplier().get(i).getUseraccount().add(pa.getUseraccountdirectory().getUseraccount().get(j));
                }
            }
        }
        
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("admin.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Admin ad = new Admin();
                    String[] a = thisLine.split(",");
                    ad.setFullname(a[0]);
                    pa.getRolemanage().getAdmin().add(ad);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        /*Add useraccount to admin*/
        for(int i=0;i<pa.getRolemanage().getAdmin().size();i++){
            Person ps = new Person();
            ps.setFullname(pa.getRolemanage().getAdmin().get(i).getFullname());
            ps.setPersonrole("Admin");
            pa.getPersondirectory().getPerson().add(ps);
            for(int j=0; j<pa.getUseraccountdirectory().getUseraccount().size();j++){
                if(pa.getUseraccountdirectory().getUseraccount().get(j).getFullname().equals(pa.getRolemanage().getAdmin().get(i).getFullname())){
                    pa.getRolemanage().getAdmin().get(i).getUseraccount().add(pa.getUseraccountdirectory().getUseraccount().get(j));
                }
            }
        }
        return pa;
    }
    
    public static Business InitializeBusiness(PersonAndAccount pa){
        Business b = new Business();
        String thisLine = null;
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("product.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Product p = b.getProductdirectory().addProduct();
                    String[] a = thisLine.split(",");
                    p.setProductid(Integer.parseInt(a[0]));
                    p.setProductname(a[1]);
                    p.setSuppliername(a[2]);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("order.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Order o = b.getOrderlist().addOrder();
                    String[] a = thisLine.split(",");
                    o.setCustomername(a[0]);
                    o.setProductid(Integer.parseInt(a[1]));
                    o.setActualprice(Double.parseDouble(a[2]));
                    o.setMarketname(a[3]);
                    o.setSalesmanname(a[4]);
                    o.setQuantity(Integer.parseInt(a[5]));
                    o.setTargetprice(Double.parseDouble(a[6]));
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("marketoffer.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    MarketOffer mo = b.getMarketoffercatalog().addMarketOffer();
                    String[] a = thisLine.split(",");
                    mo.setProductid(Integer.parseInt(a[0]));
                    mo.setFloor(Double.parseDouble(a[1]));
                    mo.setCeiling(Double.parseDouble(a[2]));
                    mo.setTarget(Double.parseDouble(a[3]));
                    mo.setMarketname(a[4]);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("customer.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Customer c = b.getCustomerdirectory().addCustomer();
                    String[] a = thisLine.split(",");
                    c.setFullname(a[0]);
                    c.setMarketname(a[1]);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("market.csv"));
                while ((thisLine = br.readLine()) != null) {
                    System.out.println(thisLine);
                    Market m = new Market();
                    String[] a = thisLine.split(",");
                    m.setMarketname(a[0]);
                    b.getMarketlist().getMarket().add(m);
                }       
        } catch(Exception e) {
            e.printStackTrace();
        }
        /*Add customer and salesman to each market*/
        for(int i=0; i<b.getMarketlist().getMarket().size();i++){
            for(int j=0; j<b.getCustomerdirectory().getCustomer().size();j++){
                if(b.getCustomerdirectory().getCustomer().get(j).getMarketname().equals(b.getMarketlist().getMarket().get(i).getMarketname())){
                    b.getMarketlist().getMarket().get(i).getCustomer().add(b.getCustomerdirectory().getCustomer().get(j));
                }
            }
            for(int j=0; j<pa.getRolemanage().getSalesman().size();j++){
                if(pa.getRolemanage().getSalesman().get(j).getMarketname().equals(b.getMarketlist().getMarket().get(i).getMarketname())){
                    b.getMarketlist().getMarket().get(i).getSalesman().add(pa.getRolemanage().getSalesman().get(j));
                }
            }
        }
        
        /*Add the product read from csv file into supplierdirectory--supplier--productcatalog--product*/
        for(int i=0; i<pa.getRolemanage().getSupplier().size();i++){
            b.getSupplierdirectory().getSupplier().add(pa.getRolemanage().getSupplier().get(i));
        }
        for (int i=0; i<b.getSupplierdirectory().getSupplier().size();i++){
            b.getSupplierdirectory().getSupplier().get(i).getProductcatalog().setSuppliername(b.getSupplierdirectory().getSupplier().get(i).getSuppliername());
            for(int j=0; j<b.getProductdirectory().getproduct().size();j++){
                if(b.getProductdirectory().getproduct().get(j).getSuppliername().equals(b.getSupplierdirectory().getSupplier().get(i).getSuppliername())){
                    b.getSupplierdirectory().getSupplier().get(i).getProductcatalog().getproduct().add(b.getProductdirectory().getproduct().get(j));
                }
            }
        }
        
        return b;
        
    }
    
    public static void ExportUser(UserAccountDirectory uad){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("user.csv"));
                for(UserAccount line : uad.getUseraccount()){
                    String[] a = new String[4];
                    a[0] = line.getUsername();
                    a[1] = line.getPassword();
                    a[2] = line.getFullname();
                    a[3] = line.getAccountrole();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
    
    public static void ExportCustomer(CustomerDirectory c){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("customer.csv"));
                for(Customer line : c.getCustomer()){
                    String[] a = new String[2];
                    a[0] = line.getFullname();
                    a[1] = line.getMarketname();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
    public static void ExportSalesman(RoleManage rm){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("salesman.csv"));
                for(Salesman line : rm.getSalesman()){
                    String[] a = new String[2];
                    a[0] = line.getFullname();
                    a[1] = line.getMarketname();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
    public static void ExportAdmin(RoleManage rm){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("admin.csv"));
                for(Admin line : rm.getAdmin()){
                    String[] a = new String[1];
                    a[0] = line.getFullname();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
    public static void ExportSupplier(RoleManage rm){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("supplier.csv"));
                for(Supplier line : rm.getSupplier()){
                    String[] a = new String[1];
                    a[0] = line.getSuppliername();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
    
    public static void ExportProducts(ProductDirectory pd){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("product.csv"));
                for(Product line : pd.getproduct()){
                    String[] a = new String[3];
                    a[0] = String.valueOf(line.getProductid());
                    a[1] = line.getProductname();
                    a[2] = line.getSuppliername();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
    
    public static void ExportMarketOffer(MarketOfferCatalog moc){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("marketoffer.csv"));
                for(MarketOffer line : moc.getMarketoffer()){
                    String[] a = new String[5];
                    a[0] = String.valueOf(line.getProductid());
                    a[1] = String.valueOf(line.getFloor());
                    a[2] = String.valueOf(line.getCeiling());
                    a[3] = String.valueOf(line.getTarget());
                    a[4] = line.getMarketname();
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
    
    public static void ExportOrder(OrderList ol){
        try{   
                BufferedWriter fw = new BufferedWriter(new FileWriter("order.csv"));
                for(Order line : ol.getOrder()){
                    String[] a = new String[7];
                    a[0] = line.getCustomername();
                    a[1] = String.valueOf(line.getProductid());
                    a[2] = String.valueOf(line.getActualprice());
                    a[3] = line.getMarketname();
                    a[4] = line.getSalesmanname();
                    a[5] = String.valueOf(line.getQuantity());
                    a[6] = String.valueOf(line.getTargetprice());
                    String thisline=Arrays.toString(a);
                    fw.write(thisline.replace("[", "").replace("]", "").replace(", ",","));
                    fw.newLine();
                }     
                fw.close();    
            }catch(Exception e){System.out.println(e);}
        System.out.println("Success");
    }
}
