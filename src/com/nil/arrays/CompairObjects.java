package com.nil.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int no;

	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	@Override
	public int compareTo(Student o) {
	/*	if (this.no <= o.no) {
			return -1;
		}else if (this.no >= o.no) {
			return 23;
			
		}else {
		  return 0;
		}  */
		
		return this.no <= o.no? -1 : ( this.no >= o.no ? 1: 0) ;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}

}

public class CompairObjects {
	public static void main(String[] args) {
		List<Student> asList = Arrays.asList(new Student("A", 1), new Student("G", 5), new Student("D", 4),
				new Student("z", 26));
		System.out.println("BEFORE:" + asList);
		Collections.sort(asList
				);
		System.out.println("AFTER:" + asList);
	}

}
