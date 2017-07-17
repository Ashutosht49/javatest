package com.test.factory;

public class TestFactory {
	public static void main(String args[]){
		Computer pc = ComputerFactory.getComuter("pc", "1 GB", "1 Tb", "p4");
		Computer server = ComputerFactory.getComuter("server", "1 GB", "1 Tb", "p4");
		System.out.println(pc);
		System.out.println(server);
	}

}
