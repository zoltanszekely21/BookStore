package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "BOOKNUMBER")
	private String bookNumber;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "YEARPUBLISHED")
	private int yearPublished;
	
	@Column(name = "PRICE")
	private String price;
	

    @ManyToOne/*(fetch = FetchType.LAZY, optional = false)*/
    @JoinColumn(name = "id_bestsellers", nullable = false)
    private Bestsellers bestsellers;


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
		return getPrice();
	}
	public void setPrice(String price) {
		this.price = price;
	}
}