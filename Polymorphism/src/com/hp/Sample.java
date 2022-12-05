package com.hp;
//Method Overloading

public class Sample {
     
	void demo(int a,int b) {
		
		System.out.println("Addition is :- "+(a+b));
	}
	
	void demo(double a,double b) {
		System.out.println("Subtraction is :-"+(a-b));
	}
	void demo(int a,int b,int c) {
		System.out.println("Addition is :-"+(a+b+c));
	}
	void demo(int a,double b) {
		System.out.println("Multiplication is :-"+(a*b));
		
	}
	
}
