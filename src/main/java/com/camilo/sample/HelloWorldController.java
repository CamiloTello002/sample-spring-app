package com.camilo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// this thing that you can see here is a rest controller, which
// means that it will handle http requests. I love this method
@RestController
public class HelloWorldController {
    @GetMapping(path={"/hello", "/what"})
    public String helloWorld() {
        return "Hello world!";
    }
}
