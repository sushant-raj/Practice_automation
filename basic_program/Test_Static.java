package basic_program;

public class Test_Static {

	static int i = 29;
	short sh;
	 
	Test_Static( int i)
	{
		System.out.println("Hi I am default constructor ");
	}
	public static void m1() 
	{
	   //System.out.println(ts.sh);
	   System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		Test_Static ts = new Test_Static(2);
		System.out.println(ts.sh);
		
		
	}

}
