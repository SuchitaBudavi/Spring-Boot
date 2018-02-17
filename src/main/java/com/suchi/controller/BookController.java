package com.suchi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.beans.Book;
import com.suchi.beans.Topic;
import com.suchi.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks(){		
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/topics/{topicId}/books")
	public List<Book> getAllBooksOfTopic(@PathVariable("topicId") String topicId){		
		return bookService.getAllBooksOfTopic(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/books/{bookId}")
	public Book getABook(@PathVariable("topicId") String topicId,@PathVariable("bookId") String bookId) {
		return bookService.getABook(topicId,Integer.parseInt(bookId));
	}
	
	@RequestMapping(value = "/topics/{id}/books",method=RequestMethod.POST)
	public void addABook(@PathVariable("topicId") String topicId,@RequestBody Book book) {
		book.setTopic(new Topic(topicId,"",""));
		bookService.addABook(book);
	}
	
	/*@RequestMapping(value = "/topics",method=RequestMethod.PUT)
	public void updateATopic(@RequestBody Topic t) {
		bookService.updateATopic(t);
	}
	
	@RequestMapping(value = "/topics/{id}",method=RequestMethod.DELETE)
	public void deleteATopic(@PathVariable("id") String id) {
		bookService.deleteATopic(id);
	}*/
}
