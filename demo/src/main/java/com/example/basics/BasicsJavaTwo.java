package com.example.basics;

public class BasicsJavaTwo {
	
	public static void main(String[] args) {
		
		// string pool -> as string is immutable. so string dont change		// string buffer -> these can change
		String s1 = new String();
		String s2 = "Example";			// this is shortcut to use string 
		StringBuffer s3 = new StringBuffer("hfakjfda");
		s3.append("nafk");
		
		// arrays concept ->
		int num[] = {1,3,5};
		int num2[] = new int[4]; 		num2[0] = 5;		num2[1] = 7;		num2[2] = 9;
		for(int n : num2) {
			System.out.println("value of n ->" + n);
		}
		
		// see Object class (it has .toString() ) -> every class in java inherits Object class
		Student st = new Student(1, "Rajat"); 			// we pass parameters since constructor has parameters also
		System.out.println(st.toString());		// we get Student@7ad041f3 previously in logs -> its hashcode in Hex format
		
		// array of instances/objects --> 
		Student stu[] = new Student[2];
		stu[0] = new Student(3, "Yash");
		stu[1] = new Student(5, "Laxmi");
		for(Student sttt : stu) {
			System.out.println(sttt);
		}
		
		// packaging --> WAR or JAR file 		// access modifier --> public, private, default, protected
		// final keyword methods stops overriding.
		// final keyword class stops inheritance, so such classes cant be inherited 
		
		// abstraction is like an upper layer 
		
	}	

}

class Student{
	
	int rollNo;
	String name;
	
	// when we call an object of a class, it by default calls function of .toString() of Object class
	// so override it in base class as shown below -->
	
	@Override
	public String toString() {
		return "Student's roll No is ->" + rollNo + ", and name is ->" + name + "..";
	}

	public Student(int rollNo, String name) {
		//super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	
}

abstract class Computer {
	
	// we cant create an object of an abstract class. it can have both abstract and non-abstract methods inside it
	// The abstract method can only be defined inside an abstract class and interface
	
	abstract public void code();
	
	public void show() {
		System.out.println("inside abstract class Computer");
	}
	
}

class Laptop extends Computer{
	
	public void code() {
		System.out.println("inside Laptop class and code function");
	}
	
}

class Desktop extends Computer{
	
	// class Desktop must implement the inherited abstract method code() of Computer class
	
	public void code() {			
		System.out.println("inside Desktop class and code fundtion");
	}
	
}

interface ComputerIntf{
	
	// it can have only abstract methods inside it now, so all methods are --> abstract and public --> by default case
	abstract public void code1();
	
	// The final field price must be initialized, variables in an interface are FINAL by default 
	int price = 30000;
	
	// but we can have default methods also now as new features added in Java 8, and default methods can have body as well
	default void codeNew() {
		System.out.println("inside ComputerIntf interface and codeNew function");
	}
}

interface ComputerIntf2{
	
	// it can have only abstract methods inside it now, so all methods are --> abstract and public
   void code2();
	
}

class Laptop1 implements ComputerIntf,ComputerIntf2 {
	
	// class Laptop1 must implement the inherited abstract methods code1() and code2() of ComputerIntf and ComputerIntf2 interfaces 
	
	public void code1() {
		System.out.println("inside Laptop1 class and code1 function");
	}
	
	public void code2() {
		System.out.println("inside Laptop1 class and code2 function");
	}
	
}


