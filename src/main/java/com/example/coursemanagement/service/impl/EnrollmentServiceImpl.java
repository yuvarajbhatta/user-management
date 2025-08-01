package com.example.coursemanagement.service.impl;

import com.example.coursemanagement.model.Course;
import com.example.coursemanagement.model.Enrollment;
import com.example.coursemanagement.model.User;
import com.example.coursemanagement.repository.EnrollmentRepository;
import com.example.coursemanagement.service.EnrollmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public void enrollUserInCourse(User user, Course course) {
        Enrollment enrollment = new Enrollment();
        enrollment.setUser(user);
        enrollment.setCourse(course);
        enrollmentRepository.save(enrollment);
    }

    @Override
    public List<Enrollment> getEnrollmentsForUser(User user) {
        return enrollmentRepository.findByUser(user);
    }
}
