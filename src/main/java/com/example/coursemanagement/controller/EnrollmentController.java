package com.example.coursemanagement.controller;

import com.example.coursemanagement.model.Course;
import com.example.coursemanagement.model.Enrollment;
import com.example.coursemanagement.model.User;
import com.example.coursemanagement.repository.CourseRepository;
import com.example.coursemanagement.repository.UserRepository;
import com.example.coursemanagement.service.EnrollmentService;
import com.example.coursemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class EnrollmentController {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping("/courses/enroll/{id}")
    public String enrollInCourse(@PathVariable Long id, Principal principal) {
        Course course = courseRepository.findById(id).orElseThrow();
        User user = userService.findByUsername(principal.getName());
        enrollmentService.enrollUserInCourse(user, course);
        return "redirect:/dashboard";
    }

    @GetMapping("/enrollments")
    public String viewEnrollments(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        List<Enrollment> enrollments = enrollmentService.getEnrollmentsForUser(user);
        model.addAttribute("enrollments", enrollments);
        return "enrollments";
    }

}
