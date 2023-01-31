package com.zq.grpId.pkg.spring.springCoreAdvanced.injectingInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCoreAdvanced/injectingInterfaces/config.xml");
		OrderBO bo= ctx.getBean("bo",OrderBO.class);
		bo.placeOrder();
		
	}

}
