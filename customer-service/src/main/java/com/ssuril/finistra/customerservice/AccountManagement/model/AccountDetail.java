package com.ssuril.finistra.customerservice.AccountManagement.model;

public class AccountDetail {

    String accountId;
    String accountName;
    String currency;
    String customerType;
    String accountType;
    String accountStatus;
    String iban;
    String bban;
    String accountOwnership;
    String postingsRestriction;


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountOwnership() {
        return accountOwnership;
    }

    public void setAccountOwnership(String accountOwnership) {
        this.accountOwnership = accountOwnership;
    }

    public String getPostingsRestriction() {
        return postingsRestriction;
    }

    public void setPostingsRestriction(String postingsRestriction) {
        this.postingsRestriction = postingsRestriction;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBban() {
        return bban;
    }

    public void setBban(String bban) {
        this.bban = bban;
    }

    @Override
    public String toString() {
        return "AccountDetail{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", currency='" + currency + '\'' +
                ", customerType='" + customerType + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", iban='" + iban + '\'' +
                ", bban='" + bban + '\'' +
                ", accountOwnership='" + accountOwnership + '\'' +
                ", postingsRestriction='" + postingsRestriction + '\'' +
                '}';
    }
}
