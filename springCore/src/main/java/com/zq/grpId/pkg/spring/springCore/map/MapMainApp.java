package com.zq.grpId.pkg.spring.springCore.map;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCore/map/mapconfig.xml");
		Customer c1 = ctx.getBean("c1", Customer.class);
		System.out.println("Name is:" + c1.getName());

		System.out.println("Map type is:" + c1.getProducts().getClass().getName());

		for (Map.Entry<Integer, String> e : c1.getProducts().entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		ctx.close();
	}

}
