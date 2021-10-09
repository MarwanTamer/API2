package com.example.APItest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumer_services")
public class controller {


    @Autowired
    private CustomerDetailedInquiryRepositry repositry;
    @PostMapping
    public CustomerDetailedInquiry customerDetailedInquiry
    ( @RequestBody CustomerDetailedInquiry customerDetailedInquiry) {
        return repositry.save(customerDetailedInquiry);
}}
