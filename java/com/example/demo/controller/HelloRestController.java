package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

import com.example.demo.model.UserDetails;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	/*
	 UC1 -> Create a Rest Controller to demonstrate
	the various HTTP Methods and respond
	hello messages to the User. To begin
	with show Hello from BridgeLabz
	- Use GET Request Method
	- Use CURL to demonstrate the REST API Call
	- curl localhost:8080/hello -w "\n"*/
	
    // GET: http://localhost:8080/hello or / or /home
	
    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from Chitkara";
    }
    
    
}
