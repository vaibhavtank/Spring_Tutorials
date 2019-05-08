package com.vishal.spring.auto.bytype;

public class Phone {

	public Phone() {
		// TODO Auto-generated constructor stub
		System.out.println("Phone Constructor");
	}
	
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call on " + phoneNumber);
	}

}
