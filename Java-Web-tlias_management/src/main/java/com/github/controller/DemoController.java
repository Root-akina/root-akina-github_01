package com.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public void HelloWorld(){
        System.out.println("Hello World");
    }

    @PostMapping("/depts")
    public void depts(){
        System.out.println("depts");
    }
    
}
