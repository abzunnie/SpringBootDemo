package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements INotificationService 
{
	//@Value("${email.username}")
	private String[] email;
	@Value("${email.password}")
	private String password;
	@Value("${email.port}")
	private String port;
	
	@Override
	public void sendMsg(String toUser,Integer status)
	{
		System.out.println("Email sent to user"+toUser);
		
	}

}
