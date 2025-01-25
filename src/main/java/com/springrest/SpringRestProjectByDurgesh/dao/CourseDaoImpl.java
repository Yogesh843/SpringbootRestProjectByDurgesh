package com.springrest.SpringRestProjectByDurgesh.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.springrest.SpringRestProjectByDurgesh.entities.Course;

//@Repository
//public class CourseDaoImpl implements CourseDao {
//
//	private List<Course> list;
//	
//	public CourseDaoImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "Java Core Course", "This course contains basics of java"));
//		list.add(new Course(4343, "Spring Boot Course", "Creating rest api using spring boot"));
//	}
//
//	@Override
//	public List<Course> getCourses() {
//		
//		return list;
//	}
//	
//	@Override
//	public Course getCourse(long courseId) {
//		
//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		return c;
//	}
//	
//	@Override
//	public Course addCourse(Course course) {
//		
//		list.add(course);
//		return course;
//	}
//
//	@Override
//	public Course updateCourse(Course updatedCourse) {
//		
//		list.forEach(e -> {
//			if (e.getId()==updatedCourse.getId()) {
//				e.setTitle(updatedCourse.getTitle());
//				e.setDescription(updatedCourse.getDescription());
//			}
//		});
//		return updatedCourse;
//	}
//
//	@Override
//	public void deleteCourse(long courseId) {
//		
//		list = list.stream().filter(e -> e.getId()!=courseId).collect(Collectors.toSet());
//	}
//}