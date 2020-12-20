package com.ssuril.finistra.customerservice.controller;

import com.ssuril.finistra.customerservice.AccountManagement.model.TransactionResponse;
import com.ssuril.finistra.customerservice.customermanagement.api.CustomerDetailsApi;
import com.ssuril.finistra.customerservice.customermanagement.model.CustomerDetails;
import com.ssuril.finistra.customerservice.customermanagement.model.CustomerDetailsList;
import com.ssuril.finistra.customerservice.representation.CustomerDetailsResponse;
import com.ssuril.finistra.customerservice.representation.TransactionDetailsResponse;
import com.ssuril.finistra.customerservice.service.CustomerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer-service")
public class CustomerDetailsRequest {

    @Autowired
    CustomerProfile customerProfile;

    @RequestMapping(value = "/customer-details",method = RequestMethod.GET)
    public CustomerDetailsResponse getCustomerDetails
            (@RequestParam("consumerId") String consumerId){

        CustomerDetailsResponse customerDetailsResponse =
                customerProfile.getAllCustomerDetails(consumerId);

        return customerDetailsResponse;
    }

    @RequestMapping(value = "/transaction-details",method = RequestMethod.GET)
    public List<TransactionDetailsResponse> getCustomerTransDetails
            (@RequestParam("accountId") String accountId){

        List<TransactionDetailsResponse>  ls =
                customerProfile.getTransactionDetails(accountId);

        return ls;
    }

}
