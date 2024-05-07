package com.springcore.stereo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
	ApplicationContext cont	=new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
	 Student st=(Student)cont.getBean("st");
	 System.out.println(st.hashCode());
	 Student st1=(Student)cont.getBean("st");
	 System.out.println(st1.hashCode());
	 
	 Teacher t=(Teacher)cont.getBean("tea");
	 System.out.println(t.hashCode());
	 Teacher t1=(Teacher)cont.getBean("tea");
	 System.out.println(t1.hashCode());
	 
	}

}
