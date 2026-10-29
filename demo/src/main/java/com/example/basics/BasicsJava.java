package com.example.basics;

public class BasicsJava {
	
	public static void main(String[] args) {
		
		System.out.println("Before ..");
		show();
		show("its example of polymorphism ..");
		
		// relational operators --> less than, more than, etc 
		// logical operators --> and, or, not, etc 
		// conditional statements --> if, else if, else, etc
		
		// ternary operator --> condition ? case1 : case2; -->
		int a = 20;  int b = 30;  int c = a>b ? a : b;
		System.out.println("value of c is .." + c);
		
		// role of JVM --> we give it a class, it give us an object.
		// 3 types of variables --> local (stays with a function) vs instance (stays with an object) vs reference.
		// to make a variable constant --> use final keyword.
		// THIS keyword represents the current object in Java.
		
		// encapsulation --> we cant access variables in direct way so we use getters and setters.
		// inheritance --> see example of --> class LatestKeyboard extends Keyboard.
		// polymorphism --> compile time vs run time
		// abstraction --> focus on what works ? not on how that works --> abstract class vs interface
		
		// in JVM --> there is heap memory and stack memory 
		// heap memory stores object, object's variables (instance variable), object's functions
		// stack memory stores function, function's variables (local variable), function's functions
		// JVM is compiler so it converts .java into .class file, eg. in present case-> 1 .java file has 4 .class files
		// .class file is in bytecode and this bytecode is runned by JVM, so java/JVM is platform independent 
		// java is WORA --> write once run anywhere 
		
		// static variable and functions dont need objects to be made for calling them at run time
		
		// data types in java -> 2 types -> 1. Primitive types (byte, short, int, long, float, double, char, and boolean.) vs 
		// 2. Reference types -> Classes, arrays, interfaces, enums, and other reference types, including String
		
		// What is the difference between == and equals()? --> 
		// == checks whether two references point to the same object.
		// equals() checks logical equality when the class implements it appropriately.
		
		
		Keyboard kb = new Keyboard();
		kb.colour = "test do now from class of Keyboard..";
		kb.checkPrint();
		kb.checkValues();
		
		LatestKeyboard advBb = new LatestKeyboard();
		advBb.colour = "test do now from class of LatestKeyboard..";
		advBb.checkPrint();
		advBb.checkValues();
		
		// below case is confusing that which class's object will be made now ? so see class on right side 
		Keyboard advBb2 = new LatestKeyboard();   
		advBb2.colour = "test do now from class of LatestKeyboard..";
		advBb2.checkPrint();
		advBb2.checkValues();
		
	}
	
	public static void show() {
		System.out.println("Inside function of show() ..");
	}
	
	public static void show(String value) {					// this is method overloading --> compile time polymorphism
		System.out.println("Inside function of show() .." + value);
	}

}

class Keyboard {
	
	final int keys = 10; 
	String colour; 
	
	public void checkPrint() {
		System.out.println("Inside function of checkPrint() of class Keyboard now ..");
	}
	
	public void checkValues() {
		System.out.println("Inside function of checkValues() .." + " keys -> " + keys + " colour -> " + colour);
	}
	
}

class LatestKeyboard extends Keyboard{
	
	// Java has multi level inheritance. 
	
	public void checkPrint() {		// this is method overriding --> run time polymorphism
		System.out.println("Inside function of checkPrint() of class LatestKeyboard now ..");
	}
	
}

class Mouse{
	
	int button; 
	
	// constructor assign values to variables at run time . Below is not parameterized constructor
	
	public Mouse() {
		button = 122;
	}
	
}
