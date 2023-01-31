package com.zq.spring.inversionOfControl.pkg1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");	
		Coach obj = ctx.getBean("myCoach",Coach.class);
		obj.getDailyWorkOut();
		ctx.close();
		

	}

}
