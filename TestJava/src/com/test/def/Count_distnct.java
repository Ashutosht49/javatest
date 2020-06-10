package com.test.def;
import java.util.HashSet;


public class Count_distnct {
	public static int countTotalDistinct(String s){
		int cnt =0;
		HashSet<String> items = new HashSet<>();
		for(int i =0 ; i<s.length(); ++i){
			String temp="";
			HashSet<Character> ans = new HashSet<>();
			for(int j = i;j<s.length();++j){
				temp=temp+s.charAt(j);
				ans.add(s.charAt(j));
				if(!items.contains(temp)){
					items.add(temp);
					cnt+=ans.size();
				}
			}
		}
		return cnt;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCA"; 
        System.out.println(countTotalDistinct(str)); 
	}

}
