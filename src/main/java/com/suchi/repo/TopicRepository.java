package com.suchi.repo;

import org.springframework.data.repository.CrudRepository;

import com.suchi.beans.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{

}
