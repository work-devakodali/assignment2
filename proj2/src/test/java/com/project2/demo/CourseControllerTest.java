package com.project2.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseControllerTest {

    CourseController courseController;

    @BeforeEach
    void BeforeEach(){
        courseController = new CourseController();
    }

    @BeforeAll
    static void BeforeAll(){
        System.out.println("Before All............");
    }


    @Test
    void getOneCourse() {
        assertNotNull(courseController);
    }

}