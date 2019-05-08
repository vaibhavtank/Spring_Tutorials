package com.vishal.spring.di.setter;

public class Phone {

	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Phone() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Phone Constructor");
	}

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call to " + phoneNumber);
	}
}
