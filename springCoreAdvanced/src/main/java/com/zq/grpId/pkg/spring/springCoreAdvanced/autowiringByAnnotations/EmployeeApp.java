package com.zq.grpId.pkg.spring.springCoreAdvanced.autowiringByAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCoreAdvanced/autowiringByAnnotations/config.xml");
		Employee e = ctx.getBean("employee1", Employee.class);
		System.out.println(e);
		ctx.close();

	}

}
