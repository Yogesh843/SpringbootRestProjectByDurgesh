package com.springrest.SpringRestProjectByDurgesh.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRestProjectByDurgesh.dao.CourseDao;
import com.springrest.SpringRestProjectByDurgesh.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {

		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {

		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course newCourse) {

		Course oldCourse = courseDao.findById(newCourse.getId()).get();
		oldCourse.setTitle(newCourse.getTitle());
		oldCourse.setDescription(newCourse.getDescription());
		return courseDao.save(oldCourse);
	}

	@Override
	public void deleteCourse(long courseId) {

		Course course = courseDao.findById(courseId).get();
		courseDao.delete(course);
	}
}
