package com.Final;

class Parent123
{
	final public static void m1()
	{
		System.out.println("This is method shadowing");
	}

	final public void m2()
	{
		System.out.println("This method overriding");
	}
	
}
public class finalMethod extends Parent123{

	/*
	 * public static void m1() {
	 * 
	 * }
	 * 
	 * public void m2() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		
		
		m1();
		Parent123 p = new Parent123();
		p.m2();
		

	}

}
