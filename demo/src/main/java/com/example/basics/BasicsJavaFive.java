package com.example.basics;

public class BasicsJavaFive {
	
	public static void main(String[] args) {
		
		// every constructor is java has -> super() function -> it first calls constructor of the super class. 
		// eg Class A extends B -> so  constructor of B will be called. super() vs super(n) -> default vs parameterized constructor of super class can be called
		// every java class extends Object class
		// this() function -> executes constructor of the same class
		
		// wrapper class we have for each primitive data type (int, char, double)
		// wrapper class used if its required to deal with class at some point of time 
		// Auto Boxing --> storing primitive data type into wrapper class object
		
		int num = 7 ; 
		Integer num1 = num;		// Auto Boxing as we dont do it manually , we do it directly
		
		System.out.println("num1 is ->" + num1);
		
		int num2 = num1.intValue(); 	// case 1 -> unboxing as we do it manually , we dont do it directly
		
		num2 = num1; 			// case 2 -> Auto unboxing as we dont do it manually , we do it directly
		
		System.out.println("num2 is ->" + num2);
		
		String s = "14"; 
		int num3 = Integer.parseInt(s);
		System.out.println("num3 is ->" + num3);
		
		// enumeration --> enum -> used for named constants, used if constants are needed to be used
		// we use enum more with switch case, since we are dealing with constants
		
		Status st = Status.running;						Status st1 = Status.pending;
		System.out.println("st is ->" + st);			System.out.println("st1 is ->" + st1);
		System.out.println("st1 order is ->" + st1.ordinal());		// used for getting the order or index number
		
		Status stAll[] = Status.values();
		System.out.println("stAll is ->" + stAll);
		for(Status s4: stAll) {
			System.out.println(s4);
		}
		
		// functional interface --> SAM --> single abstract method interface -> can use lambda expression
		// case 1 -> we can use anonymous inner class to implement the interface intfA, intfB
		// case 2 -> we can implement the interface by implementing one more class to it
		// case 3 -> we can can use lambda expression  (->) --> code length gets reduced now
		
		
		intfA o1 = new intfA() {			// anonymous inner class starts 
				public void show(int a, String s8) {
					System.out.println("inside show() part 1");
				}
		};									// anonymous inner class ends
		o1.show(11, "Test - Abc");
		
		
		intfA o2 = (i, s12) -> {
				System.out.println("inside show() part 2");
		};									
		o2.show(14, "Test - Abcde");
		
		
		intfA o3 = (int i, String s12) -> {
			System.out.println("inside show() part 3");
		};									
		o3.show(14, "Test - Abcdefg");
		
		
		intfB o4 = new intfB() {
			public int add (int a, int b) {
				return a+b;
			}
		};
		int result4 = o4.add(2, 2);				System.out.println("result4 is -->" + result4);
		
		
		intfB o5 = (int x, int y) -> {
			return x+y;
		};
		int result5 = o5.add(20, 200);			System.out.println("result5 is -->" + result5);
		
		
		intfB o6 = (x, y) -> {
			return x+y;
		};
		int result6 = o6.add(202, 2002);		System.out.println("result6 is -->" + result6);
		
	}

}

enum Status { 		// its like a Class in java
	running, failed, success, pending		// all these are objects, these are named constants. these have order also -> 0, 1, 2, 3
}

@FunctionalInterface
interface intfA {
	void show(int i, String s5);
}

@FunctionalInterface
interface intfB {
	int add(int i, int j);
}

class TestingC implements intfA, intfB {
	public int add(int i, int j) {
		return i + j;
	}
	public void show(int i, String s5) {
	}
}
