package com.test.command;

public class SellStock implements Order {
	private Stock abcStock;
	public SellStock(Stock stock) {
		// TODO Auto-generated constructor stub
		this.abcStock = stock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.sell();
		
	}

}
