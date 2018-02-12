package com.suchi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.beans.Course;
import com.suchi.beans.Topic;
import com.suchi.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses/")
	public List<Course> getAllCourses(@PathVariable("topicId") String topicId){
		return courseService.getAllCourse(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Course getACourse(@PathVariable("topicId") String topicId,@PathVariable("courseId") String courseId) {
		return courseService.getACourse(courseId);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses",method=RequestMethod.POST)
	public void addACourse(@PathVariable("topicId") String topicId,@RequestBody Course t) {
		t.setTopic(new Topic(topicId,"",""));
		courseService.addACourse(t);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses",method=RequestMethod.PUT)
	public void updateACourse(@PathVariable("topicId") String topicId,@RequestBody Course t) {
		t.setTopic(new Topic(topicId,"",""));
		courseService.updateACourse(t);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}",method=RequestMethod.DELETE)
	public void deleteACourse(@PathVariable("topicId") String topicId,@PathVariable("courseId") String courseId) {
		courseService.deleteACourse(courseId);
	}
}
