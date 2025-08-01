package com.example.coursemanagement.repository;

import com.example.coursemanagement.model.Enrollment;
import com.example.coursemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findByUser(User user);
}
