package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		 A a=(A)con.getBean("aref");
		 System.out.println(a);
	}

}
