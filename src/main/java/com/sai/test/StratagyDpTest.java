package com.sai.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sai.config.AppConfig;
import com.sai.sbeans.Flipkart;

public class StratagyDpTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	Flipkart cart =	ctx.getBean("flipkart",Flipkart.class);
	String shopping=	cart.shopping(new String[] {"Shirt","Pant","Shoe","Spects","Daily_Wear_Combo"}, new double[] {1000.0,3000.0,2500.0,5000.0});
				System.out.println(shopping);
				ctx.close();
	}

}
