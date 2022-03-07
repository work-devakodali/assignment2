package com.project2.demo;


import javax.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CourseName;
    private String CourseDescription;

    public Course() {
    }

    public Course(String courseName, String courseDescription) {
        CourseName = courseName;
        CourseDescription = courseDescription;
    }

    public Course(long id, String courseName, String courseDescription) {
        this.id = id;
        this.CourseName = courseName;
        this.CourseDescription = courseDescription;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", CourseName='" + CourseName + '\'' +
                ", CourseDescription='" + CourseDescription + '\'' +
                '}';
    }
}
