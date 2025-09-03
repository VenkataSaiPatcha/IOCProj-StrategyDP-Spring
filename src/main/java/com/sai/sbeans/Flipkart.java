package com.sai.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public class Flipkart
{
	@Autowired
	@Qualifier("bDart")
	private Courier courier;
	
	public Flipkart()
	{
		System.out.println("Flipkart :: 0 param constructor");
	}
	public String shopping(String []iteams, double []prices)
	{
		// calculating bill amount
		double price = 0.0;
		for(double pr:prices)
		{
			price=price+pr;
		}
		// generating order id
		
		int id = new Random().nextInt(10000);
		String message =courier.deliver(id);
		return Arrays.toString(iteams)+" are delivered through ::"
				+message+" with order id ::"+id+" of amount ::"+price;
	}
}
