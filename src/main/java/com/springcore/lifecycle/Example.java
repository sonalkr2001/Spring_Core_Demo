package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct//  Init method call using postconstruct annotation.
	public void start()
	{
		System.out.println(" method start");
	}
	@PreDestroy // Destroy method call using predestroy annotation.
	public void End()
	{
		System.out.println("method stop");
	}
}
