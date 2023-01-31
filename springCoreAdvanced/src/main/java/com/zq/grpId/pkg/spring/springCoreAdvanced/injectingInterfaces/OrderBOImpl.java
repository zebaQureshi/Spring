package com.zq.grpId.pkg.spring.springCoreAdvanced.injectingInterfaces;

public class OrderBOImpl implements OrderBO {

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
