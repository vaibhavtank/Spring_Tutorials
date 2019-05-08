package com.vishal.spring.di.setter;

public class Person {

	private Phone phone;

	public Phone getPhone() {
		System.out.println("getting Phone by getter method");
		return phone;
	}

	public void setPhone(Phone phone) {
		System.out.println("setting Phone by setter method");
		this.phone = phone;
	}

	public void callPhone() {
		// TODO Auto-generated method stub
		System.out.println("Call Phone");
		phone.call();
	}

}
