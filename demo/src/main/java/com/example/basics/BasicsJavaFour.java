package com.example.basics;

public class BasicsJavaFour {
	
	public static void main(String[] args) {
		
		// thread is smallest unit of a process eg main thread
		// thread class has methods such as run(), start() (creates a new thread and it runs run() method), sleep()
		// runnable interface has methods such as run(), but it does not have start()
		// in below example -> there will be 4 threads -> main, A, B, C -> parallel execution
		// cpu scheduler executes 4 threads in parallel now 
		
		A o1 = new A(); 
		B o2 = new B(); 
		
		o1.setPriority(10); 		// we can set priority of 1 to 10 to threads
		o2.setPriority(2);
		
		o1.start();					// since Class A extends thread class so we can use directly start() function
		o2.start();					// since Class B extends thread class so we can use directly start() function
		
		C o3 = new C();					// since Class c dont extends thread class so we cannot use directly start() function
		Thread t1 = new Thread(o3);		// so in order to start o3 we use Thread first and then pass o3 to this thread
		t1.start();
		
		System.out.println("result from main ()");
		
		D o4 = new D();
		Thread t2 = new Thread(o4);
		t2.start();
		
	}

}

class A extends Thread {
	
	public void run() {
		for (int i =0; i<=50; i++) {
			System.out.println("result A");
			try {
				Thread.sleep(100); // we used this for sleep, so A will sleep and B will run in meanwhile time, bcoz we use sleep thats why we need try catch block also 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class B extends Thread {
	
	public void run() {
		for (int i =0; i<=50; i++) {
			System.out.println("result B");
		}
	}
	
}

class C implements Runnable {
	
	// Runnable interface dont has any start() function
	public void run() {
		for (int i =0; i<=50; i++) {
			System.out.println("result C");
		}
	}
	
}

class D extends A implements Runnable {
	
	// Runnable interface dont has any start() function
	public void run() {
		for (int i =0; i<=50; i++) {
			System.out.println("result D");
		}
	}
	
}

