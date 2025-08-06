package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private Long id;
	private String name;
	public Customer() {
		
	}
	public Customer(Long id, String name) {
		this.id=id;
		this.name=name;
	}
	public Long getId() {
		return id;
	}
	public String getname()
	{
		return name;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public void setName(String Name, String name) {
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
}
