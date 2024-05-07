package com.springcore.annotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {

	public static void main(String[] args) {
	ApplicationContext	cont=new AnnotationConfigApplicationContext(JavaConfig.class);
	Student st=cont.getBean("student",Student.class);
	System.out.println(st);
	st.study();
	}

}
