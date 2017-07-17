package com.test.factory;

public abstract class Computer {
	public abstract String getTYPE();
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString(){
		return "Type :"+this.getTYPE()+": RAM :"+this.getRAM()+": HDD :"+this.getHDD()+" : CPU : "+this.getCPU();
	}
	
}
