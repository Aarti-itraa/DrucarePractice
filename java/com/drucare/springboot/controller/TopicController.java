package com.drucare.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.drucare.springboot.Topic;
import com.drucare.springboot.service.TopicService;

public class TopicController {

	@Autowired
	TopicService topicService;
	@RequestMapping("/topic")
	public List<Topic> getTopic()
	{
		return topicService.getTopic();
	}
	
	@RequestMapping("/topic/id")
	public Topic getTopicById(@PathVariable String id)
	{
		return topicService.getTopicById(id);
	}
}
