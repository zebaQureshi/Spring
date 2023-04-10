package com.zq.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zq.spring.springmvcorm.user.entity.User;
import com.zq.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	
	@RequestMapping("/registrationPage")
	public String showRegistrationPage()
	{
		return "UserReg";
	}
	
	@RequestMapping("/showUsers")
	public String getAllUsers(ModelMap map)
	{
		List<User> users=service.getUsers();
		map.addAttribute("users",users);	 //key value pair	
		return "displayUsers";
	}
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,ModelMap model)
	{
		System.out.println("in form post method:"+user);
		int result=service.save(user);
		model.addAttribute("result", "user created with id:"+result);
		return "UserReg";
	}
	
	//@ResponseBody tells spring that the returned string is not a view name.Its a response.
	@RequestMapping("validateId")
	public @ResponseBody String validateUserById(@RequestParam("id") int id)
	{
		String msg="";
		User user=service.getUser(id);
		if(user!=null)		
		 msg="user with id:"+id+" already exists!";
		
			return msg;
	}
	

}
