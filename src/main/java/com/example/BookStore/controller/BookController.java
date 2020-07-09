package com.example.BookStore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	//@RequestMapping (value="/hello", method=RequestMethod.GET)
    //public ModelAndView helloRequestMapping() {
	//	ModelAndView mav = new ModelAndView();
	//	System.out.println("Hello from helloRequestMapping");
	//	mav.setViewName("helloPage");
	//	return mav; 
		
		
		@RequestMapping (value="/bookOverview", method=RequestMethod.GET)
		public ModelAndView overviewRequestMapping() {
			ModelAndView mav = new ModelAndView();
			System.out.println("Hello from bookOverview");
			mav.setViewName("bookOverviewPage");
			return mav; 
	    }
	
		@RequestMapping (value="/bookForm", method=RequestMethod.GET)
		public ModelAndView formRequestMapping() {
			ModelAndView mav = new ModelAndView();
			System.out.println("Hello from bookForm");
			mav.setViewName("bookFormPage");
			return mav; 
	    }

}
