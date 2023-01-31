package com.zq.grpId.pkg.spring.springCoreAdvanced.autowiringByConstructor;

public class Employee {

	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee(Address address) {
		this.address = address;
	}

}
