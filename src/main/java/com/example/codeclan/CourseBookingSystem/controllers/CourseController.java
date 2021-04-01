package com.example.codeclan.CourseBookingSystem.controllers;


import com.example.codeclan.CourseBookingSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;
}

