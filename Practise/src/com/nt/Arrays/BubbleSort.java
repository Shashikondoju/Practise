package com.nt.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {2,4,22,1};
		int temp=0;
		for (int i= 0; i < arr.length; i++) {
			for(int j=0; j < (arr.length-1); j++){  
				if(arr[j] > arr[j+1]){  
					temp = arr[j];  
					arr[j] = arr[j+1];  
					arr[j+1] = temp;  
				} 		
			}  
		}
	System.out.println(java.util.Arrays.toString(arr));
	}
}
