package com.lal.interview_problems;

import java.util.Arrays;

public class SumOfTwoNumbersInArray {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,5,3,4,8,-2};
		
		Arrays.sort(arr); 
		
		int sum = arr[0]+ arr[1]; 
		int bigSum = arr[arr.length-1]
				+ arr[arr.length-2]; 
		
		System.out.println(sum);
		System.out.println(bigSum);
	}

}
