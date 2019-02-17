package com.lal.interview_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Annagram {
public static void main(String[] args) {
	
	char[]s = {'b','c','a','b'}; 
	char[]s2 = {'b','b','a','a'}; 
	System.out.println(isAnagram(s, s2)); 
	
}

public static boolean isAnagram(char[]s1, char[]s2)
{
	//first check if both strings have the same number of characters
	 if(s1.length!=s2.length)
		 return false; 
	 
	 //sort both strings using Arrays sort method
	 Arrays.sort(s1); 
	 Arrays.sort(s2);
	 
	 for(int i=0; i<s1.length;i++)
	 if(s1[i]!=s2[i])
		 return false; 
	
	return true; 
	 
}
}
