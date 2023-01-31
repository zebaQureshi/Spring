package com.zq.grpId.pkg.spring.springCoreAdvanced.injectingInterfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("orderDAOImpl2")
	private OrderDAO dao;

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("From Order bo impl: placing order");
		dao.createOrder();

	}

}
