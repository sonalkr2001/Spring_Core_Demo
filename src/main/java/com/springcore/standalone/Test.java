package com.springcore.standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
	ApplicationContext cont	=new ClassPathXmlApplicationContext("Com/springcore/standalone/aloneconfig.xml");
	Person p=(Person)cont.getBean("per");
	System.out.println(p);
	System.out.println("+++++++++++++++++++++");
	System.out.println(p.getFeestructure());
	}

}
