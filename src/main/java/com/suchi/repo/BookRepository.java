package com.suchi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.suchi.beans.Book;

public interface BookRepository extends CrudRepository<Book,String>{

	/*@Query(value="select * from BOOK where BOOK_ID in (select BOOK_ID from TOPIC_BOOK where TOPIC_ID=:id)",nativeQuery=true)
	List<Book> getAllBooksOfTopic(String id);*/
	
	public List<Book> findByTopicTopicId(String topicId);
	
	@Query(value="select * from BOOK where BOOK_ID =:bookId and TOPIC_ID=:topicId",nativeQuery=true)
	public Book getABookOfTopic(@Param("topicId") String topicId, @Param("bookId") int bookId);
		
}
