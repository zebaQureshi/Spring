package com.zq.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//here request params is used to get values from the url
//http://localhost:8080/springmvc/showData?id=123&sal=1203.32&name=zeba
@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value="sal",required=false, defaultValue="200") double salary) {

		System.out.println("Id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		return new ModelAndView("UserReg"); //setting view name
	}

}
