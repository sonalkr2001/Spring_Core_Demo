package com.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.springcore.annotation")
public class JavaConfig {
	@Bean 
	public Samosa getSamosa()
	{
		return new Samosa();
		
	}
	
	@Bean
	public Student getStudent()
	{
		Student st= new Student(getSamosa());
		return st;
	}
	

}
