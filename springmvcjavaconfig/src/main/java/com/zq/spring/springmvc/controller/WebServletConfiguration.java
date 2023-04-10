package com.zq.spring.springmvc.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//this class replaces the web.xml file from the xml config
//here we are doing everything using java config
public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webcontext= new AnnotationConfigWebApplicationContext();
		webcontext.register(SpringConfig.class); //registring the config class
		
		ServletRegistration.Dynamic servlet=null;;// servletContext.addServlet("dispatcher", new DispatcherServlet(webcontext));
		//servletContext.
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
		
	}

}
