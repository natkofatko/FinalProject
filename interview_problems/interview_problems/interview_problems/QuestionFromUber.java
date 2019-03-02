package com.lal.interview_problems;

import java.lang.reflect.Array;

public class QuestionFromUber {
	
	public static void main(String[] args) {
		calc();
	}
   
	 static final double EPS = 1e-9; 
	  
	    static void productPuzzle(int a[], int n) 
	    { 
	        // to hold sum of all values 
	        double sum = 0;  
	        for (int i = 0; i < n; i++) { 
	            sum += Math.log10(a[i]); 
	        System.out.println(sum + "  " +a[i]);
	        }
	        
	        // output product for each index 
	        // anti log to find original product value 
	        for (int i = 0; i < n; i++) 
	            System.out.print((int)(Math.pow(10.00, 
	                          sum - Math.log10(a[i]))) + " ");  
	    
	        
	    } public static void calc ()
	    {
	  
	    int[] a = {1,2,3,4,5}; //this is the array with values
	    int[] r = new int[a.length]; // this is array where we will be storing new values
	    
	    
	    int x = 1; 
	    r[0] = 1;
	    System.out.println(r[0]);
	    for (int i=1;i<a.length;i++){
	        r[i]=r[i-1]*a[i-1];
	    }
	    for (int i=a.length-1;i>0;i--){
	        x=x*a[i];
	        r[i-1]=x*r[i-1];
	    }
	    
	    
	    
	    
	    
	    
	    
	    for (int i=0;i<r.length;i++){
	        System.out.println(r[i]);
	    }
	    }
	    
	
}
