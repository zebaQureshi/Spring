package com.zq.grpId.pkg.spring.springCore.InnerBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCore/InnerBean/config.xml");
		Employee e = ctx.getBean("employee1", Employee.class);
		System.out.println(e);
		ctx.close();

	}

}
