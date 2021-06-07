package com.demo.springMvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c1")
public class CircleController {
	//@ResponseBody
	//@GetMapping("/view")
@RequestMapping(method=RequestMethod.GET)
public String printHello(ModelMap model, HttpServletRequest httpServletRequest ){
	System.out.println("circleController called");
	model.addAttribute("message", "Hello Spring MVC Framework......");
	return "h1.jsp";//redirect to h1.jsp  forward,redirect:
	/*httpServletRequest.setAttribute("mykey", "myvalue");
	return "/square";*/
	//servletContext
/*httpServletRequest.getServletContext().setAttribute("mykey", "myvalue");
	System.out.println("CircleController called, dataset");
	return "square";*/
}
}
