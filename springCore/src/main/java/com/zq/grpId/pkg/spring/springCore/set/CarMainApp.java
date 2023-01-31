package com.zq.grpId.pkg.spring.springCore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMainApp {
	
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/zq/grpId/pkg/spring/springCore/set/carconfig.xml");
		CarDealer c1= ctx.getBean("c1",CarDealer.class);
		System.out.println(c1.getName());
		System.out.println(c1.getModel());
		ctx.close();
		
		
	}

}
