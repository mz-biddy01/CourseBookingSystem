package com.example.codeclan.CourseBookingSystem.components;


import com.example.codeclan.CourseBookingSystem.models.Booking;
import com.example.codeclan.CourseBookingSystem.models.Course;
import com.example.codeclan.CourseBookingSystem.models.Customer;
import com.example.codeclan.CourseBookingSystem.repositories.BookingRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CourseRepository;
import com.example.codeclan.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Customer Boris = new Customer("Boris", "London", 52);
        customerRepository.save(Boris);
        Customer Dominic = new Customer("Dominic", "Glasgow", 29);
        customerRepository.save(Dominic);
        Customer Anna = new Customer("Anna", "Glasgow", 30);
        customerRepository.save(Anna);
        Customer Helen = new Customer("Helen", "Lagos", 27);
        customerRepository.save(Helen);
        Course Linkedin = new Course("Linkedin", "Malaga", 5);
        courseRepository.save(Linkedin);
        Course Python = new Course("Python", "Essex", 4);
        courseRepository.save(Python);
        Course Java = new Course("Java", "Leeds", 5);
        courseRepository.save(Java);
        Booking booking = new Booking("21-03-2021", Python, Anna);
        bookingRepository.save(booking);
        Booking booking1 = new Booking("28-11-2020", Linkedin, Dominic);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("19-03-2021", Java, Helen);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("20-09-2020", Linkedin, Boris);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("17-10-2023", Java, Dominic);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("18-08-2018", Python, Helen);
        bookingRepository.save(booking5);
    }
}
