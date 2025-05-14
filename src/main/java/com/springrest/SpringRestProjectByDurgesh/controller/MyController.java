package com.springrest.SpringRestProjectByDurgesh.controller;

import com.springrest.SpringRestProjectByDurgesh.entities.Course;
import com.springrest.SpringRestProjectByDurgesh.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getCourses() {

        return ResponseEntity.ok(courseService.getCourses());
    }

    @GetMapping("/courses/{courseId}")
    public ResponseEntity<Course> getCourseByCourseId(@PathVariable Long courseId) {

        return ResponseEntity.ok(courseService.getCourse(courseId));
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {

        return new ResponseEntity<>(courseService.addCourse(course), HttpStatus.CREATED);
    }

    @PutMapping("/courses")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {

        return ResponseEntity.ok(courseService.updateCourse(course));
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {

        try {
            courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
