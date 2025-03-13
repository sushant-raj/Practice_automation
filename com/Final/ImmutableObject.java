package com.Final;

public class ImmutableObject {
	final String name;
	final int age;
	ImmutableObject(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	
	
	
	public static void main(String[] args) {
		ImmutableObject m=new ImmutableObject("Sai",22);
		System.out.println(m.age);
		System.out.println(m.name);
		// m.name="Hello";
		
		
		ImmutableObject m1=new ImmutableObject("somu",23);
		System.out.println(m1.age);
		System.out.println(m1.name);
		// m1.name="Hello";
		
	}

}
