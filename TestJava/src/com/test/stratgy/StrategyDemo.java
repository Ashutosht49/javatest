package com.test.stratgy;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new AdiOperation());
		System.out.println("10+5 = "+context.excuteStrategy(5, 10));
		context = new Context(new MultiOperation());
		System.out.println("10*5="+context.excuteStrategy(4, 5));
	}

}
