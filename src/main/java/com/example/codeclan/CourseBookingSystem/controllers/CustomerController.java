package com.example.codeclan.CourseBookingSystem.controllers;


import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.CourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value="/customers")
    public ResponseEntity<List<Customer>> getCustomers(
            @RequestParam(name = "courseName", required = false) String courseName,
            @RequestParam(name = "town", required = false) String town,
            @RequestParam(name = "age", required = false) Integer age


    ){
        if (age != null && town != null && courseName != null){
            List<Course> courses = courseRepository.findByName(courseName);
            return new ResponseEntity<>(customerRepository.findByAgeGreaterThanAndTownAndBookingsCourseName(age, town, courses.get(0).getName()),HttpStatus.OK);
        }

        if(town != null && courseName != null){
            List<Course> courses = courseRepository.findByName(courseName);
            return new ResponseEntity<>(customerRepository.findByTownAndBookingsCourseName(town, courses.get(0).getName()),HttpStatus.OK);
        }
        if(courseName != null) {
            return new ResponseEntity<>(customerRepository.findByBookingsCourseName(courseName), HttpStatus.OK);
        }

        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}
