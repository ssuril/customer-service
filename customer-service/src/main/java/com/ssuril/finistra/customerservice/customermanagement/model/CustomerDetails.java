package com.ssuril.finistra.customerservice.customermanagement.model;

import java.util.Arrays;

public class CustomerDetails {

    String firstName;
    String lastName;
    String employer;
    String occupation;
    String businessType;
    String dateOfBirth;
    Addresses [] addresses;
    Phones [] phones;
    CoreIdentifications [] coreIdentifications;
    Emails [] emails;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Addresses[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses[] addresses) {
        this.addresses = addresses;
    }

    public Phones[] getPhones() {
        return phones;
    }

    public void setPhones(Phones[] phones) {
        this.phones = phones;
    }

    public CoreIdentifications[] getCoreIdentifications() {
        return coreIdentifications;
    }

    public void setCoreIdentifications(CoreIdentifications[] coreIdentifications) {
        this.coreIdentifications = coreIdentifications;
    }

    public Emails[] getEmails() {
        return emails;
    }

    public void setEmails(Emails[] emails) {
        this.emails = emails;
    }
}
