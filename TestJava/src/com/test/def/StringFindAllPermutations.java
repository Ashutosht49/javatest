package com.test.def;
import java.util.HashSet;
import java.util.Set;


public class StringFindAllPermutations {
	public static Set<String> permutaor(String str) {
		Set<String> perm = new HashSet<String>();
		if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
		char initial = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words=permutaor(rem);
		for(String strNew:words){
			for(int i=0;i<=strNew.length();i++){
				perm.add(charString(strNew,initial,i));
			}
		}
		return perm;
	}
	public static String charString(String st, char c, int j){
		String begun = st.substring(0,j);
		String end = st.substring(j);
		return begun+c+end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutaor(s));

	}

}
