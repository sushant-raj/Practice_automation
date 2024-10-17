package basic_program;

public class Recursion {

	public static void m1()
	{
		System.out.println("Bye");
		m2();
		
	}
	
	public static void m2()
	{
		System.out.println("hi");
		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      m2();
	}

}
