package com.camilo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // this is a handler method
    @GetMapping(path={"/hello", "/what"})
    public String helloWorld() {
        return "Hello world!";
    }
}
