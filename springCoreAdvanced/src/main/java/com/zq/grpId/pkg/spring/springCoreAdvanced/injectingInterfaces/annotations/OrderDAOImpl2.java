package com.zq.grpId.pkg.spring.springCoreAdvanced.injectingInterfaces.annotations;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		
		System.out.println("from order dao impl2: order created");

	}

}
