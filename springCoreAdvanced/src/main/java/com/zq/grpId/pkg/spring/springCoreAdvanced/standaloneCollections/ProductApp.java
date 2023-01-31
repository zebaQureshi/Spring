package com.zq.grpId.pkg.spring.springCoreAdvanced.standaloneCollections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCoreAdvanced/standaloneCollections/config.xml");
		ProductsList p= ctx.getBean("products3",ProductsList.class);
		System.out.println(p);
		
		ctx.close();

	}

}
