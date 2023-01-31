package com.zq.grpId.pkg.spring.springCore.lifeCycle.xmlConfig;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("in the setter method");
		this.id = id;
	}
	
	public void hi()
	{
		//init method , mentioned in xml file. name can be anything.
		System.out.println("in the init hi method");
	}
	
	public void bye() {
		//destroy method, name can be anything
		System.out.println("in the destroy bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	

}
