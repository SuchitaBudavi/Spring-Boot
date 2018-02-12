package com.suchi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.suchi.beans.Topic;
import com.suchi.repo.TopicRepository;

@Service
public class TopicService {		
	
	@Autowired
	TopicRepository topicRepo;
	
	/*= new ArrayList<Topic>(Arrays.asList(
			new Topic("1","Core Java","Core Java"),
			new Topic("2","Spring","Spring"),
			new Topic("3","Spring Boot","Spring Boot")));		*/
	
	public List<Topic> getAllTopics() {
		ArrayList<Topic> topics = new ArrayList<Topic>(); 
		Iterable<Topic> i = topicRepo.findAll();
		for (Topic topic : i) {
			topics.add(topic);
		}
		return topics;
	}
	
	public Topic getATopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepo.findOne(id);
	}
	
	public void addATopic(Topic t) {
		topicRepo.save(t);
		//topics.add(t);
	}
	
	public void updateATopic(Topic t) {
		/*Topic temp = getATopic(t.getId());
		BeanUtils.copyProperties(t, temp);*/
		topicRepo.save(t);
	}
	
	public void deleteATopic(String id) {
		/*Topic temp = getATopic(id);
		topics.remove(temp);*/
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepo.delete(id);
	}
}
