package com.test.arr;

public class SortArr {
	public static int[] selecSort(int arr[]){
		for(int i =0 ; i<arr.length-1;i++){
			int index = i;
			for(int j= i+1; j<arr.length;j++){
				if(arr[j] < arr[index])
				{
					index = j;
				}
				int smallno = arr[index];
				arr[index]=arr[i];
				arr[i]=smallno;
			}
		}
		return arr;
	}
	public static int[] bubbleSort(int ab[]){
		for(int i = ab.length; i>=0; i--){
			for(int j=0;j<ab.length-1;j++){
				int k = j+1;
				if(ab[j]>ab[k])
				{
					int temp= ab[j];
					ab[j]=ab[k];
					ab[k]=temp;
				}
			}
		}
		return ab;
	}
	public static int[] inserSort(int ai[]){
		for(int i = 1; i<ai.length; i++)
		{
			for(int j = i; j<0;j--)
			{
				if(ai[j]<ai[j-1])
				{
					int temp=ai[j];
					ai[j]=ai[j-1];
					ai[j-1]=temp;
				}
			}
		}
		return ai;
	}
	public static void main(String arg[]){
		int i[]={6,5,7,3,4,9,8,1};
		int se[] = inserSort(i);
		for(int l =0 ; l<se.length;l++){
			System.out.println(se[l]);
		}
	}
}
