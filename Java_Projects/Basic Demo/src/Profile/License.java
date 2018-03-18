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
public class License {
    private String LicenseType;
    private int LicenseNumber;
    private String LicenseIssueDate;
    private String LicenseExpireDate;
    private String DOB;

    public String getLicenseType() {
        return LicenseType;
    }

    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    public int getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(int LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    
    public String getLicenseIssueDate() {
        return LicenseIssueDate;
    }

    public void setLicenseIssueDate(String LicenseIssueDate) {
        this.LicenseIssueDate = LicenseIssueDate;
    }

    public String getLicenseExpireDate() {
        return LicenseExpireDate;
    }

    public void setLicenseExpireDate(String LicenseExpireDate) {
        this.LicenseExpireDate = LicenseExpireDate;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    
}
