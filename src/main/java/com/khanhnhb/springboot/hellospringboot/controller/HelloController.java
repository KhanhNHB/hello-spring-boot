package com.khanhnhb.springboot.hellospringboot.controller;

import com.khanhnhb.springboot.hellospringboot.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello-world")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("hello-world-object")
    public HelloWorld helloObject() {
        return new HelloWorld("Hello World Object");
    }

}
