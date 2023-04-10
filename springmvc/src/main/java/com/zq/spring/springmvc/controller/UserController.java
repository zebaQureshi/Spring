package com.zq.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zq.spring.springmvc.entity.User;

@Controller
public class UserController {

	// this is using ModelAndView Object
//	@RequestMapping("/registrationPage")
//	public ModelAndView showRegistrationPage()
//	{
//		ModelAndView obj=new ModelAndView();
//		obj.setViewName("UserReg");
//		return obj;
//	}
//	
//	
//	@RequestMapping(value="registerUser",method=RequestMethod.POST)
//	public ModelAndView registerUser(@ModelAttribute("user") User user)
//	{
//		System.out.println(" inside the register user post method: "+user);
//		ModelAndView obj=new ModelAndView();
//		obj.setViewName("showUser");
//		obj.addObject("user", user);
//		return obj;
//	}

	// using Model map, we return the view name as a string, and put data in the
	// model map

	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {

		return "UserReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(" inside the register user post method: " + user);
		model.addAttribute("user", user);
		return "showUser";
	}

}
