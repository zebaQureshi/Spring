package com.zq.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	@Autowired
	Dao dao;
	
	public void doService()
	{
		System.out.println("Inside Service class doservice method");
		dao.create();
	}
	
	public void myinitmethod()
	{
		System.out.println("myinitmethod");
	}
	
	public void mydestroymethod()
	{
		System.out.println("my destroy method");
	}
	

}
