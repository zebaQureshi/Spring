package com.zq.grpId.pkg.spring.springCoreAdvanced.injectingInterfaces.annotations;

import org.springframework.stereotype.Component;

@Component	
public class OrderDAOImpl implements OrderDAO {
	
	public void createOrder()
	{
		System.out.println("from Order DAO Impl: Order created");
	}

}
