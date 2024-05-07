package com.springcore.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Temp {

	public static void main(String[] args) {
		 ApplicationContext cont=new ClassPathXmlApplicationContext("com/springcore/spel/sconfig.xml");
		 Demo d=(Demo)cont.getBean("demo");
		 System.out.println(d);
	}

}
