package com.zq.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DaoConfig.class) //importing other config files in this file
public class SpringConfig {

	
	@Bean(initMethod = "myinitmethod", destroyMethod = "mydestroymethod")
	@Scope("singleton")
	public Service service()
	{
		return new Service();
		
	}
}
