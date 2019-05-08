package com.vishal.spring.lifecycle;

public class Bean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Initialize the Bean");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy the Bean");
	}

}
