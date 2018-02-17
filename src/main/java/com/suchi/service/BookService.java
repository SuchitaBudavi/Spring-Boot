package com.suchi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchi.beans.Book;
import com.suchi.repo.BookRepository;
import com.suchi.repo.TopicRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepo.findAll();
	}
	
	public List<Book> getAllBooksOfTopic(String topicId) {
		return (List<Book>) bookRepo.findByTopicTopicId(topicId);
	}
	
	public Book getABook(String topicId,int bookId) {
		return bookRepo.getABookOfTopic(topicId,bookId);
	}
	
	public void addABook(Book book) {
		bookRepo.save(book);
	}
	
	public void updateACourse(Book t) {
		bookRepo.save(t);
	}
	
	public void deleteACourse(String id) {
		bookRepo.delete(id);
	}
}
