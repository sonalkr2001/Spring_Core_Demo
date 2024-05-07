package com.springcore.lifecycle;
//using interface we call InitializingBean interface for init() method and  
//DisposableBean for destroy method in pepsi class.
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init mrthod");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}
}
