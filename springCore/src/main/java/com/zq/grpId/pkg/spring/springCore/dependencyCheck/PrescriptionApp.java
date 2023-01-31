package com.zq.grpId.pkg.spring.springCore.dependencyCheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCore/dependencyCheck/config.xml");
		Prescription p1 = ctx.getBean("prescription1", Prescription.class);
		System.out.println(p1);
		ctx.close();
	}

}
