package com.zq.spring.springjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Dao {
	
	public void create()
	{
		System.out.println("In DAO class, create method.");
	}
	

}
