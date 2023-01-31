package com.zq.grpId.pkg.spring.springCoreAdvanced.injectingInterfaces;

public class OrderDAOImpl implements OrderDAO {
	
	public void createOrder()
	{
		System.out.println("from Order DAO Impl: Order created");
	}

}
