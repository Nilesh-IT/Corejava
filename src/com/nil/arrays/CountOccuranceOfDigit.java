package com.nil.arrays;

public class CountOccuranceOfDigit {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5 };
		int len = arr.length;
		int x = 5;

		System.out.println("Count occurance" + countOccurance(arr, len, x));

	}

	private static int countOccurance(int[] arr, int len, int x) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (x == arr[i]) {
				count++;
			}
		}

		return count;
	}

}
