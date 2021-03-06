package com.health.drucare.entity;

import javax.persistence.Entity;

@Entity
public class Topic {

	private String id;
	private String topicName;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic(String id, String topicName, String description) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.description = description;
	}
	
	
}
