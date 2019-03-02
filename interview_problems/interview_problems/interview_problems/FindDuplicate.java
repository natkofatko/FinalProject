package com.lal.interview_problems;

public class FindDuplicate{

	 static void printRepeating(int arr[], int size) 
	    { 
	        int i;   
	        System.out.println("The repeating elements are : "); 
	     
	        for (i = 0; i < size; i++) 
	        { 
	            if (arr[Math.abs(arr[i])] >= 0) 
	                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
	            else
	                System.out.print(Math.abs(arr[i]) + " p"); 
	        }          
	    }  
	 public static void cala(int[]arr) {
		 for(int i=0; i<arr.length; i++)
			 for(int j=i+1  ; j<arr.length;j++)
				 if(arr[i]==arr[j])
					 System.out.println("We have duplicate" + arr[i]);

	 
	 }
	 static void repeat(int [] arr,int size)
	 {
		 int[] count = new int[size]; 
		 for(int i=0; i<size;i++)
			 if(count[arr[i]]==1)
				 System.out.println(arr[i]+ " ");
			 else count[arr[i]]++; 
	 }

	 public static void main(String[] args) {
		
		 int[]arr = {1, 2, 2, 3, 3, 4, 8, 7};
int size = arr.length; 
		 //cala(arr);
		repeat(arr, size); 
	}
}

