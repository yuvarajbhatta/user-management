package com.example.coursemanagement.service;

import com.example.coursemanagement.model.Course;
import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    void saveCourse(Course course);
}