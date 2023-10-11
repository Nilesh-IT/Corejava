package com.nil.arrays.findduplicate;

import java.util.HashMap;

import lombok.Data;

@Data
public class FindDuplicateWithArray {
	 private Integer a=10;

	public static void main(String[] args) {

        //create integer array with duplicate element 
		int  arrayWithDuplicate[] ={85,45,85,85,10,20,10,45,45}; 

		//create HashMap having integer type key and value
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();

		//use for loop to pull the elements of array to hashmap's key   
		for (int j = 0; j < arrayWithDuplicate.length; j++) {   
            hm.put(arrayWithDuplicate[j],j);   
        }   

       // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
        System.out.println(hm.keySet());  
		
	}

}
