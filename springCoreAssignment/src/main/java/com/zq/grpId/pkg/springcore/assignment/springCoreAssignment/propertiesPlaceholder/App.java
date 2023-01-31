package com.zq.grpId.pkg.springcore.assignment.springCoreAssignment.propertiesPlaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/springcore/assignment/springCoreAssignment/propertiesPlaceholder/config.xml");
		MyWebServicePojo wb = ctx.getBean("wbService", MyWebServicePojo.class);
		System.out.println(wb);
		ctx.close();

	}

}
