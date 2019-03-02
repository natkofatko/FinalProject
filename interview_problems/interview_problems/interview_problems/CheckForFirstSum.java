
package com.lal.interview_problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CheckForFirstSum {

	public static void main(String[] args) {
		
		int [] arr = {1, -1, -3, 4, 5 }; 
		
		TreeSet <Integer> s = new TreeSet<Integer>(); 
	int sum = 0; 
	for(int i1=0; i1<arr.length;i1++)
		s.add(arr[i1]); 
	System.out.println(s.size());
	
		System.out.println(s);
		
	
//	
		for(int i=0; i<arr.length; i++) { 
			for(int j=i+1; j<arr.length; j++) {
				sum = arr[i]+arr[j];
				System.out.print(sum+ " ");
				boolean ss = s.add(sum);
			
		
			}
		}
		
				System.out.println(sum);
				System.out.println(s);
				//if(sum>0 && !s.contains(sum))
				{
					//System.out.println(sum);
				}
				
				
			//	System.out.println(sum);
				
				
			
			
			}}
//	if(s.contains(sum)) {
//		//System.out.println(sum);
//	}
//		 s.add(sum); 
//		// System.out.println(sum);
//		
//			}
//			
//			}
//		System.out.println("Ok" + sum );
//		
//		
//		//System.out.println(s.size());
////		for(int i=0; i<s.size();i++)
////			System.out.println(s.toString());
//		
//	}}
//		 
//	
//		 
//		
//	
//
//
//
//	
		
