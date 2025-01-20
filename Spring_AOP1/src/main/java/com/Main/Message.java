package com.Main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Message {
//	
//	@Before("execution (public void transaction())")
//	public void beforeMsg() 
//	{
//		System.out.println("Enter Security Pin");
//	}
//
//	@After("execution (public void transaction())")
//	public void afterMsg() 
//	{
//		System.out.println("Withdraw cash from an ATM");
//	}
//	
	
	@Around("execution(* com.Main.Bank.*())")
	public void aroundMsg(ProceedingJoinPoint pj) {
		System.out.println("Enter Security Pin");
		
		try {
			pj.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Withdraw cash from an ATM");
		
		
		
	}

}
