package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String myMsg = "We are using spring boot v2.7.6";
		System.out.println("This is an update. myMsg = " + myMsg);
		String msgToDisplay = "<table>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 36;\">" + "Hello, this is a wonderful java web app!" + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 24;\">" + myMsg + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><img src='img_girl.jpg' alt='Girl in a jacket' width='500' height='600'></td></tr>" 
		msgToDisplay = msgToDisplay + "</table>";
		return  msgToDisplay;
	}

}