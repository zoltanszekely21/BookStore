package com.example.model;

public class Book {
	
	private int id;
	private String title;
	private String author;
	private String price;
	private int yearPublished;
	

	public Book() {
		
	}
	
	public Book(int id, String title, String author, int yearPublished, String price) {
		super();
		this.id = id;
		this.title= title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + ", price=" + price + "]";
	}
	
	
	
}

