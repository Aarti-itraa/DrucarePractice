package com.drucare.springboot.service;

import java.util.Arrays;
import java.util.List;

import com.drucare.springboot.Topic;

public class TopicService {

	List<Topic>topicList =Arrays.asList(new Topic("1","Literature","Learning unknown facts about our culture")
			,new Topic("2","Music","Exploring various rhythm and musical notes")
			);
			
	public List<Topic> getTopic(){
		return Arrays.asList(new Topic("1","Literature","Learning unknown facts about our culture")
			,new Topic("2","Music","Exploring various rhythm and musical notes"));
		
	}
	
	public Topic getTopicById(String id)
	{
		return topicList.stream().filter(i->i.getId().equals(id)).findFirst().get();
	}
}
