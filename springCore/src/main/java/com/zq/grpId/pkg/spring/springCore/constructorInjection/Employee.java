package com.zq.grpId.pkg.spring.springCore.constructorInjection;

public class Employee {

	private int id;
	private Address address;

	public Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

}
