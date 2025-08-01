package com.example.coursemanagement.repository;

import com.example.coursemanagement.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {}
