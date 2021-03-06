package com.test.def;
import java.util.HashSet;
import java.util.Set;


public class ReplaceDuplicateWithGreaterThanPreviousDuplicate {
	private static void replaceElements(int[] arr, int n){
		Set<Integer> se = new HashSet<>();
		for(int i=0;i<n;i++){
			if(!se.contains(arr[i])){
				se.add(arr[i]);
			}
			else{
				for(int j= arr[i]+1;j<Integer.MAX_VALUE;j++){
					if(!se.contains(j)){
						arr[i]=j;
						se.add(j);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 5, 7, 8, 8, 7 }; 
        int n = arr.length; 
        replaceElements(arr, n); 
  
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
	}

}
