package com.test.arr;


public class FindMaxAndTwo {
	public static void findTM(int arr[]){
		int max=0;
		int tmax = 0;
		for(int i =0 ; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				tmax = max;
				max=arr[i];
			}
			else if(tmax<arr[i])
			{
				tmax=arr[i];
			}
		}
		System.out.println("Max :"+max+": Tmax:"+tmax);
	}
	public static void main(String arg[]){
		int i[]={6,5,7,3,4,8,1,9};
		findTM(i);
	}
}
