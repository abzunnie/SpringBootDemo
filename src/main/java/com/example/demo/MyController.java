package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	User user = new User("Abhishek",29,"ab@test.com");
	
	@Value("${username}")
	private String username;
	
	@Autowired
	INotificationService emailNotificationService;
	
	@Autowired
	INotificationService SMSNotificationService;
	
	@GetMapping("/test")
	public String getGreetings()
	{
		return "Hello World";
	}
	
	@GetMapping("/user")
	public User getUser()
	{
		SMSNotificationService.sendMsg("Admin",200);
		return user;
	}
	
	
}
