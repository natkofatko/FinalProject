package com.lal.interview_problems;

public class SearchForAGivenNumberInSortedArray {

	public static void main(String[] args) {

		// ystem.out.println(solve());
		int[] arr = { 1, 2, 3, 4, 23, 34, 45, 56, 67, 89 };

		System.out.println(binarySearch(arr, 89));

	}

	// Running time is O(N), running time is proportional to the growing size of
	// array
	public static int solve() {
		int[] arr = { 1, 2, 3, 4, 23, 34, 45, 56, 67, 89 };
		int x = 48;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == x)
				return i;

		return -1;

	}

	public static int binarySearch(int[] arr, int x) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			if (arr[middle] == x) {
				return middle;
			}

			else if (arr[middle] > x)
				end = middle - 1;

			else
				start = middle + 1;

		}

		return -1;
	}

}
