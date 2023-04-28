package com.v2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.v2.model.Customer;
import com.v2.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
//	@Autowired
//	private CustomerRepo repo;

	@GetMapping(value = "/getCust")
	public List<Customer> getCustomer() {
		
		List<Customer> listCust = new ArrayList<>();
		Customer cust = new Customer(1l, "cust");
		Customer cust1 = new Customer(02l, "cust1");
		Customer cust2 = new Customer(03l, "cust2");
		listCust.add(cust);
		listCust.add(cust1);
		listCust.add(cust2);
		
//		List<Customer> strList = List.of(cust, cust1, cust2); 
		return listCust;  // repo.findAll()
	}

	@PostMapping(value = "/addCustmer")
	public String addCustomer(@RequestBody List<Customer> cust) {
		return customerService.add(cust);
	}

}
