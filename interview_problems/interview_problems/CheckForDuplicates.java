package com.lal.interview_problems;

import java.util.HashSet;
import java.util.Set;

public class CheckForDuplicates {
	public static void main(String[] args) {
	
	Set<Integer> ss = new HashSet<Integer>(); 

		int[]arr = {1,2,2,3,4,4,5,6};
		
		
		for(Integer arrs:arr) {
		if(ss.add(arrs)==false)
		{
			System.out.println("There is duplicate "+ arrs);
		}}
		
	
		addNumbersToSet(arr);
		}

	public static void addNumbersToSet(int [] arr)
	{
		
		Set<Integer> s = new HashSet<Integer>(); 
		for (int i=0; i<arr.length;i++)
			if(s.add(arr[i])==false) {
				System.out.println("duplicates "+ arr[i] + " "+ "index "+ i);
			}
		
	}
	
			
	}


