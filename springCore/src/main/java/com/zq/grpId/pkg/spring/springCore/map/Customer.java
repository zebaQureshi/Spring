package com.zq.grpId.pkg.spring.springCore.map;

import java.util.Map;

public class Customer {

	private String name;
	private Map<Integer, String> products;

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
