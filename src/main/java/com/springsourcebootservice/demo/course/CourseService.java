package com.springsourcebootservice.demo.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public List<Course> getCourseByTopicName(String name) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicName(name).forEach(courses::add);
		return courses;
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String name) {
		courseRepository.deleteByName(name);
	}

	public Course getCourseByCourseName(String name) {
		return courseRepository.findAllByName(name);
	}

}
