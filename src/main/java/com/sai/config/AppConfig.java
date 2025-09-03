package com.sai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sai.sbeans")
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("AppConfig :: 0 - param constructor");
	}

}
