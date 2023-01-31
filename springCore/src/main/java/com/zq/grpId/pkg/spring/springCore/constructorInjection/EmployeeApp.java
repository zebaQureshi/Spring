package com.zq.grpId.pkg.spring.springCore.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCore/constructorInjection/config.xml");
		Employee e = ctx.getBean("employee1", Employee.class);
		System.out.println(e);
		
		
		Employee e2 = ctx.getBean("employee2", Employee.class);
		System.out.println(e2);
		
		Employee e3 = ctx.getBean("employee3", Employee.class);
		System.out.println(e3);
		ctx.close();

	}

}
