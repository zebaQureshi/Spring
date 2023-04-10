package com.zq.grpId.pkg.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.grpId.pkg.spring.springjdbc.employee.dao.impl.EmployeeDaoImpl;
import com.zq.grpId.pkg.spring.springjdbc.employee.entity.Employee;

public class EmployeeTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springjdbc/employee/test/config.xml");
		EmployeeDaoImpl impl = ctx.getBean("empdaoImpl", EmployeeDaoImpl.class);
		//Employee emp = ctx.getBean("employee", Employee.class);
		// int res=impl.create(emp);
		// System.out.println("Number of rows inserted: "+res);

//        Employee e=new Employee();
//        e.setId(1);
//        e.setFirstName("Captian");
//        e.setLastName("America");
//       int res1= impl.update(e);
//        System.out.println("Number of records updated: "+res1);

//		Employee e = new Employee();
//		e.setId(3);
//		int res = impl.delete(e);
//		System.out.println("Number of records deleted:" + res);
		
//		Employee e=impl.read(1);
//		System.out.println(e);
		
		List<Employee> employees=impl.readAllEmployees();
		for(Employee e:employees)
			System.out.println(e);
		

	}

}
