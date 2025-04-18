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
    
    /*UC4 -> Make REST Call to show Hello Mark
   	Taylor from BridgeLabz
   	- Use POST Request Method and pass first name and
   	last name in the Body
   	- Create User DTO Bean with firstName and lastName as
   	attributes.
   	- Use CURL to demonstrate the REST API Call
   	- curl -X POST -H "Content-Type: application/json" -d
   	'{"firstName": ”Mark","lastName": ”Taylor"}'
   	"http://localhost:8080/hello/post" -w "\n"*/
       
       // POST: http://localhost:8080/hello/post
       
       // JSON Body: { "firstName": "Ashu", "lastName": "Singh" }
       
       @PostMapping("/post")
       public String sayHelloPost(@RequestBody UserDetails user) {
           return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
       }
       
       /*UC5 ->
        * Make REST Call to show Hello Mark
	   	Taylor from BridgeLabz
	   	- Use PUT Request Method and pass first name as
	   	Path Variable and last name as Query Parameter
	   	- Use CURL to demonstrate the REST API Call
	   	- curl -X PUT
	   	localhost:8080/hello/put/Mark/?lastName=Taylor
	   	-w "\n"*/
       
       // PUT: http://localhost:8080/hello/put/Ashu?lastName=Singh
       
       @PutMapping("/put/{firstName}")
       public String sayHelloPut(@PathVariable String firstName,
                                 @RequestParam(value = "lastName") String lastName) {
           return "Hello " + firstName + " " + lastName + "!";
       }
    
}
