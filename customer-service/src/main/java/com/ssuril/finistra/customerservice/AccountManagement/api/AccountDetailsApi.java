package com.ssuril.finistra.customerservice.AccountManagement.api;

import com.ssuril.finistra.customerservice.AccountManagement.model.AccountDetail;
import com.ssuril.finistra.customerservice.AccountManagement.model.SearchAccountsResponse;
import com.ssuril.finistra.customerservice.AccountManagement.model.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class AccountDetailsApi {

    @Autowired
    WebClient webClient;


    public SearchAccountsResponse getAccountDetailsForCustomer(String customerId) {
       // https://api.fusionfabric.cloud/retail-banking/accounts/v1/accounts?customerId=FFDC02
        SearchAccountsResponse accountDetailLst =
                webClient.get()
                        .uri(uriBuilder -> uriBuilder.scheme("https").host("api.fusionfabric.cloud")
                                .path("retail-banking/accounts/v1/accounts")
                                .queryParam("customerId", customerId)
                                .build())
                        .retrieve().bodyToMono(SearchAccountsResponse.class).block();

        System.out.println(accountDetailLst);
        return accountDetailLst;
    }

    public TransactionResponse getTransactionDetailsForAccount(String accountId) {
        // https://api.fusionfabric.cloud/retail-banking/accounts/v1/accounts/{accountId}/transactions
        TransactionResponse transactionResponse =
                webClient.get()
                        .uri(uriBuilder -> uriBuilder.scheme("https").host("api.fusionfabric.cloud")
                                .path("retail-banking/accounts/v1/accounts/{accountId}/transactions")
                                .build(accountId))
                        .retrieve().bodyToMono(TransactionResponse.class).block();

        System.out.println(transactionResponse);
        return transactionResponse;
    }
}
