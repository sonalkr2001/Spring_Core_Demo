package com.springcore.autowire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		 ApplicationContext cont=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
		 Emp e=(Emp)cont.getBean("emp1");
		 System.out.println(e);

	}

}
