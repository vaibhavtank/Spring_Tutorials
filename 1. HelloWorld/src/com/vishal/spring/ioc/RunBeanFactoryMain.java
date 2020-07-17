package com.vaibhav.spring.ioc;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class RunBeanFactoryMain {

	public static void main(String[] args) {

//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

		HelloWorld obj = (HelloWorld) factory.getBean("hello");
		System.out.println(">>>" + obj.getMessage());

	}
}
