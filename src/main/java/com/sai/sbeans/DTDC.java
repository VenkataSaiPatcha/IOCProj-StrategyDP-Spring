package com.sai.sbeans;

import org.springframework.stereotype.Component;
// dependent class 2
@Component("dtdc")
public class DTDC implements Courier
{
	public DTDC()
	{
		System.out.println("DTDC :: 0 - param constructor");
	}
	
	@Override
	public String deliver(int oID) 
	{
		return oID+" is delivered through DTDC service";
	}
}
