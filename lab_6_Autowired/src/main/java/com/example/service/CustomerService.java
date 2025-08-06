package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Customer;

@Service
public class CustomerService {
	public Customer getCustomerById(Long id) {
		return new Customer(id, "Yasinthon");
	}
	
	public Customer getCustomerByIdName(Long id , String name) {
		return new Customer(id,name);
	}
}
