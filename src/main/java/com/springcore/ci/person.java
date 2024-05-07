package com.springcore.ci;

// in this module constructor injection program will be done.
import java.util.List;
public class person {
	
	private int id;
	private String name;
	private Certi certi;
	private List<String> course; 
	public person(int id,String name,Certi certi,List<String>course)
	{
		this.id=id;
		this.name=name;
		this.certi=certi;
		this.course=course;
	}

	@Override
	public String toString() {
		return this.id+" :"+ this.name+ "{"+this.certi.name +"}"+ this.course;
	}

}
