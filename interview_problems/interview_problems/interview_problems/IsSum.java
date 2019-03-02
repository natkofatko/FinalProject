package com.lal.interview_problems;

import java.util.HashSet;

public class IsSum {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 5, 6, 9, 10 };
		// System.out.println(SumOdNumber(ar, 122));
		// System.out.println
		isNum(ar, 12);
		checkForDSuplicates(ar);

		System.out.println(isDuplicat2(ar));
	}

	public static boolean SumOdNumber(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 1; j < arr.length; j++)
				if (arr[i] + arr[j] == sum)
					return true;

		return false;
	}

	public static void isNum(int[] arr, int sum2) {
		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			int lastNum = sum2 - arr[i];
			if (s.contains(lastNum)) {
				System.out.println(lastNum + " " + arr[i]);

			}
			s.add(arr[i]);
		}

	}

	public static void checkForDSuplicates(int[] arr) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
			if (set.add(arr[i]) != true)

				System.out.println("There is duplicate at " + arr[i]);

	}

	public static boolean isDuplicat2(int[] arr) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
			if (s.add(arr[i]) != true)
				return false;

		return true;
	}
	
	
}
