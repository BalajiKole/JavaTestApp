package com.demo.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/g")
public class HelloController  {
	
	@RequestMapping("/welcome")
	//@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
public ModelAndView helloWorld(){

	ModelAndView modelAndView=new ModelAndView("HelloPage.jsp");
	modelAndView.addObject("msg", "hello world");
	return modelAndView;
}

	@RequestMapping("/hi")
	@ResponseBody
public ModelAndView hiWorld() {
	ModelAndView modelAndView =new ModelAndView("HelloPage.jsp");
	modelAndView.addObject("msg","hi world");
	return modelAndView;
}


	
}
