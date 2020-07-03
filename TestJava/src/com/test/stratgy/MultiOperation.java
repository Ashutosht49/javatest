package com.test.stratgy;

public class MultiOperation implements OpStrategy {

	@Override
	public int doOpertation(int x, int y) {
		return x*y;
	}

}
