package com.vishal.spring.di.counstructor;

public class Person {
	
	private Phone phone;

	public Person(Phone phone) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Person Constructor");
		this.phone = phone;
	}
	
	public void callPhone() {
		// TODO Auto-generated method stub
		System.out.println("Call Phone");
		phone.call();
	}
	
}
