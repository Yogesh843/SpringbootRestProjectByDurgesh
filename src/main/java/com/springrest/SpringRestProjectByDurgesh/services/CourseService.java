package com.springrest.SpringRestProjectByDurgesh.services;

import java.util.List;
import java.util.Set;

import com.springrest.SpringRestProjectByDurgesh.entities.Course;

public interface CourseService {
	
	List<Course> getCourses();

	Course getCourse(long courseId);

	Course addCourse(Course course);

	Course updateCourse(Course course);

	void deleteCourse(long courseId);

}
