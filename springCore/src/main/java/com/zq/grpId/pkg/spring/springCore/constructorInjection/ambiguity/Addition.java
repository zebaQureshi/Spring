package com.zq.grpId.pkg.spring.springCore.constructorInjection.ambiguity;

public class Addition {

	public Addition(double a, double b) {
		System.out.println("in the double method");
	}

	public Addition(int a, int b) {
		System.out.println("in the int method");
	}
	
	public Addition(int a, double b,double c) {
		System.out.println("in the triple method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
