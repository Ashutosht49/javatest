package com.test.def;
import java.util.HashMap;
import java.util.Map;


public class InterviewArray {
	public static void findPair(int[] arr, int n){
		Map<Integer, Integer> pairMap = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(pairMap.containsKey(n-arr[i])){
				System.out.println("Pair is:"+pairMap.get(n-arr[i])+">>"+arr[i]);
				return;
			}
			pairMap.put(arr[i], i);
		}
	}
	public static void printDis(int[] a, String out, int i, int n, int k){
		if(k==0){
			System.out.println(out);
			return;
		}
		for(int j=i;j<n;j++){
			printDis(a, out+""+(a[j]), j+1, n, k-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,4,5,3,2,5};
		//findPair(arr,8);
		printDis(arr,"",0,arr.length,2);
	}

}
