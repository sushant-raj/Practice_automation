package Constructor_Program;

public class ConstChaining {

	int a;
	ConstChaining()
	{
		this("Java");
		System.out.println("No argument constructor");
	}
	ConstChaining(int a)
	{
		this();
		this.a = a;
		System.out.println("integer argument constructor");
		
	}

	ConstChaining(String name)
	{
		
		System.out.println("Parameterised constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstChaining ref = new ConstChaining(20);
		System.out.println(ref.a);
	}

}
