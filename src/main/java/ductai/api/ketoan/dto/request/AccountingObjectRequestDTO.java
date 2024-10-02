package ductai.api.ketoan.dto.request;

import java.util.UUID;

public class AccountingObjectRequestDTO {
    public UUID AccountingObjectID;
    public String AccountingObjectCode;
    public String AccountingObjectName;
    public Long AccountingObjectCategoryID;
    public String Tel;
    public String Fax;
    public String BankAccount ;
    public String BankName ;
    public String TaxCode ;
    public String Email ;
    public String DiscountRate ;
    public String ContactName ;
    public String ContactTitle;
    public boolean ContactSex;
    public String ContactEmail ;
    public String ContactMobile;
    public String ContactAddress ;
    public int AccountingObjectType ;
    public boolean IsEmployee = false;
    public boolean InActive = false;
    public String Description;

    public AccountingObjectRequestDTO(UUID accountingObjectID, String accountingObjectCode, String accountingObjectName, Long accountingObjectCategoryID, String tel, String fax, String bankAccount, String bankName, String taxCode, String email, String discountRate, String contactName, String contactTitle, boolean contactSex, String contactEmail, String contactMobile, String contactAddress, int accountingObjectType, boolean isEmployee, boolean inActive, String description) {
        AccountingObjectID = accountingObjectID;
        AccountingObjectCode = accountingObjectCode;
        AccountingObjectName = accountingObjectName;
        AccountingObjectCategoryID = accountingObjectCategoryID;
        Tel = tel;
        Fax = fax;
        BankAccount = bankAccount;
        BankName = bankName;
        TaxCode = taxCode;
        Email = email;
        DiscountRate = discountRate;
        ContactName = contactName;
        ContactTitle = contactTitle;
        ContactSex = contactSex;
        ContactEmail = contactEmail;
        ContactMobile = contactMobile;
        ContactAddress = contactAddress;
        AccountingObjectType = accountingObjectType;
        IsEmployee = isEmployee;
        InActive = inActive;
        Description = description;
    }

    public UUID getAccountingObjectID() {
        return AccountingObjectID;
    }

    public void setAccountingObjectID(UUID accountingObjectID) {
        AccountingObjectID = accountingObjectID;
    }

    public String getAccountingObjectCode() {
        return AccountingObjectCode;
    }

    public void setAccountingObjectCode(String accountingObjectCode) {
        AccountingObjectCode = accountingObjectCode;
    }

    public String getAccountingObjectName() {
        return AccountingObjectName;
    }

    public void setAccountingObjectName(String accountingObjectName) {
        AccountingObjectName = accountingObjectName;
    }

    public Long getAccountingObjectCategoryID() {
        return AccountingObjectCategoryID;
    }

    public void setAccountingObjectCategoryID(Long accountingObjectCategoryID) {
        AccountingObjectCategoryID = accountingObjectCategoryID;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(String bankAccount) {
        BankAccount = bankAccount;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getTaxCode() {
        return TaxCode;
    }

    public void setTaxCode(String taxCode) {
        TaxCode = taxCode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(String discountRate) {
        DiscountRate = discountRate;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }

    public boolean isContactSex() {
        return ContactSex;
    }

    public void setContactSex(boolean contactSex) {
        ContactSex = contactSex;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    public String getContactMobile() {
        return ContactMobile;
    }

    public void setContactMobile(String contactMobile) {
        ContactMobile = contactMobile;
    }

    public String getContactAddress() {
        return ContactAddress;
    }

    public void setContactAddress(String contactAddress) {
        ContactAddress = contactAddress;
    }

    public int getAccountingObjectType() {
        return AccountingObjectType;
    }

    public void setAccountingObjectType(int accountingObjectType) {
        AccountingObjectType = accountingObjectType;
    }

    public boolean isEmployee() {
        return IsEmployee;
    }

    public void setEmployee(boolean employee) {
        IsEmployee = employee;
    }

    public boolean isInActive() {
        return InActive;
    }

    public void setInActive(boolean inActive) {
        InActive = inActive;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
