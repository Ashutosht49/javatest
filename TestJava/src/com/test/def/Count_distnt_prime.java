package com.test.def;
import java.util.HashSet;
import java.util.Set;


public class Count_distnt_prime {
	
	static boolean isPrime(int n){
		System.out.println(Math.sqrt(n));
		int i;
		if(n==1)
			return false;
		for(i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int countDist(String s){
		Set<Character> m = new HashSet<>();
		for(int i=0;i<s.length();i++){
			m.add(s.charAt(i));
		}
		return m.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "geeksforgeeks"; 
      
        if (isPrime(countDist(str))) 
            System.out.println("Yes"); 
        else
            System.out.println("No");
	}

}
