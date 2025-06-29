package com.example.api_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping
    String get(HttpSession session) {
    	session.setAttribute("username", "junya");
        return "Hello";
    }
}