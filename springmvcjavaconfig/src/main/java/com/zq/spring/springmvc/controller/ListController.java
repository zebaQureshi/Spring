package com.zq.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zq.spring.springmvc.entity.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/readList")
	public ModelAndView sendList()
	{
		ModelAndView obj=new ModelAndView();
		obj.setViewName("displayList");
		
		ArrayList<Employee> arr=new ArrayList<>();
		
		Employee e=new Employee();
		e.setId(123);
		e.setName("Deepak");
		e.setSalary(10000.00);
		
		Employee e1=new Employee();
		e1.setId(234);
		e1.setName("John");
		e1.setSalary(20000.00);
		Employee e2=new Employee();
		e2.setId(342);
		e2.setName("Bob");
		e2.setSalary(30000.00);
		
		arr.add(e);
		arr.add(e1);
		arr.add(e2);
		
		
		obj.addObject("employees",arr);
		return obj;
	}

}
