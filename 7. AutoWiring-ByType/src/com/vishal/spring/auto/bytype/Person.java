package com.vishal.spring.auto.bytype;

public class Person {

	private String name;
	private Phone phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public void callPhone(){
		System.out.println("Call to Phone");
		phone.call();
	}

}
