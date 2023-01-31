package com.zq.grpId.pkg.spring.springCore.lifeCycle.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Patient {

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

	@PostConstruct
	public void hi() { // init method using annotation
		System.out.println("inside hi method");
	}

	@PreDestroy
	public void bye() {
		//destroy method
		System.out.println("inside bye method");
	}

}
