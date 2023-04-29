package com.jovanaz.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/myLoans")
    public String getLoanDetails(String input){
        return "Here are the loan details.";
    }
}
