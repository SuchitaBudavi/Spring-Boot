package com.suchi.repo;

import org.springframework.data.repository.CrudRepository;

import com.suchi.beans.BookRating;

public interface BookRatingRepository extends CrudRepository<BookRating,String>{

}
