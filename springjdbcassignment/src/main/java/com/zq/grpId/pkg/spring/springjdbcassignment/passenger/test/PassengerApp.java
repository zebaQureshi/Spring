package com.zq.grpId.pkg.spring.springjdbcassignment.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.grpId.pkg.spring.springjdbcassignment.passenger.daoimpl.PassengerDaoImpl;
import com.zq.grpId.pkg.spring.springjdbcassignment.passenger.entity.Passenger;

public class PassengerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springjdbcassignment/passenger/test/config.xml");
		PassengerDaoImpl impl = ctx.getBean("passengerdaoImpl", PassengerDaoImpl.class);
//		Passenger p1 = ctx.getBean("passenger1", Passenger.class);
//		System.out.println("Number of rows inserted: " + impl.create(p1));
//		Passenger p1 = ctx.getBean("passenger1", Passenger.class);
//		System.out.println("Number of rows updated: " + impl.update(p1));
		//System.out.println("Number of rows deleted: " + impl.delete(2));
//		Passenger p=impl.read(1);
//		System.out.println(p);
		
		List<Passenger> p=impl.readAllPassengers();
		for(Passenger passenger:p)
			System.out.println(passenger);
		
		
	}

}
