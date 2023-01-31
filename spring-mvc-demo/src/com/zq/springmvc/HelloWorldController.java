package com.zq.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/showform")
	public String myShowForm() {
		return "show-form";
	}
	@RequestMapping("/processAction")
	public String myprocess() {
		return "helloworld";
	}
	@RequestMapping("/processActionFormVersionTwo")
	public String myprocesstwo(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = "YO! " + name.toUpperCase();
		model.addAttribute("mymsg", name);
		return "helloworld";
	}

	@RequestMapping("/processActionFormVersionThree")
	public String myprocessthree(@RequestParam("studentName") String name, Model model) {
		
		name = "YO! friend " + name.toUpperCase();
		model.addAttribute("mymsg", name);
		return "helloworld";
	}
}
