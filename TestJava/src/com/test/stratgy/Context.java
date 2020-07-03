package com.test.stratgy;

public class Context {
	private OpStrategy opStrategy;
	public Context(OpStrategy opStrategy) {
		// TODO Auto-generated constructor stub
		this.opStrategy=opStrategy;
	}
	public int excuteStrategy(int x, int y){
		return opStrategy.doOpertation(x, y);
	}
}
