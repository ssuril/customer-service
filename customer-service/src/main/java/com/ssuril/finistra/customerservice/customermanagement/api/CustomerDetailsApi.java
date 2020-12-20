package com.ssuril.finistra.customerservice.customermanagement.api;

import com.ssuril.finistra.customerservice.customermanagement.model.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
public class CustomerDetailsApi {

    @Autowired
    WebClient webClient;

    @Value("${cscm.endpoint}")
    private String endpoint;

    public CustomerDetails[] getCustomerDetailsList(String firstName, String lastName) {


        CustomerDetails[] customerDetailsList =
                webClient.get()
                        .uri(uriBuilder -> uriBuilder.scheme("https").host("api.fusionfabric.cloud")
                                .path("retail-us/customer-read/v1/consumers")
                                .queryParam("firstName", firstName)
                                .queryParam("lastName", lastName)
                                .build())
                        .retrieve().bodyToMono(CustomerDetails[].class).block();

        // System.out.println(customerDetailsList.subscribe((customerDetails -> System.out.println(customerDetails.toString()))));
        return customerDetailsList;
    }


    public CustomerDetails getCustomerDetails(String customerId) {

         //https://api.fusionfabric.cloud/retail-us/customer-read/v1/consumers/{consumerId}
        //https://api.fusionfabric.cloud/retail-us/customer-read/v1/consumers/{consumerId}
        //X-Request-ID
        CustomerDetails customerDetails =
                webClient.get()
                        .uri(uriBuilder -> uriBuilder.scheme("https").host("api.fusionfabric.cloud")
                                .path("retail-us/customer-read/v1/consumers/{consumerId}")
                                .build(customerId))
                        .retrieve().bodyToMono(CustomerDetails.class).block();

        return customerDetails;
    }
}