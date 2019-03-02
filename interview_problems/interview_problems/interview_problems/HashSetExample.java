package com.lal.interview_problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet <String> str = new HashSet<String>(); 
		str.add("Poland");
		str.add("Italy");
		str.add("Germany"); 
		str.add("Russia"); 
		str.add("Lotva"); 
		
		System.out.println(str);
		if(str.contains("Germany"))
			System.out.println("There is match");
		
		str.remove("Germany"); 
		 System.out.println("List after removing " + str);
		 System.out.println("Iterating over list");
	Iterator<String> i = str.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
	Set <String> treeSet = new TreeSet<String>(); 
	treeSet.addAll(str); 
	System.out.println(treeSet);
	
	Set <Object> ss = new HashSet<Object>(); 
	ss.add(23); 
	ss.add(3);
	ss.add(13);
	ss.add(63);ss.add(-43);
	System.out.println(ss);
	
	Set<Object> ss2 = new TreeSet<Object>(); 
	ss2.addAll(ss);
	System.out.println(ss2);
	
	Object[] a = ss2.toArray();
	for(int j=0; j<a.length;j++)
		System.out.println(a[j]);
	
	}

}
