package com.suchi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchi.beans.Course;
import com.suchi.repo.CourseRepository;
import com.suchi.repo.TopicRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepo;
	
	public List<Course> getAllCourse(String topicId) {
		/*ArrayList<Course> courses = new ArrayList<Course>(); 		
		Iterable<Course> i = courseRepo.findAll();
		for (Course course : i) {
			courses.add(course);
		}*/
		return courseRepo.findByTopicTopicId(topicId);
	}
	
	public Course getACourse(String id) {
		return courseRepo.findOne(id);
	}
	
	public void addACourse(Course t) {
		courseRepo.save(t);
	}
	
	public void updateACourse(Course t) {
		courseRepo.save(t);
	}
	
	public void deleteACourse(String id) {
		courseRepo.delete(id);
	}
}
