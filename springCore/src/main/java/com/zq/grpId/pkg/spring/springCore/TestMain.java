package com.zq.grpId.pkg.spring.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee e = (Employee) ctx.getBean("emp");
		System.out.println("id is:" + e.getId());
		System.out.println("name is:" + e.getName());
		
		
		Employee e1 = (Employee) ctx.getBean("emp1");
		System.out.println("id is:" + e1.getId());
		System.out.println("name is:" + e1.getName());
		ctx.close();

	}

}
