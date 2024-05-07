package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// autowire tutorial can be done by using annotation(on variable, setter method  and constructor .
// @qualifier will we used to say that which bean will be fetched .
public class Emp {
	// 1.on variable
	@Autowired
	@Qualifier("temp")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	// 2. on setter method
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("run Setter method");
	}
	// 3. on constructor.
	//@Autowired
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("run constructor");
	}

	public Emp() {
		super();
		
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
