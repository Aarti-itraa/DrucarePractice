package com.health.drucare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.health.drucare.entity.Topic;
import com.health.drucare.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	// CREATE OPERATION
	@RequestMapping(method =RequestMethod.POST ,value="/topic")
	public void createTopic(@RequestBody Topic topic) {
		topicService.createTopic(topic);
	}
	//UPDATE OPERATION
	@RequestMapping(method =RequestMethod.PUT ,value="/topic/id")
	public Topic updateTopicById(@PathVariable String id,@RequestBody Topic topic) {
		return topicService.updateTopicById(id, topic);
	}
	//READ OPERATION
	@RequestMapping(method =RequestMethod.GET ,value="/topic")
	public List<Topic> getTopic() {
		return topicService.getTopic();
	}
	//READ OPERATION
	@RequestMapping(method =RequestMethod.GET ,value="/topic/id")
	public Topic getTopicById(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	//DELETE OPERATION
	@RequestMapping(method =RequestMethod.DELETE ,value="/topic")
	public void deleteTopicById(@PathVariable String id) {
		topicService.deleteTopicByID(id);
	}

}
