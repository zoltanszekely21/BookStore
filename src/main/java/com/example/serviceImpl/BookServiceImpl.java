package com.example.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	@Override
	public int saveBook(Book book) {
		return bookRepository.save(book).getId();
	}

	@Override
	public int updateBook(Book book) {
		return bookRepository.save(book).getId();
	}

	@Override
	public int deleteBook(int bookId) {
		return bookRepository.deleteById(bookId);
	}

	@Override
	public Optional<Book> getBookById(int bookId) {
		return bookRepository.findById(bookId);
	}

	@Override
	public List<Book> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

}


