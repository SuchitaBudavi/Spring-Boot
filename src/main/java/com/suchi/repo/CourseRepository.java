package com.suchi.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.suchi.beans.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

	public List<Course> findByTopicTopicId(String topicId);
}
