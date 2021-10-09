package com.example.APItest2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {


//    @Autowired
//    private CustomerDetailedInquiryRepositry repositry;
    @PostMapping("/api/consumer_services")
    public String customerDetailedInquiry
    ( @RequestBody CustomerDetailedInquiry customerDetailedInquiry) {
    	System.out.println("Found");
    	return "done";
}}
