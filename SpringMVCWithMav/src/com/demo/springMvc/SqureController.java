package com.demo.springMvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class SqureController {
/*@RequestMapping("/square")
//@ResponseBody
public void someMethod(HttpRequest request,HttpServletResponse response) throws IOException{

	//response.getWriter().println("in square get key :"+ request.getAttribute("mykey"));
	//servletContext
	response.getWriter().println("in square get key :"+ ((ServletRequest) request).getServletContext().getAttribute("mykey"));
	}*/

@RequestMapping(value="/students", method=RequestMethod.GET)
@ResponseBody
public List<Student> getStudent(){
	
	Student student1=new Student(1, "Sara");
	Student student2=new Student(2, "Yash");
	List<Student> studList=new ArrayList<>();
	studList.add(student1);
	studList.add(student2);
	return studList;
	
}
}

