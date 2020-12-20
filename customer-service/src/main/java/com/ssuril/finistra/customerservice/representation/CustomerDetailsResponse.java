package com.ssuril.finistra.customerservice.representation;

import com.ssuril.finistra.customerservice.AccountManagement.model.AccountDetail;
import com.ssuril.finistra.customerservice.customermanagement.model.CustomerDetails;

import java.util.List;

public class CustomerDetailsResponse {

    private CustomerDetails customerDetails;

    private List<AccountDetail> accountDetailList;

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<AccountDetail> getAccountDetailList() {
        return accountDetailList;
    }

    public void setAccountDetailList(List<AccountDetail> accountDetailList) {
        this.accountDetailList = accountDetailList;
    }
}
