package io.javabraians.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public List <Topic> topics= new ArrayList<>(Arrays.asList(
				new Topic(1,"spring"),
				new Topic(2,"springboot")
				));

	public List <Topic> getAllTopics(){
		return topics;
	}
	/*
	List<Topic> topics = new ArrayList<>();
	topicRepository.findAll()
	.forEach(topics::add);
	return topics;
	}
	*/
	public Topic getTopics(int id) {
		return topics.stream().filter(t -> t.getId()==id).findFirst().get();
		//return topicRepository.findById(id);
	}
	
	
	/*public Topic getTopics(String id) {
	     for (Topic curTopic:topics) {
	          if (curTopic.getId().equals(id)) return curTopic;
	     }
	     return null;
	     }*/
	
	public void addTopic(Topic topic) {
	topics.add(topic);
	}
	
	public void updateTopic(int id, Topic topic) {
		
		for (int i =0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if( t.getId()==id) {
				topics.set(i, topic);
				return;
			}
		}
		//topicRepository.save(topic);
	}
		
		
		

	public void deleteTopic(int id) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId()==id);
//topicRepository.deleteById(id);
	}
	
}


