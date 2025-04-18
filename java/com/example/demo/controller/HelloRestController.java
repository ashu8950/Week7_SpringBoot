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
    
    /*UC2 - >Make REST Call to show Hello
	Mark from BridgeLabz
	- Use GET Request Method and pass name as
	query parameter
	- Use CURL to demonstrate the REST API Call
	- curl localhost:8080/hello/query?name=Mark
	-w "\n"*/
    
    // GET: http://localhost:8080/hello/query?name=Ashu
    
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

<<<<<<< HEAD
    
=======
    /*UC3 -> Make REST Call to show Hello
	Mark from BridgeLabz
	- Use GET Request Method and pass name as
	path variable
	- Use CURL to demonstrate the REST API Call
	- curl localhost:8080/hello/param/Mark -w
     "\n"*/
    
    // GET: http://localhost:8080/hello/param/Ashu
    
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }
>>>>>>> UC3_PathVariable
    
}
