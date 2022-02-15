package com.example.demo.controllers;

import com.example.demo.services.DateCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello there";
    }

    @GetMapping("/endpoint")
    public String endpoint(@RequestParam String input) {
        return "The input was " + input;
    }

    @GetMapping("/www.erdetfredag.dk")
    public String erDetFredag() {
        String dag = DateCalculator.calculateDate();

        return "Det er " + dag + " i dag";
    }


}
