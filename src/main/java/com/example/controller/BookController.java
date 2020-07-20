package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Book;
import com.example.service.BookService;

@Controller
public class BookController {

	
	
	@Autowired
	public BookService bookService;
	
	@RequestMapping(value="/bookOverview", method=RequestMethod.GET)
	public ModelAndView helloRequestMapping(Model model) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from bookOverviewPage");
		
		
		String text = "Book List";
		model.addAttribute("bookList", text);
		
		
		List<Book> books = bookService.getBooks();

		model.addAttribute("bookList", books);		
		bookService.getBooks();
		
		mav.setViewName("bookOverviewPage");
		return mav;
	}
	
	
	@RequestMapping(value = "/bookForm", method = RequestMethod.GET)
	public ModelAndView bookForm(Model model) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from bookForm");
		Book book = new Book();
		model.addAttribute("book", book);
		mav.setViewName("bookFormPage");
		return mav;
	}
	
	@RequestMapping(value="/submitBook", method=RequestMethod.POST)
	public ModelAndView submitBook(@ModelAttribute Book book) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Hello from submitBook");
		//Save book to database
		int result = bookService.saveBook(book);
		System.out.println("Result: " + result);
		
		mav.setViewName("redirect:/bookOverviewPage");
		return mav;
	
	
}
}