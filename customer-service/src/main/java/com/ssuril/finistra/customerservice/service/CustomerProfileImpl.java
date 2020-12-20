package com.ssuril.finistra.customerservice.service;

import com.ssuril.finistra.customerservice.AccountManagement.api.AccountDetailsApi;
import com.ssuril.finistra.customerservice.AccountManagement.model.*;
import com.ssuril.finistra.customerservice.customermanagement.api.CustomerDetailsApi;
import com.ssuril.finistra.customerservice.customermanagement.model.CustomerDetails;
import com.ssuril.finistra.customerservice.representation.CustomerDetailsResponse;
import com.ssuril.finistra.customerservice.representation.TransactionDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CustomerProfileImpl implements CustomerProfile{

    @Autowired
    CustomerDetailsApi customerDetailsApi;

    @Autowired
    AccountDetailsApi accountDetailsApi;

    @Override
    public CustomerDetailsResponse getAllCustomerDetails(String customerId) {

        CustomerDetails custDetails = customerDetailsApi.getCustomerDetails(customerId);
        SearchAccountsResponse items = accountDetailsApi.getAccountDetailsForCustomer("FFDC02");
        CustomerDetailsResponse resp = new CustomerDetailsResponse();

        resp.setCustomerDetails(custDetails);
        resp.setAccountDetailList(items.getItems());
        return resp;
    }

    @Override
    public  List<TransactionDetailsResponse> getTransactionDetails(String accountId) {

        TransactionResponse txnResp =
                accountDetailsApi.getTransactionDetailsForAccount(accountId);

        Set<String> setCcy = new HashSet<>();

        Map<String,Double> mp = new HashMap<>();

        txnResp.getItems().stream().forEach((Transaction t)->{
            setCcy.add(t.getAmount().getCurrency());
        });

        setCcy.stream().forEach((s)->{

            txnResp.getItems().stream().forEach((Transaction t)->{
               if(t.getAmount().getCurrency().equals(s)){
                   if(mp.get(s)==null){
                       mp.put(s,Double.parseDouble(t.getAmount().getAmount()));
                   }else{
                       Double tx1amt = mp.get(s);
                       Double txamt = tx1amt+Double.parseDouble(t.getAmount().getAmount());
                       mp.put(s,txamt);
                   }
               }
            });

        });

        List<TransactionDetailsResponse> ls = new ArrayList<>();
        mp.keySet().stream().forEach((ccy)->{

            TransactionDetailsResponse tr = new TransactionDetailsResponse();
            tr.setCcy(ccy);
            tr.setTotalTransactedAmtForCcy(mp.get(ccy));
            ls.add(tr);
        });


        return ls;
    }
}
