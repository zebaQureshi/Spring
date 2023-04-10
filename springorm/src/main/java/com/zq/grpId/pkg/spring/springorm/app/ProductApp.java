package com.zq.grpId.pkg.spring.springorm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.grpId.pkg.spring.springorm.dao.ProductDao;
import com.zq.grpId.pkg.spring.springorm.daoimpl.ProductDaoImpl;
import com.zq.grpId.pkg.spring.springorm.entity.Product;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/zq/grpId/pkg/spring/springorm/app/config.xml");
		ProductDao impl=ctx.getBean("daoImpl",ProductDao.class);
//		Product p=new Product();
//		p.setId(3);
//		p.setName("Tab");
//		p.setDesc("Device");
//		p.setPrice(90);
//		int res=impl.create(p);
//		System.out.println("Number of rows inserted:"+res);
		
		
//		Product p=new Product();
//		p.setId(3);
//		p.setName("IPad");
//		p.setDesc("Device");
//		p.setPrice(90);
//		impl.update(p); 
		
//		Product p=new Product();
//		p.setId(3);
//		impl.delete(p); 
		
		//System.out.println(impl.selectOne(2));
		
		System.out.println(impl.selectAll());
		
		

	}

}
