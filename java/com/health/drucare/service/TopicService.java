package com.health.drucare.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.drucare.entity.Topic;
import com.health.drucare.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	List<Topic> topicList = new ArrayList<>();

	// CREATE OPERATION
	public void createTopic(Topic topic) {
		// TODO Auto-generated method
		topicRepository.save(topic);
	}
	//UPDATE OPERATION
	public Topic updateTopicById(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0; i<topicList.size()-1;i++) {
			if(topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
				topicRepository.save(topic);
			}
		}
		return null;
	}
	//READ OPERATION
	public List<Topic> getTopic() {
		// TODO Auto-generated method stub
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	//READ OPERATION
	public Topic getTopicById(String id) {
		// TODO Auto-generated method stub
		return topicRepository.findById(id).get();
	}
	//DELETE OPERATION
	public void deleteTopicByID(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
	}

}
