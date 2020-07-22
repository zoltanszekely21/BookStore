package com.example.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Book;
import com.example.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Override
	public List<Book> getBooks() {
		
		List <Book> books = new ArrayList<Book>();
		books.add(new Book(1, "White Fang", "Jack London", 1906, "$10.97"));
		books.add(new Book(2, "Harry Potter", "JK Rowling", 1997, "$9.50"));
		books.add(new Book(3, "War and Peace", "Leo Tolstoy", 1867, "$20.83"));
		books.add(new Book(4, "The Shining", "Stephen King", 1977, "$23.32"));
		
		return books;
	}

	@Override
	public int saveBook(Book book) {
		System.out.println("Hello from saveBook");
		int x = 5;
		return x;
	}

}
