package com.example.service;

import java.util.List;

import com.example.model.Book;

public interface BookService {
	
	public List<Book> getBooks();
	
	public int saveBook(Book book);
}
