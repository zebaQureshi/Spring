package com.zq.grpId.pkg.spring.springCoreAdvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCoreAdvanced/stereotype/annotations/config.xml");
		Instructor i = ctx.getBean("inst", Instructor.class);
		System.out.println(i);
		
		Instructor i1 = ctx.getBean("inst", Instructor.class);
		System.out.println(i1);
		ctx.close();

	}

}
