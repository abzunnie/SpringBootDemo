package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationService 
{
	@Value("${username}")
	private String email;
	@Value("${email.password}")
	private String password;
	@Value("${port}")
	private String port;
		
	public void sendMsg(String toUser,Integer status)
	{
		System.out.println("Message sent to user"+toUser);
		
	}

}
