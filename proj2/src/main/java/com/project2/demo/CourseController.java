package com.project2.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;


    //Service to add a course. (POST /courses)
    @PostMapping("/courses")
    public Course AddCourse(@RequestBody  Course course){
        return courseRepository.saveAndFlush(course);
    }


    //Service to retrieve the list of available courses. (GET /courses/list)
    @GetMapping("/courses/list")
    public List<Course> GetCourses(){
        return courseRepository.findAll();
    }


    //Service to retrieve details of a course using course id (GET /courses/{course_id})
    @GetMapping("courses/{id}")
    public Optional<Course> GetOneCourse(@PathVariable Long id){
        return courseRepository.findById(id);
    }
}
