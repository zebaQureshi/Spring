package com.zq.grpId.pkg.spring.springCoreAdvanced.injectingInterfaces.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCoreAdvanced/injectingInterfaces/annotations/config.xml");
		OrderBO bo= ctx.getBean("orderBOImpl",OrderBO.class);
		bo.placeOrder();
		
	}

}
