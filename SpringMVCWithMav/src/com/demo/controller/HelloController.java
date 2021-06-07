package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/greet")
public class HelloController {
	@RequestMapping("/welcome")
	@ResponseBody
public ModelAndView helloWorld(){

	ModelAndView modelAndView=new ModelAndView("HelloPage");
	modelAndView.addObject("msg", "hello world");
	return modelAndView;
}

	@RequestMapping("/hi")
	@ResponseBody
public ModelAndView hiWorld() {
	ModelAndView modelAndView =new ModelAndView("HelloPage");
	modelAndView.addObject("msg","hi world");
	return modelAndView;
}


}
