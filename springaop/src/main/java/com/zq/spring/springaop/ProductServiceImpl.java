package com.zq.spring.springaop;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println("Inside the multiply method");
		return n1*n2;
	}

}
