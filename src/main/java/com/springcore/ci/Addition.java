package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b)
	{
		
		this.a = a;
		this.b = b;
	}
	
	public Addition(double a, double b) 
	{
		
		this.a = (int)a;
		this.b = (int)b;
	}
	public void sum()
	{
		System.out.println("The sum of no is"+(this.a+this.b));
	}
	
}
