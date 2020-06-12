package com.test.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class OrderOfOne {
	HashMap<Integer, Integer> hm;
	ArrayList<Integer> ar;
	OrderOfOne(){
		hm = new HashMap<Integer, Integer>();
		ar = new ArrayList<Integer>();
	}
	void add(int x){
		int size = ar.size();
		ar.add(x);
		hm.put(x, size);
	}
	void randonValue(){
		Random rm = new Random();
		int randValue = rm.nextInt(ar.size());
		int getRand = ar.get(randValue);
		System.out.println(getRand +":get Random");
	}
	void search(int x){
		int index = hm.get(x);
		System.out.println("Search Index ::"+ar.get(index));
		
	}
	void remove(int x){
		int index = hm.get(x);
		hm.remove(x);
		Integer last = ar.get(ar.size()-1);
		Collections.swap(ar, index, ar.size()-1);
		ar.remove(ar.size()-1);
		hm.put(last, index);
		System.out.println(ar +"::"+hm);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderOfOne ofOne = new OrderOfOne();
		ofOne.add(10);
		ofOne.add(30);
		ofOne.add(20);
		ofOne.add(50);
		ofOne.add(40);
		ofOne.add(60);
		ofOne.add(70);
		ofOne.add(90);
		ofOne.search(60);
		ofOne.randonValue();
		ofOne.remove(20);
	}

}
