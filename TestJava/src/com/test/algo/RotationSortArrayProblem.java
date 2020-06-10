package com.test.algo;

public class RotationSortArrayProblem {
	public static int searchElement(int[] arr, int n){
		int ini=0, last=arr.length-1;
		int mid=arr.length/2;
		int val=0;
		if(n < arr[mid]&& n > arr[ini]){
			while(ini < mid){
				if(arr[ini] == n){
					val =ini;
					break;
				} else {
					ini--;
				}
			}
		}
		else {
			while(mid<last){
				if(arr[last]==n)
				{
					val=last;
					break;
				} else {
					last--;
				}
			}
		}
		return val;
	}
    public void sortRotedArray(int[] arr , int n){
    	int ini =0, nth =n, length = arr.length -1;
    	swap(arr, ini, nth);
    	swap(arr, nth+1, length);
    	swap(arr, ini, length);
    	for(int i=0;i<arr.length;i++){System.out.print(" "+arr[i]);}
    }
    public void swap(int[] arr, int ini , int last){
       	while(ini <= last){
    		int temp = arr[ini];
    		arr[ini]=arr[last];
    		arr[last] = temp;
    		ini++;
    		last--;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,6,1,2};
		System.out.println("Print Index:"+searchElement(arr, 1));
		RotationSortArrayProblem rotationSortArrayProblem = new RotationSortArrayProblem();
		rotationSortArrayProblem.sortRotedArray(arr, 3);
	}

}
