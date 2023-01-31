package com.zq.grpId.pkg.spring.springCore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		Hospital h1=ctx.getBean("hospital1",Hospital.class);
		
          System.out.println("Hospital Name: "+h1.getName());
          System.out.println("departments:"+h1.getDepartments().getClass());
          for(String dept:h1.getDepartments())
          System.out.println(dept);
          
          ctx.close();
          
	}

}
