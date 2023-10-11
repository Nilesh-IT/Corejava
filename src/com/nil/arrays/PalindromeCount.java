package com.nil.arrays;

import java.util.Scanner;

public class PalindromeCount {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String input = scr.nextLine();

        int count = countPalindromes(input);
        System.out.println("Number of palindromes: " + count);
    }

    public static int countPalindromes(String input) {
        int count = 0;

        // Check each substring as potential palindrome
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

