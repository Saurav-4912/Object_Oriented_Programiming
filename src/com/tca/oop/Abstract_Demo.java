package com.tca.oop;

abstract class A{
	//private int i = 34;;
	//private String name="AAA";
	//private double j=9.8;
	
	void f1() // Concrete method
	{
		System.out.println("f1");
	}
	
	static void show() {
		System.out.println("Static method");
	}
	

	abstract void f2(); 
	abstract void f3(); 
	
	// Abstract method - Which does not have implementation
	// a class which has one or more abstract method is known as abstract class
	// Abstract does not final , static 
	// In abstract method we have static method then we can call using class name like A.show();
	// We can declare abstract class without any abstract method
 }
class B extends A{
	void f2() {
		System.out.println("f2");
	}
	void f3() {
		System.out.println("f3");
	}
	
	void f4() {
		System.out.println("f4");
	}
}


public class Abstract_Demo {

	public static void main(String[] args) {
		
		// A ob = new A(); // We can not instatiante or Object (Error)
		
		B ob = new B();
		ob.f1();
		ob.f2();
		ob.f3();
		ob.f4();
		
		A ob1 = new B();
		ob1.f1();
		ob1.f2();
		ob1.f3();
		//ob.f4(); // Error
		
		A.show();

	}

}

//Q. When we use abstract class
// 
