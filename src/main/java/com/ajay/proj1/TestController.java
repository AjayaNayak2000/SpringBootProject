package com.ajay.proj1;

import org.springframework.web.bind.annotation.*;

@RestController // Use RestController for REST APIs
@RequestMapping("/api") // Base URL for all mappings
public class TestController {
    
    @GetMapping("/add") // This handles GET requests to /api/add
    public int add(@RequestParam int num1, @RequestParam int num2) {
        System.out.println("The numbers are: |num1:" + num1 + "|num2:" + num2);
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is: " + sum);
        return sum;
    }
}



