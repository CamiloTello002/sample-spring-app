package com.camilo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// this will be a comment that comes from the main branch
// there are many things that you can do right here at this moment
// and I like rest controllers because they do a pretty good job!
@RestController
public class HelloWorldController {

    // this is a handler method
    @GetMapping(path={"/hello", "/what"})
    public String helloWorld() {
        return "Hello world!";
    }
}
