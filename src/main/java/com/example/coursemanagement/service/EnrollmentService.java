package com.example.coursemanagement.service;

import com.example.coursemanagement.model.Course;
import com.example.coursemanagement.model.Enrollment;
import com.example.coursemanagement.model.User;

import java.util.List;

public interface EnrollmentService {
    void enrollUserInCourse(User user, Course course);
    List<Enrollment> getEnrollmentsForUser(User user);
}