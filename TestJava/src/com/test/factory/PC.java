package com.test.factory;

public class PC extends Computer {
	private String ram;
	private String cpu;
	private String hdd;
	private String type;
	public PC(String type, String ram, String cpu, String hdd){
		this.type = type;
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String getTYPE() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
