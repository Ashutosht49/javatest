package com.test.algo;

public class SortingAlgo {
	public void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[j-1]>arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Bubble Sort::");
		for(int i=0;i<arr.length;i++){
	
			System.out.print(arr[i]+" ");
		}
	}
	public void insersetionSort(int[] arr){
		for(int i=1; i<arr.length;++i){
			int key = arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println("Insertion Sort::");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={6,7,5,3,4,9,8,1};
		SortingAlgo sortingAlgo = new SortingAlgo();
		sortingAlgo.bubbleSort(ar);
		sortingAlgo.insersetionSort(ar);
	}

}
