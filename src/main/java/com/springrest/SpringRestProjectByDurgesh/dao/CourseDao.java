package com.springrest.SpringRestProjectByDurgesh.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRestProjectByDurgesh.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
	/*
	 * List<Course> getCourses();
	 * 
	 * Course getCourse(long courseId);
	 * 
	 * Course addCourse(Course course);
	 * 
	 * Course updateCourse(Course course);
	 * 
	 * void deleteCourse(long courseId);
	 */

}
