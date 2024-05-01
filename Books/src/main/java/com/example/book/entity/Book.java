package com.example.book.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	int id;
	String title;
	String author;
	int isbn;
	String genre;
	int pyear;
	public Book() {
		super();
	}
	public Book(int id, String title, String author, int isbn, String genre, int pyear) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.pyear = pyear;
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
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPyear() {
		return pyear;
	}
	public void setPyear(int pyear) {
		this.pyear = pyear;
	}
}
