package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.entity.Book;
import com.example.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping(value="/get")
	public List<Book> getbook() {
		return bookService.getBook();
	}
	@PostMapping(value="/post")
	public Book postBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	@PutMapping(value="/put/{id}")
	public String putBook(int id, @RequestBody Book book) {
		return bookService.updateBook(id, book);
	}
	 @DeleteMapping(value="/delete/{id}")
	    public String deleteBook(@PathVariable int id) {
	        return bookService.deleteBook(id);
	    }
}
