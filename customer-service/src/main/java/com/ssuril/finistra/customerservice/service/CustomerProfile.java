package com.ssuril.finistra.customerservice.service;

import com.ssuril.finistra.customerservice.AccountManagement.model.TransactionResponse;
import com.ssuril.finistra.customerservice.representation.CustomerDetailsResponse;
import com.ssuril.finistra.customerservice.representation.TransactionDetailsResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerProfile {

     CustomerDetailsResponse getAllCustomerDetails(String customerId);

    List<TransactionDetailsResponse> getTransactionDetails(String accountId);
}
