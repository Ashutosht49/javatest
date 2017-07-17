package com.test.factory;

public class ComputerFactory {
	public static Computer getComuter(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)){
			return new PC(type, ram, hdd, cpu);
		}
		else if("SERVER".equalsIgnoreCase(type)){
			return new Server(type, ram, hdd, cpu);
		}
		return null;
	}
}
