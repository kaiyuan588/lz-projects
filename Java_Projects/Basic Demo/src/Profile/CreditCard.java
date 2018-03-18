/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;

/**
 *
 * @author Ruby
 */
public class CreditCard {
    private int CreditCardNumber;
    private String FullNameOnCard;
    private int CSVNumber;
    private String Cardtype;
    private String ValidDate;

    public int getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(int CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

   

    public String getFullNameOnCard() {
        return FullNameOnCard;
    }

    public void setFullNameOnCard(String FullNameOnCard) {
        this.FullNameOnCard = FullNameOnCard;
    }

    public int getCSVNumber() {
        return CSVNumber;
    }

    public void setCSVNumber(int CSVNumber) {
        this.CSVNumber = CSVNumber;
    }

   

    public String getCardtype() {
        return Cardtype;
    }

    public void setCardtype(String Cardtype) {
        this.Cardtype = Cardtype;
    }

    public String getValidDate() {
        return ValidDate;
    }

    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    
    
}
