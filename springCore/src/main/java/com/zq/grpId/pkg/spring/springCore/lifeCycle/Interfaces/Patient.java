package com.zq.grpId.pkg.spring.springCore.lifeCycle.Interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("in the setter method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init method , mentioned in xml file. name can be anything.
		System.out.println("in the init hi method");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy method, name can be anything
		System.out.println("in the destroy bye method");

	}

}
