package com.example.codeclan.CourseBookingSystem.controllers;

import com.example.codeclan.CourseBookingSystem.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

}
