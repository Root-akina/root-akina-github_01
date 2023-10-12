package com.github.controller;

import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/{id}")
    public void deleteEmps(@PathVariable Integer id){
        System.out.println("deleted");
    }
    
}
