package com.nil.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatingCharacter {
	public static void main(String[] args) {
		String s= "abcaaaacbs";
		String[] split = s.split("");
		char[] charArray = s.toCharArray();
	// Arrays.stream(charArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<String, Long> myMap = Stream.of(split).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 // Find the maximum entry based on the value
        Optional<Entry<String, Long>> maxEntry = myMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            Entry<String, Long> entry = maxEntry.get();
            String maxKey = entry.getKey();
            Long maxValue = entry.getValue();
            System.out.println("Max Key: " + maxKey);
            System.out.println("Max Value: " + maxValue);
        } else {
            System.out.println("The map is empty.");
        }
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(int i=0;split.length>=i;i++) {
			if (hashMap.containsKey(i)) {
				
				
				
			}
		}
		
		
		
		
	}

}
