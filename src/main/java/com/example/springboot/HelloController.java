package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String myMsg = "We are using spring boot v2.6.0";
		System.out.println("This is an update. myMsg = " + myMsg);
		String msgToDisplay = "<table>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 60;\">" + "Hello, this is a wonderful java web app!" + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 48;\">" + myMsg + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 48;\">" + "The app is powered by Tanzu Application Platform" + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><img src='https://github.com/JulienNagel2/tzjavawebapp4/raw/main/TAP.png' alt='TAP'></td></tr>"; 
		msgToDisplay = msgToDisplay + "</table>";
		return  msgToDisplay;
	}

}