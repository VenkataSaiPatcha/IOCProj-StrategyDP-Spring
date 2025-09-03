package com.sai.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//dependency class 1
@Component("bDart")
public class BlueDart implements Courier
{
	public BlueDart()
	{
		System.out.println("BlueDart :: 0 - param constructor");
	}
	@Override
	public String deliver(int oID) 
	{
		return oID+" id delivered through BlueDart courier service";
	}
}
