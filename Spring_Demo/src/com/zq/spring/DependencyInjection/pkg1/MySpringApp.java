package com.zq.spring.DependencyInjection.pkg1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");	
		CricketCoach obj = ctx.getBean("myCricketCoachDJSetter",CricketCoach.class);
		obj.getDailyWorkOut();
		obj.getDailyFortune();
		System.out.println(obj.getEmail());
		System.out.println(obj.getTeam());
		
		ctx.close();
		

	}

}
