package com.zq.grpId.pkg.spring.springCore.lifeCycle.Interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// AbstractApplicationContext to register pre shutdown hook for calling destroy method.
		//AbstractApplicationContext is the parent interface for ClassPathXmlApplicationContext
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				" com/zq/grpId/pkg/spring/springCore/lifeCycle/Interfaces/config.xml");
		Patient p1 = ctx.getBean("patient1", Patient.class);
		System.out.println(p1);
		ctx.registerShutdownHook();
	//ctx.close();
	}

}
