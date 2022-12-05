package com.hp;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("First Scenario");
		Parent pa = new Parent();
		System.out.println(pa.a);
		System.out.println(pa.b);

		System.out.println("second scenario");
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		System.out.println(ch.c);

		ch.display1();
		ch.display2();
		ch.display3();

	}
}