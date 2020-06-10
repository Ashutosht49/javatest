package com.test.def;
public class PermutationOfStringJava {

	public static void main(String[] args) {
		permutation("ABCD"); 
		System.out.println(permutation("ABCD"));
	 } 
	public static String permutation(String str) { 
		return permutation("", str); 
	}
	private static String permutation(String prefix, String str) {
		System.out.println(prefix);
		System.out.println(str);
		String per = "";
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
			for (int i = 0; i < n; i++){
	            per = permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
				System.out.println(per);
			}
	    }
	    return per;
	}
}
