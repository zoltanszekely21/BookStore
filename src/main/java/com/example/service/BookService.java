package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Book;

public interface BookService {
	
	public List<Book> getBooks();
	
	public int saveBook(Book book);

	public Optional<Book> getBookById(int id);

	public int updateBook(Book book);
	
	public int deleteBook(int bookId);

	public List<Book> getBookList();
}



