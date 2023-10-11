// Finid second largest number from array 
package com.nil.arrays;

import java.util.Scanner;

public class SecondLargest {
	static Scanner scr = new Scanner(System.in);
	static int largestno = 0;
	static int secondlargestNo = 0;

	public static void main(String[] args) {
		System.out.println("Enter a Numbers");
		int a = scr.nextInt();
		int[] arr = { 10,100,85,555};
		 int length = arr.length;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestno) {
				secondlargestNo = largestno;
				largestno = arr[i];
			} else if (arr[i] > secondlargestNo) {
				secondlargestNo = arr[i];
			}
			

		}
		System.out.println("Largest no is::::"+largestno);
		System.out.println("Second largest number is ::"+secondlargestNo);

	}

}
