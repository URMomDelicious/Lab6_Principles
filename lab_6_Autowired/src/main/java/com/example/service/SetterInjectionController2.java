package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

@RestController
@RequestMapping("/setter")
public class SetterInjectionController2 {
	private CustomerService customerService;
	@Autowired
	public void setterInjectionCustomerService(CustomerService customerService){
		this.customerService=customerService;
	}
	
	@GetMapping("/{id}") //http://localhost:8080/setter/15
	public String getCustomerById(@PathVariable Long id){
		Customer cust = customerService.getCustomerById(id);
		return "Constructor Injection Customer ID:"+cust.getId() + ", Name"+cust.getname();		
	}
	@GetMapping("/customer/{id}/{name}") //get http://localhost:8080/setter/customer/20/Yasinthon
	public String getCustomerById(@PathVariable Long id,@PathVariable String name){
		Customer cust = customerService.getCustomerByIdName(id,name);
		return "Setter Injection Customer ID:"+cust.getId() + ", Name"+cust.getname();
	}
}
