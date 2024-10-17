package Inheritance;

public class StatA {
	static
	{
		System.out.println("I am a static block from class StatA");
	}

	static String name = "Sushant";
	static int age = 29;
	
	static void m1() {
		System.out.println("Hi I am method");
	}
	
	static
	{
		System.out.println("I am another static block from class StatA");
	}
	
}
