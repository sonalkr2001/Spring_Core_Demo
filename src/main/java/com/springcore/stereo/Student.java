package com.springcore.stereo;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// without creating object(bean in config file) how to call class using stereotype annotation(@component)
// @value can be use for give the value of property.
// for give the name of bean object use @component(" objectname").
// stereotype ("#{listname}") will bw used to give the  standalone value of list from config file.
// @Scope annotation will be used for give the scope of the class.scope will be(singelton,prototype,request,session,globalsession).
// scope will be done in two ways first is using @Scope annotation(use in student class)
// another is using xml file that is in texcher class.
@Component("st")
@Scope("prototype")
public class Student {
	@Value("101")
	private  int id;
	@Value("Sonal kumar")
	private String name;
	@Value("#{temp}")
	private List<String> address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
