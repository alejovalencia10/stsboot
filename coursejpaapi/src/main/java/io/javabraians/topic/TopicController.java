package io.javabraians.topic;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//test
@RestController
public class TopicController {

		// TODO Auto-generated method stub	
	@Autowired
	private TopicService topicService;
	
		@RequestMapping("/topics")
		public List <Topic> getAllTopics() {
			return topicService.getAllTopics();
			}
		
			@RequestMapping("/topics/{id}")
			public Topic getTopics(@PathVariable int id) {
				return topicService.getTopics(id);
			}
			@RequestMapping(method=RequestMethod.POST,value="/topics") 
				public void addTopic(@RequestBody Topic topic) {
					topicService.addTopic(topic);
				}
			@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}") 
			public void updateTopic(@RequestBody Topic topic,@PathVariable int id) {
				topicService.updateTopic(id, topic);
			}
			
			@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
			public void deleteTopic(@PathVariable int id) {
				topicService.deleteTopic(id);
			}
		
	
}