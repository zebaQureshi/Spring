package com.zq.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//another method for registering a config class
		//ctx.register(ConfigClass2.class);

		 Service obj=ctx.getBean(Service.class);
		 System.out.println(obj);
		 
		 Service obj1=ctx.getBean(Service.class);
		 System.out.println(obj1);
		 obj.doService();
		 ctx.close();
		 //spring version 4 doesn't works for config. Version 5 works.
	}

}
