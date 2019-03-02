package com.lal.interview_problems;

public class primeNum {
	public static void main(String[] args) {
		
		System.out.println(isPrime(12));
	}

	static boolean isPrime(int n) {
	
	for (int k=2; k<n-1; k++) {
		
	int j = n%k; 
		if(n%k==0) {
			System.out.println(j);
		
			return false; 
			
	}
	 return true;
	 
//	
	}
	return false; 
	
	}
}
