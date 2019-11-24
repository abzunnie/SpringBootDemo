package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {
	
	@Bean
	EmailUser adminUser()
	{
		return new EmailUser("admin","adminpass");
	}
	
	@Bean
	EmailUser HRUser()
	{
		return new EmailUser("HR","HRpass");
	}
	
		public static void main(String[] args) {
			
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		String names[] = ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		for(String bean:names){
			System.out.println(bean);
		}
	}

}
