package com.suchi.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Course {
	
	@Id
	private String courseId; 
	private String name;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	//many to one relation
	@ManyToOne(fetch=FetchType.LAZY)
	private Topic topic;
	
	public Course() {
		super();
		startDate = new Date();
	}
	public Course(String id, String name, String desc) {
		super();
		this.courseId = id;
		this.name = name;
		this.description = desc;
		this.startDate = new Date();
	}
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String desc) {
		this.description = desc;
	}		
}
