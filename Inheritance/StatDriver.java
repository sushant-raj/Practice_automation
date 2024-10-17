package Inheritance;

public class StatDriver {

	static
	{
		System.out.println("I am a static block from class StatDriver class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StatB.name);
		System.out.println(StatB.age);
		StatB.m1();
		
	}

}
