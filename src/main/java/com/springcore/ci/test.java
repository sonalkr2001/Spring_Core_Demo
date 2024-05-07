package com.springcore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class test {

	public static void main(String[] args) {
	 ApplicationContext	con =new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	 person p=(person)con.getBean("per");
	 System.out.println(p);
	 Addition add=(Addition)con.getBean("add");
	 add.sum();
	}

}
