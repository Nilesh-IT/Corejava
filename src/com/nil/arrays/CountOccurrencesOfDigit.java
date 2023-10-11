package com.nil.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountOccurrencesOfDigit {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// given array of integer
		int[] arr = { 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5 };
		System.out.println("please Enter vaalue to find ouucuance");
		int x = scr.nextInt();

		ArrayList<Integer> aList = new ArrayList<>();

		// add element of array to arraylist
		for (int i : arr) {
			aList.add(i);
		}

		// call occurance methos
		if (x < 6 && x > 0) {

			System.out.println(x + ": Occures " + OccuranceOfnumber(aList, x) + " Times");

		}	
	   System.out.println("nit in if");	
	}

	private static int OccuranceOfnumber(ArrayList<Integer> aList, int x) {
		int frequency = Collections.frequency(aList, x);

		return frequency;
	}

}
