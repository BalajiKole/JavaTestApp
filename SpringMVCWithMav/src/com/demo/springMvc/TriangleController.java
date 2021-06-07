package com.demo.springMvc;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
/*@Component
@Configuration
@ComponentScan("com.demo.springMvc")
@EnableWebMvc*/
//@RequestMapping("/t")
public class TriangleController {
	@RequestMapping("/tri")
	//@GetMapping("/h")
	//@RequestMapping("/tri")
	@ResponseBody
	public void someMethod()//HttpServletRequest session
	{
		System.out.println("I am Triangle.....");
	}
	
}
