package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @PostMapping
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer){
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
    @PostMapping("/from")
    public ResponseEntity<String> registerCustomerFromForm(@ModelAttribute Customer customer){
        return ResponseEntity.status(HttpStatus.CREATED).body("Customer registered successfully");
    }
}
