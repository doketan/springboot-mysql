package com.springsourcebootservice.demo.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springsourcebootservice.demo.topic.Topic;

@Entity
public class Course {
	
	@Id
	private Integer id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course(Integer id, String name, String description, Topic topic) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = topic;
	}

	public Course() {
		super();
	}
	
	
}
