package com.lal.interview_problems;

public class BubbleSort {

	public static void main(String[] args) {
		
		int []arr = {3,6,2,8,1,5};
		 int n = arr.length; 
	        for (int i = 0; i < n; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                } 
	        System.out.println(arr[n-1]);
	}
}
