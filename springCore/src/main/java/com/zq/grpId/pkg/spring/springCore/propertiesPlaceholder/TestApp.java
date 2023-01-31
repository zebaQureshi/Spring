package com.zq.grpId.pkg.spring.springCore.propertiesPlaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCore/propertiesPlaceholder/config.xml");
		MyDAO d = ctx.getBean("myDao", MyDAO.class);
		System.out.println(d);
		ctx.close();
	}

}
