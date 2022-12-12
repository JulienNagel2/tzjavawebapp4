package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String myMsg = "<b>Hello, we are using spring boot v2.7.6</b>";
		System.out.println("This is an update. myMsg = " + myMsg);
		String msgToDisplay = myMsg + "Greetings from Spring Boot + Tanzu!";
		return  msgToDisplay;
	}

}