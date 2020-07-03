package com.test.command;

public class BuyStock implements Order {
	private Stock abcStock;
	public BuyStock(Stock stock) {
		// TODO Auto-generated constructor stub
		this.abcStock = stock;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.buy();
		
	}

}
