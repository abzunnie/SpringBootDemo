package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	User user = new User("Abhishek",29,"ab@test.com");
	
	@Autowired
	NotificationService notificationService;
	
	@GetMapping("/test")
	public String getGreetings()
	{
		return "Hello World";
	}
	
	@GetMapping("/user")
	public User getUser()
	{
		notificationService.sendMsg("Admin",200);
		return user;
	}
}
