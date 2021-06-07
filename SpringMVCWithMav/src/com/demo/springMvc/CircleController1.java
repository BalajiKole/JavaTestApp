package com.demo.springMvc;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/a")
public class CircleController1 {

	@RequestMapping(method=RequestMethod.GET)
	public String print(HttpSession httpSession,ModelMap model){
		model.addAttribute("message","Hello Spring MVC Framework");
		httpSession.setAttribute("mykey", "myvalue");
		System.out.println("CircleController called,dataset");
		return "sq";
		
	}
}
