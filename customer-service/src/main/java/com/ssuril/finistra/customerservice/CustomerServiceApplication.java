package com.ssuril.finistra.customerservice;

import com.ssuril.finistra.customerservice.customermanagement.api.CustomerDetailsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	/*@Override
	public void run(String... args) throws Exception {
		customerDetailsApi.getCustomerDetailsList();
	}*/
}
