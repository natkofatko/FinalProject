package com.lal.interview_problems;

public class KadaneAlgorithm {
	
	
	
	public static void main(String[] args) {
		
		int[]nums = {1,-2,3,4,-5,8}; 
		System.out.println(solve(nums)); 
	}
	public  static int solve(int[]nums) {
		//initialize the algorithm with the first item in the array
		int max_global = nums[0]; 
		int max_current = nums[0]; 
		
		for(int i=1;i<nums.length;i++) {
			max_current = Math.max(nums[i], max_current+nums[i]); 
			if(max_current>max_global)
				max_global= max_current; 
		}
		return max_global; 
		}
	}


