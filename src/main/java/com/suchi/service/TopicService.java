package com.suchi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.apache.tools.ant.taskdefs.optional.PropertyFile;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.suchi.beans.Topic;

@Service
public class TopicService {
	
	@Value("${url}")
	String url;
	
	ArrayList<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("1","Core Java","Core Java",new HashSet<String>()),
			new Topic("2","Spring","Spring",new HashSet<String>()),
			new Topic("3","Spring Boot","Spring Boot",new HashSet<String>())));		
	
	public List<Topic> getAllTopics() {
		System.out.println(url);
		return topics;
	}
	
	public Topic getATopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addATopic(Topic t) {
		topics.add(t);
	}
	
	public void updateATopic(Topic t) {
		Topic temp = getATopic(t.getId());
		BeanUtils.copyProperties(t, temp);
	}
	
	public void deleteATopic(String id) {
		/*Topic temp = getATopic(id);
		topics.remove(temp);*/
		topics.removeIf(t -> t.getId().equals(id));
	}
}
