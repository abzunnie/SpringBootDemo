package com.example.demo;

public interface INotificationService {

	void sendMsg(EmailUser fromUser, String toUser, Integer status);

}