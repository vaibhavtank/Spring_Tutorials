package com.vishal.spring.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class InternateAdvice implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice{

	private CustomerOwner customerOwner;

	@Override
	public void before(Method method, Object[] objectArray, Object object)
			throws Throwable {
		// TODO Auto-generated method stub
		this.customerOwner.loginCustomer();
	}

	public CustomerOwner getCustomerOwner() {
		return customerOwner;
	}

	public void setCustomerOwner(CustomerOwner customerOwner) {
		this.customerOwner = customerOwner;
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		this.customerOwner.logoutCustomer();
	}
	
	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Allocate a system to customer");
		method.proceed();
		System.out.println("Deallocate a system to customer");
		return null;
	}
	
	//This method call when system throws the exceptions...
	public void afterThrowing(Throwable throwable) {
		// TODO Auto-generated method stub
		this.customerOwner.stopSystem();
	}
	

}
