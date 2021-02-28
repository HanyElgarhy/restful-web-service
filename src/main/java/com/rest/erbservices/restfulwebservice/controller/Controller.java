package com.rest.erbservices.restfulwebservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return  new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return  new HelloWorldBean(String.format("Hello my name is %s", name));
    }
}
