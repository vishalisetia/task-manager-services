package com.example.demo.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBeanDal HelloWorldBeanDal() {
		return new HelloWorldBeanDal("Hello World");
//		throw new RuntimeException("Something went wrong");
	}
	
	@GetMapping(path = "/hello-world-bean/{name}")
	public HelloWorldBeanDal HelloWorldBeanDal(@PathVariable String name) {
		return new HelloWorldBeanDal(String.format("Hello World, %s", name));
	}
	
}
