package com.zq.grpId.pkg.spring.springCore.refTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/zq/grpId/pkg/spring/springCore/refTypes/studentconfig.xml");
		 Student s=ctx.getBean("student1",Student.class);
		 System.out.println(s.getScores().getMaths());
		 System.out.println(s.getScores().getPhysics());
		 System.out.println(s.getScores().getChemistry());
		 System.out.println(s);
		 
		 
		 
		 Student s2=ctx.getBean("student2",Student.class);
		 System.out.println(s2.getScores().getMaths());
		 System.out.println(s2.getScores().getPhysics());
		 System.out.println(s2.getScores().getChemistry());
		 
		 
		 Student s3=ctx.getBean("student3",Student.class);
		 System.out.println(s3.getScores().getMaths());
		 System.out.println(s3.getScores().getPhysics());
		 System.out.println(s3.getScores().getChemistry());
		 ctx.close();
		 

	}

}
