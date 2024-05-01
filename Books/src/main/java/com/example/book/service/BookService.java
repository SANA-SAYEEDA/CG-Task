package com.example.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.book.entity.Book;
import com.example.book.repository.BookRepository;

public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getBook() {
		return bookRepository.findAll();
	}

	public Book createBook(Book book) {
		
		Book p= bookRepository.save(book);
		return p;
	}

	public String updateBook(int id, Book book) {
		
		Optional<Book> existingbook = bookRepository.findById(id);
		if(existingbook.isPresent()) {
			Book book1 = existingbook.get();
			book1.setTitle(book.getTitle());
			bookRepository.save(book1);
			return "Update Record";
			}
			else {
				return "Record not found!";
			}
		}
	public String deleteBook(int id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()) {
            bookRepository.deleteById(id);
            return "Record deleted successfully";
        } else {
            return "Record not found!";
        }
    }
}
