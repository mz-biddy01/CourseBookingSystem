package com.example.codeclan.CourseBookingSystem.repositories;

import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookingsCourseName(String courseName);
    List<Customer> findByTownAndBookingsCourseName(String town, String courseName);
    List<Customer> findByAgeGreaterThanAndTownAndBookingsCourseName(int age, String town ,String courseName);
}
