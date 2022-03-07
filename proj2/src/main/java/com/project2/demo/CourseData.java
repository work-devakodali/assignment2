package com.project2.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseData {

        @Bean
        CommandLineRunner commandLineRunner(CourseRepository repository){
            return args -> {
                Course CSE = new Course(1,"ComputerScience","about java");
                Course ECE = new Course(2, "Electronics communications " , "about communications ");
                Course MECH = new Course(3,"Mechanical Engineering "," About running of vehicles");
            repository.saveAll(List.of(CSE, ECE, MECH));
            };

        }
}
