package com.test.def;

public class StrAvrageValue {
	
	public static int avgValue(String s){
		int s_c=0;
		for(int i =0; i<s.length();i++){
			s_c+=(int)s.charAt(i);
		}
		return s_c/s.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(avgValue("diltopagalhain"));
	}

}
