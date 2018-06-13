package com.springsourcebootservice.demo.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

	Iterable<Course> findByTopicName(String name);

	void deleteByName(String name);

	Course findAllByName(String name);
}
