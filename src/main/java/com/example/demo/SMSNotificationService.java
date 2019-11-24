package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements INotificationService 
{
	@Value("${sms.username}")
	private String email;
	@Value("${sms.password}")
	private String password;
	
	
	@Override
	public void sendMsg(String toUser,Integer status)
	{
		System.out.println("SMS sent to user"+toUser);
		
	}

}
