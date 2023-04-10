package com.zq.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zq.spring.springmvc.entity.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendObject()
	{
		ModelAndView obj=new ModelAndView();
		obj.setViewName("displayObject");
		Employee e=new Employee();
		e.setId(123);
		e.setName("Deepak");
		e.setSalary(10000.00);
		obj.addObject("employee",e);
		return obj;
	}

}
