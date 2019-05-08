package com.vishal.spring.auto.byconstructor;

public class Person {

	private String name;
	private Phone phone;
	
	public Person(String name, Phone phone) {
		System.out.println("Person Constructor");
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public Phone getPhone() {
		return phone;
	}

	
	public void callPhone(){
		System.out.println("Call to "+name);
		phone.call();
	}

}
