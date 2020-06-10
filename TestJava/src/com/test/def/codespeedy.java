package com.test.def;

public class codespeedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello Dvenashi how are you";
		char ch[]= str.toCharArray();
		int c[]=new int[26];
		for(int i=0;i<str.length();i++){
			if(ch[i]!=' '){
				c[i]=c[ch[i]-'a']++;
			}
		}
		String s2="";
		for(int i=0;i<26;i++){
			if(c[i]==0){
				s2=s2+(char)(i+'a');
			}
		}
		System.out.println(s2);
	}

}
