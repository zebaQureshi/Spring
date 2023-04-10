package com.zq.grpId.pkg.spring.springormassignment.Passenger.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.grpId.pkg.spring.springormassignment.Passenger.dao.PassengerDao;
import com.zq.grpId.pkg.spring.springormassignment.Passenger.entity.Passenger;

public class PassengerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/zq/grpId/pkg/spring/springormassignment/Passenger/app/config.xml");

		PassengerDao impl=ctx.getBean("impl",PassengerDao.class);
		
//		Passenger p= new Passenger();
//		p.setId(5);
//		p.setFirstName("Stacy");
//		p.setLastName("Wordsworth");
//		System.out.println(impl.create(p));
		
//		Passenger p= new Passenger();
//		p.setId(5);
//		p.setFirstName("William");
//		p.setLastName("Wordsworth");
//		impl.update(p);
		
//		Passenger p= new Passenger();
//		p.setId(1);
//		impl.delete(p);
		
		
//		System.out.println(impl.selectOne(5));
		System.out.println(impl.selectAll());
		
		
		
		
	}

}
