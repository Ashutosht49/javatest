package com.test.command;

public class Stock {
	private String name = "ABC";
	private int qun =10;
	public void buy(){
		System.out.println(name+"::"+qun+":Buy");
	}
	public void sell(){
		System.out.println(name+"::"+qun+":sold");
	}
}
