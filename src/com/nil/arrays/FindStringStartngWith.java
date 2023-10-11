package com.nil.arrays;

import java.util.Arrays;


public class FindStringStartngWith {

	public static void execute(String[] strings, String searchString) {
        if (ArrayUtils.contains(strings, searchString)) {
            System.out.println("contains.");
        } else {
            System.out.println("does not contain.");
        }
    }

    public static void main(String[] args) {
        execute(new String[] { "AA","BB","CC" }, "BB");
    }
	
}
