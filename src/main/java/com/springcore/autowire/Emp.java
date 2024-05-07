package com.springcore.autowire;
// autowire tutorial can be done by using xml(using byname, bytype & constructor) and annotation.
public class Emp {
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
