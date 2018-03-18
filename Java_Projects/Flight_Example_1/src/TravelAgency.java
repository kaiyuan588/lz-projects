

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruby
 */
public class TravelAgency {

    public static void main(String args[]) {

        /* Create and display the form */
        Customer c = new Customer();
        Master m =new Master();
        Airliner a =new Airliner();
        String thisLine = null;
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("person.txt"));
                while ((thisLine = br.readLine()) != null) {
                    Person p  =  c.addPerson();
                    String[] pa =thisLine.split(",");
                    p.setFlightid(Integer.parseInt(pa[0]));
                    p.setFullname(pa[1]);
                    p.setSeatnum(pa[2]);
                    System.out.println(thisLine);
                }       
            }catch(Exception e) {
                e.printStackTrace();
            }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("plane.txt"));
                while ((thisLine = br.readLine()) != null) {
                    Plane pl  =  a.addPlane();
                    String[] pa =thisLine.split(",");
                    pl.setCompany(pa[0]);
                    pl.setFlightid(Integer.parseInt(pa[1]));
                    pl.setModel(pa[2]);
                    pl.setTotalseats(Integer.parseInt(pa[3]));
                    System.out.println(thisLine);
                }       
            } catch(Exception e) {
                e.printStackTrace();
            }
        
        try {
                BufferedReader br = new BufferedReader(new FileReader("flight.txt"));
                while ((thisLine = br.readLine()) != null) {
                    Flight f  =  m.addFlight();
                    double[]se=new double[3]; 
                    String[] pa =thisLine.split(",");
                    f.setAirport(pa[3]);
                    f.setArrive(pa[1]);
                    f.setDepart(pa[2]);
                    f.setFlightid(Integer.parseInt(pa[0]));
                    for(int i=0; i<3; i++)
                    {
                        se[i]=Double.parseDouble(pa[i+4]);
                    }
                    f.setSeatprice(se);
                    System.out.println(thisLine);
                }       
            } catch(Exception e) {
                e.printStackTrace();
            }
        /* get all the flight number and add to list*/
        int []flightsum=new int[m.getMaster().size()];
        for(int i=0; i<m.getMaster().size();i++){
            flightsum[i]=m.getMaster().get(i).getFlightid();
        }
        
        
        
        /*For each specific flight*/
        for(int i=0; i<flightsum.length;i++){
            
            ArrayList listc =new ArrayList();
            
            double []se=new double[3];
            /*Find the person in customer list with the given flightid and add their seat number to a list*/
            for(int j=0; j<c.getCustomer().size();j++){
                if(c.getCustomer().get(j).getFlightid()==flightsum[i]){
                    
                    listc.add(c.getCustomer().get(j).getSeatnum());
                }
            }
            
            /*Find the seatprice from Master--Flight according to the flight id and create a pricelist*/
            
            for(int j=0; j<m.getMaster().size();j++)
                if(m.getMaster().get(j).getFlightid()==flightsum[i]){
                    se=m.getMaster().get(j).getSeatprice();
                }
            
            /*according to the price and seat number create the payment list by customers*/
            double []paid=new double[listc.size()];
            for(int j=0; j<listc.size(); j++){
                String seat =(String) listc.get(j);
                if(seat.endsWith("A")||seat.endsWith("F")){
                    paid[j]= se[0];
                }
                if(seat.endsWith("B")||seat.endsWith("E")){
                    paid[j]= se[1];
                }
                if(seat.endsWith("C")||seat.endsWith("D")){
                    paid[j]= se[2];
                }
            }
            
            /*Caculate the price of each flight*/
            double perflight=0;
            for (int j=0; j<paid.length;j++){
                perflight=perflight+paid[j];
            }
            System.out.println("The total revenue of flight number "+ flightsum[i]+ " is " +perflight);
            a.getAirliner().get(i).setTotalrevenue(perflight);
            
        }
        
            /*Find all the airliner company*/
        Set  listair=new HashSet();
        for (int i=0; i< a.getAirliner().size();i++){
            listair.add(a.getAirliner().get(i).getCompany());
            
        }
        
        ArrayList lista = new ArrayList(listair);
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
            
              
        
        
        for (int i=0; i< lista.size();i++ ){
            double perairliner=0;
            for(int j=0; j<a.getAirliner().size(); j++){
                if(a.getAirliner().get(j).getCompany() == null ? lista.get(i) == null : a.getAirliner().get(j).getCompany().equals(lista.get(i))){
                    perairliner=perairliner+a.getAirliner().get(j).getTotalrevenue();
                }
            }
            System.out.println("The total revenue of airliner "+ lista.get(i)+ " is " +perairliner);
        }
        
        double total=0;
        for (int i=0; i<a.getAirliner().size(); i++){
            total=total+a.getAirliner().get(i).getTotalrevenue();
        }
        System.out.println("The total revenue is " +total);
        
    }

  
    
}

    
