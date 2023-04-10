package com.zq.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public * com.zq.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint)
	{
		System.out.println("Inside the log before method");
	}

	  
   @After("execution(public * com.zq.spring.springaop.ProductServiceImpl.multiply(..))")
   public void logAfter(JoinPoint joinPoint)
   {
	   System.out.println("Inside the log after method");
   }
}
