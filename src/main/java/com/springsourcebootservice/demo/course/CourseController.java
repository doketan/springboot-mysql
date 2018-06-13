package com.springsourcebootservice.demo.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsourcebootservice.demo.topic.Topic;
import com.springsourcebootservice.demo.topic.TopicService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/topics/{name}/course")
	public List<Course> getCourses(@PathVariable String name){
		return courseService.getCourseByTopicName(name);
	}
	
	@GetMapping("/topics/{tname}/course/{name}")
	public Course getCourse(@PathVariable String name) {
		return courseService.getCourseByCourseName(name);
	}
	
	@PostMapping("/topics/{name}/course")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@PutMapping("/topics/{tname}/course/{name}")
	public void updateCourse(@RequestBody Course course,@PathVariable String name) {
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("/topics/{tname}/course/{name}")
	public void deleteCourse(@PathVariable String name) {
		courseService.deleteCourse(name);
	}
}
