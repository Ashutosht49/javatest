package com.test.def;

public class ContainsValue {
	
	public static void listContains(int n, int d){
		String str = ""+d;
		char ch = str.charAt(0);
		for(int i=0; i<n; i++){
			str = "";
			str=""+i;
			if(i==d || str.indexOf(ch)>=0){
				System.out.println(i+"");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listContains(300, 7);
	}

}
