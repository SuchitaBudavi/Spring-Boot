package com.suchi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.beans.Topic;
import com.suchi.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		System.out.println("TopicController.getAllTopics");
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getATopic(@PathVariable("id") String id) {
		return topicService.getATopic(id);
	}
	
	@RequestMapping(value = "/topics",method=RequestMethod.POST)
	public void addATopic(@RequestBody Topic t) {
		topicService.addATopic(t);
	}
	
	@RequestMapping(value = "/topics",method=RequestMethod.PUT)
	public void updateATopic(@RequestBody Topic t) {
		topicService.updateATopic(t);
	}
	
	@RequestMapping(value = "/topics/{id}",method=RequestMethod.DELETE)
	public void deleteATopic(@PathVariable("id") String id) {
		topicService.deleteATopic(id);
	}
}
