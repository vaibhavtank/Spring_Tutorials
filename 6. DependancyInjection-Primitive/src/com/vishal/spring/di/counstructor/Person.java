package com.vishal.spring.di.counstructor;

public class Person {
	
	private String name;
	private String no;
	private int age;
	
	public Person(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	
	public void callPhone() {
		// TODO Auto-generated method stub
		System.out.println("Call to " + name + " on " + no);
	}
	
	public void showAge() {
		// TODO Auto-generated method stub
		System.out.println( name+"'s age is :" + age);
	}
	
}
