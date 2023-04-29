package com.jovanaz.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @GetMapping("/myCards")
    public String getCardDetails(String input){
        return "Here are the card details.";
    }
}
