package com.zq.spring.springaop.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.spring.springaop.ProductService;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/zq/spring/springaop/app/config.xml");
		ProductService bean=ctx.getBean("productService",ProductService.class);
		System.out.println(bean.multiply(2, 3));
		
		

	}

}
