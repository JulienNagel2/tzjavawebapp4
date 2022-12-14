package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String myMsg = "This app is using spring boot v2.7.6 and maybe cosign";
		System.out.println("This is an update. myMsg = " + myMsg);
		String msgToDisplay = getWebContent(myMsg);
		return  msgToDisplay;
	}

	private String getWebContent(String pMsg) {
		java.util.Date d = new java.util.Date();
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
		String dateString = formatter.format(d);
		String msgToDisplay = "<table>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 48;\">" + "Hello, the date is: " + dateString + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 48;\">" + pMsg + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><h1 style=\"font-size: 48;\">" + "The app is powered by Tanzu Application Platform" + "</h1></td></tr>";
		msgToDisplay = msgToDisplay + "<tr><td><img src='https://github.com/JulienNagel2/tzjavawebapp4/raw/main/TAP.png' alt='TAP'></td></tr>"; 
		msgToDisplay = msgToDisplay + "</table>";
		return  msgToDisplay;
	}

}