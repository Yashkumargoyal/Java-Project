package com.example.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicsJavaThree {
	
	public static void main(String[] args) {
		
		// error -> compile time, logical error (wrong output), run time 
		// exceptions --> checked (compiler forces us to handle like IO exception) vs unchecked (compiler dont cares)
		// throw (used to do manually) vs throws (function handles this)
		
		int a = 2; 	int b = 2; int c = 0; 		
		try {
			
			int result = a/b;
			if(result ==1) {
				throw new ArithmeticException();   // here we throw an exception manually 
			}
			System.out.println("result ->" + result);
			
		} 
		catch(ArithmeticException E) {
			
			System.out.println("We are inside ArithmeticException catch block ->" + E);
			
		} 
		catch(ArrayIndexOutOfBoundsException E) {
			
			System.out.println("We are inside ArrayIndexOutOfBoundsException catch block ->" + E);
			
		} 
		catch(Exception E) {
			
			System.out.println("We are inside Exception catch block ->" + E);
			
		} 
		finally {    
			
			// will be runned in both the cases that if exception is there or not
			System.out.println("We are inside finally block");
			
		}
		
		System.out.println("We are outside now");
		
		
		// Collections --> it has List interface and Set interface
		
		// 1. ArrayList -> has sequence to follow so has indexing so can use get() function
		
		ArrayList aList = new ArrayList();			// its dynamic array so no need to give any size to this now 
		aList.add(4);								// ArrayList is implementation of Collections
		aList.add("Hello");
		aList.add(1.000);
		System.out.println(aList);
		
		// Generics means <> and its used to give some type to array list
		
		ArrayList<Integer> aListInt = new ArrayList();	
		aListInt.add(411);
		aListInt.add(412);
		aListInt.add(413);
		aListInt.add(411);
		System.out.println(aListInt);
		
		ArrayList<Integer> aListInt2 = new ArrayList<Integer>();	
		aListInt2.add(41421);
		aListInt.add(411);
		aListInt.add(412);
		System.out.println(aListInt2);
		
		List<Integer> aListInt3 = new ArrayList<>();	
		aListInt3.add(643);
		aListInt.add(411);
		aListInt.add(412);
		aListInt.add(414);
		System.out.println(aListInt3);
		
		
		// 2. HashSet can only have unique values, and also dont follow any sequence
		
		HashSet<Integer> aHashset = new HashSet<>();
		aHashset.add(100); 
		aHashset.add(200); 
		aHashset.add(100);				// its repeated so dont get inserted into HashSet
		System.out.println(aHashset);
		
		Set<Integer> aHashset2 = new HashSet<>();
		aHashset2.add(700); 
		aHashset2.add(300); 
		aHashset2.add(300);				// its repeated so dont get inserted into HashSet
		System.out.println(aHashset2);
		
		
		// 3. Hashmap -> has key value pair --> key has to be unique as key is like Set
		
		Map<Integer, String> aHashmap = new HashMap();
		aHashmap.put(2, "Two");
		aHashmap.put(3, "Three");
		aHashmap.put(4, "Four");
		aHashmap.put(3, "Three New");
		System.out.println(aHashmap);
		System.out.println("see example ->" + aHashmap.get(3));
		
		
	}

}
