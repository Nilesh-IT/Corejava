package com.nil.arrays;

public class NullReference {
	public static void main(String[] args) {
		NullReference ref=null;
		String var=ref.welcome();
		System.out.println(var);
	}
	public static String  welcome() {
		return "return welcome";
	}

}
