package com.springcore.annotation;
// complete code with removing xml file and using annotation(
// @component is used to call class without crating object. it is used in main java class which have methos and property.
// @configuration is used to declare that this class is config class.it is used with the class which only contain configuration.
//@ComponentScan(basePackage=) is used to declare that which is base package.
import org.springframework.stereotype.Component;

@Component
public class Student {
	private Samosa samosa;
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public void study()
	{
		this.samosa.disp();
		System.out.println("Study Book");
	}

}
