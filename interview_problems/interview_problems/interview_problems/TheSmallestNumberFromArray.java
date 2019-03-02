package com.lal.interview_problems;

public class TheSmallestNumberFromArray {

	public static void main(String[] args) {
	int []nn = {1,3,-5,2,4,0,-2}; 
	System.out.println(minNum(nn));

	}
	
	public static int minNum(int [] num)
	
	{
		int min2=num [1]; 
		int min = num[0]; 
		for(int i=0; i<num.length;i++)
			if(num[i]<min)
				min=num[i];
	
			else if(num[i]<min2)
				min2=num[i]; 
	return min2; 
	}
}
