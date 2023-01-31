package com.zq.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach t  = ctx.getBean("mySillyTennisCoach",Coach.class);
				t.getDailyWorkout();
	}

}
