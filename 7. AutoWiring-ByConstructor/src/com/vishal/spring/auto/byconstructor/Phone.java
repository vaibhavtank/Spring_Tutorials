package com.vishal.spring.auto.byconstructor;

public class Phone {

	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call on " + phoneNumber);
	}

}
