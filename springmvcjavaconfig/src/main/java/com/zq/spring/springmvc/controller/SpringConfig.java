package com.zq.spring.springmvc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//this class is the replacement for the dispatcher servlet file

@EnableWebMvc
@Configuration
@ComponentScan("com.zq.spring.springmvc.controller")
public class SpringConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ViewResolver viewResolver()
	{
		
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
         resolver.setPrefix("/WEB-INF/views/");
         resolver.setSuffix(".jsp");

		return resolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
