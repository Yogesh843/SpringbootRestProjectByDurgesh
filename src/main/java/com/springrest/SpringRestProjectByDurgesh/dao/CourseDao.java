package com.springrest.SpringRestProjectByDurgesh.dao;

import com.springrest.SpringRestProjectByDurgesh.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {

}
