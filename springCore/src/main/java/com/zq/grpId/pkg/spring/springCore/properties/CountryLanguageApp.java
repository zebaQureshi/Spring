package com.zq.grpId.pkg.spring.springCore.properties;

import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryLanguageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zq/grpId/pkg/spring/springCore/properties/propertyconfig.xml");

		CountryLanguages cl = ctx.getBean("country1", CountryLanguages.class);
		Properties p=cl.getCountryAndLanguages();
		
		System.out.println(p.getProperty("USA"));
		System.out.println(p);
		
		ctx.close();
		
	}

}
