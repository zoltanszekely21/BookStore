package com.example.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Book;
import com.example.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveBook(Book book) {
		System.out.println("Hello from saveBook");
		int x = 5;
		return x;
	}

}
