package com.demo.springMvc;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SquareController1 {
	@RequestMapping("/sq")
	@ResponseBody
	public void someMethod(ModelMap model,HttpSession httpSession,HttpServletResponse response) throws IOException{
		
		response.getWriter().println("In square get key :"+ httpSession.getAttribute("mykey"));
	}

}
