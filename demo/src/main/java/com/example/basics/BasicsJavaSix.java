package com.example.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicsJavaSix {
	
	public static void main(String[] args) {
		
		// stream API --> stream is interface. we can use stream only once
		// stream give us lot of methods to work with -> main benefit
		
		
		List<Integer> nums = Arrays.asList(1, 4, 6, 7, 9, 10);
		
		//nums.forEach(a -> System.out.println("a multiply by 5 is -->" + a*5)); we need to comment this since we can use nums only once
		
		Stream<Integer> s1 = nums.stream();
		//s1.forEach(a -> System.out.println(a)); 	we need to comment this since we can use s1 only once
		
		Stream<Integer> s2 = s1.filter( b -> b%2==0 );
		//s2.forEach(a -> System.out.println(a));		we need to comment this since we can use s2 only once
		
		Stream<Integer> s3 = s2.map( b -> b * 3 );
		s3.forEach(a -> System.out.println("s3 is --" + a));
		
		
		// below is main code for stream --> 
		
		List<Integer> nums2 = Arrays.asList(1, 4, 6, 7, 9, 10);
		
		List<Integer> nums3 = nums2.stream()
								  .filter(a -> a%2==0)
								  .map(a -> a*2)
								  .filter(a -> a>10)
								  .map(a -> a*3)
								  .toList();
		nums3.forEach(a -> System.out.println("nums3 is --" + a));
		
		
	}
	

}
