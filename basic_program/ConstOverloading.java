package basic_program;

public class ConstOverloading {
	
	ConstOverloading (int a, int b, int c)
	
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
	

ConstOverloading (int a, int b)
	
	{
		System.out.println(a);
		System.out.println(b);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ConstOverloading(10,20,30);
	new ConstOverloading(40,50);
	}

}
