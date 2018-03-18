/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;

import java.awt.image.BufferedImage;

/**
 *
 * @author Ruby
 */
public class Person {
    private String FirstName;
    private String LastName;
    private String Gender;
    private String Nationality;
    private String DOB;
    private BufferedImage img;
    private License licence;
    private CreditCard creditcard;
    private Address address;
    private FinancialAccount financialaccount;
    
    public Person() {
        licence=new License();
        creditcard=new CreditCard();
        address=new Address();
        financialaccount=new FinancialAccount();
        
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    
    
    public License getLicence() {
        return licence;
    }

    public void setLicence(License licence) {
        this.licence = licence;
    }

    public CreditCard getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(CreditCard creditcard) {
        this.creditcard = creditcard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    

    public FinancialAccount getFinancialaccount() {
        return financialaccount;
    }

    public void setFinancialaccount(FinancialAccount financialaccount) {
        this.financialaccount = financialaccount;
    }

    
    
    
    
    
    
}
