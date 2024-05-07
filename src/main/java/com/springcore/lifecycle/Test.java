package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext	cont=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
	Samosa s=(Samosa)cont.getBean("s1");
	System.out.println(s);
	cont.registerShutdownHook();
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	Pepsi p=(Pepsi)cont.getBean("p1");
	System.out.println(p);
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	Example e=(Example)cont.getBean("e1");
	System.out.println(e);
	}

}
