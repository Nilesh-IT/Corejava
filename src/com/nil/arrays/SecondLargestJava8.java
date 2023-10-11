package com.nil.arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class SecondLargestJava8 {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
    	int[] arr = {10, 100, 85, 555};
       java8SecondhighestNo(arr);
        System.out.println("Enter a Numbers");
        int a = scr.nextInt();
        

        System.out.println("Array elements:");
        Arrays.stream(arr).forEach(i -> System.out.print(i + "\t"));

        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt secondMax = Arrays.stream(arr).filter(i -> i < max.getAsInt()).max();

        if (secondMax.isPresent()) {
            System.out.println("\nLargest number is: " + max.getAsInt());
            System.out.println("Second largest number is: " + secondMax.getAsInt());
        } else {
            System.out.println("\nThere is no second largest number in the array.");
        }
    }

	private static void java8SecondhighestNo(int[] arr) {
		Integer secondhighest = Arrays.stream(arr)
		.boxed()
		.distinct()
		.sorted((a,b)-> b-a )
		.limit(2)
		.findFirst()
		.orElse(-1);
		
		if (secondhighest != -1) {
			System.out.println("second highest number is: "+secondhighest);
		}else {
			System.out.println("second highest number not found ");
		}
		
	}
    
}
