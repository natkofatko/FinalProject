package com.lal.interview_problems;

public class Palindrome {
	

	public static void main(String[] args) {
		
	
				
		System.out.println(palindrome1("HEeh"));		
		
		System.out.println(palindrome2("HEleh"));
		System.out.println(isP("Hehe"));
		System.out.println(isPal4("Mama"));
		
		
		System.out.println(match(1221));
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
	
	//using recursice call
	public static boolean isPalRec(String str, int s, int e)
	{
		if(s==e)
			return true; 
		if(str.charAt(s)!=str.charAt(e))
return false; 
		if (s<e+1)
			return isPalRec(str, s+1, e-1);
		return true; 
		
	}
	
	public static boolean isP(String s)
	{
		int n = s.length();
		if (n==0)
			return true; 
		return isPalRec(s, 0, n-1); 
	}
	
	//using reverse library
	public static boolean isPal4(String s)
	{
		String reverse = new StringBuffer(s).reverse().toString(); 
		if(s.equalsIgnoreCase(reverse))
			return true; 
		else return false; 
	}
	
	public static int isNumPalindrome(int n)
	{
		int reminder=0;
		int reversed =0; 
		
		while(n>0)
		{
			reminder = n%10;
			n=n/10; 
			reversed = reversed*10 +reminder; 
		}
		
	 return reversed; 
		
		
		
	
		
	}
	public static boolean match(int num)
	{
		if(num==isNumPalindrome(num))
		return true;
		else return false; 
	}
}
