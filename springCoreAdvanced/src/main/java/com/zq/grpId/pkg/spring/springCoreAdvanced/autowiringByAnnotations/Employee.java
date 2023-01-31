package com.zq.grpId.pkg.spring.springCoreAdvanced.autowiringByAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired(required = false)
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	// @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Autowiring can be used at either with setter, constructor, or field level.
	 */

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	/**
	 * @Autowired public Employee(Address address) { this.address = address; }
	 */

}
