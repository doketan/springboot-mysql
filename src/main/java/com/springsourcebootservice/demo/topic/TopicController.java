package com.springsourcebootservice.demo.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getTopics(){
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{name}")
	public Topic getTopic(@PathVariable String name) {
		return topicService.getTopicByName(name);
	}
	
	@PostMapping("/topics")
	public void addTopics(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{name}")
	public void updateTopics(@RequestBody Topic topic,@PathVariable String name) {
		topicService.updateTopic(topic);
	}
	
	@DeleteMapping("/topics/{name}")
	public void deleteTopic(@PathVariable String name) {
		topicService.deleteTopic(name);
	}
}
