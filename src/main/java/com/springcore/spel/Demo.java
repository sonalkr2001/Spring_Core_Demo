package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// for call static variable/method  used (#{" T(class).method/variable}").
// for create object used (#{ new class name('value')}")
@Component
public class Demo {
	@Value("#{11+22}")
	private int x;
	@Value("#{22+3}")
	private int y;
	// call static method using object_spel 
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	//call object using spel
	@Value("#{new java.lang.String('Sonal Kumar')}")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + "]";
	}
	
	

}
