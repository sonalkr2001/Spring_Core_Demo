package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore/config.xml");
     student student1=(student)context.getBean("st1");
     System.out.println(student1);
     student student2=(student)context.getBean("st2");
     System.out.println(student2);
    }
}
