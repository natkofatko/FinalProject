package com.lal.interview_problems;

public class Palindrome {
	

	public static void main(String[] args) {
		
	
				
		System.out.println(palindrome1("HEeh"));		
		
		System.out.println(palindrome2("HEleh"));
	}
	
	public static boolean palindrome2(String s)
	{
		int i=0; 
		int j=s.length()-1;
		int k = (i+j)/2;
	
		s = s.toLowerCase(); 
		for(int index=i; index<=k;index++)
		{
			
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
				
			}
			else { 
				return false;} 
			
		}
		return true;
			
		
	
	}
	public static boolean palindrome1 (String s)
	{
		String reversed = ""; 
		int length = s.length(); 
		for(int i=0; i<length; i++)
			reversed=reversed+s.charAt(length-i-1);
	//	if(s.equalsIgnoreCase(reversed))
			if(s.equals(reversed))
			return true;
		return false; 
		
	}
	
	
}
