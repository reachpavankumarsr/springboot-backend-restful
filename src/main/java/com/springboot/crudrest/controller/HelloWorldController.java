package com.springboot.crudrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController= @Controller + @responsebody
public class HelloWorldController {
	
	//get
	//post
	//put
	//delete
	//http://localhost:8080/hello-world
	@RequestMapping("/hello-world")
	public String helloWorld() {
		return "<h1>hello World</h1>";
	}

}
