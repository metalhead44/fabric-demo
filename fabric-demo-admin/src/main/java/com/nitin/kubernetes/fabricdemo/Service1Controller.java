package com.nitin.kubernetes.fabricdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
		
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHelloWorld() {
		
		return "Hello World from Service 1";
		
	}

}
