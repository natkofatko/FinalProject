package com.lal.interview_problems;

public class Star {
	
	public static void main(String[] args) {
		
		triangle(4);
	}

	
	public static void triangle(int n)
	{
		 int i=0;
		 int j=0;
		 
		 if(n>0)
		 {
		    for(i=0; i< n; i++)
		    {
		        for(j=0;j<=i;j++)
		        {
		            System.out.printf("*");
		        }
		        System.out.printf("\n");
		    }}
		 else {
			 System.out.println("Number is negative");
		 }
		}
	}


