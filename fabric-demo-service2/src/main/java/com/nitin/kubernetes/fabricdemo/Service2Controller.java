package com.nitin.kubernetes.fabricdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHelloWorld() {
		
		System.out.println("Hello World from Service 2");
		
		return  "Hello World from Service 2";
	}

}
