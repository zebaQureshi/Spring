package com.zq.grpId.pkg.spring.springCore.constructorInjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCore/constructorInjection/ambiguity/config.xml");
		ctx.getBean("add1");
		ctx.getBean("add2");

		ctx.close();

	}

}
