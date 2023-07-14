package com.ciambi.springdockertest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin(value = "http://localhost:4200")
public class HelloController {

    @GetMapping("/message")
    protected String getMessage() {
         return """
                 
                 {
                 "res" : "la vita è bella ma la bella vita è meglio... dal vostro be prefe"
                 }
                 
                 """;
    }

}
