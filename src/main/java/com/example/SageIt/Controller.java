package com.example.SageIt;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/80")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    public static void main(String[] args) {
        //SpringApplication.run(Controller.java, args);
        System.out.println ("hi vishnu");
    }
}