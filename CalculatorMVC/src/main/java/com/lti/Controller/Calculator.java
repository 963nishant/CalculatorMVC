package com.lti.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.Service.AddService;

@Controller
public class Calculator {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response){

		int i =  Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));

		AddService as= new AddService();
		int k =as.add(i, j);

		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("Result", k);

		return mv;
	}

	@RequestMapping("/substract")
	public ModelAndView substract(HttpServletRequest request, HttpServletResponse response){

		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c =b-a;


		ModelAndView mv= new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("Result", c);
		
		return mv;

	}
	@RequestMapping("/divide")
	public ModelAndView divide(HttpServletRequest request, HttpServletResponse response){

		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c =b/a;


		ModelAndView mv= new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("Result", c);
		
		return mv;

	}
	@RequestMapping("/multiply")
	public ModelAndView multiply(HttpServletRequest request, HttpServletResponse response){

		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c =b*a;


		ModelAndView mv= new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("Result", c);
		
		return mv;

	}
}
