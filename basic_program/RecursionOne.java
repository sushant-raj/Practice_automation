package basic_program;

public class RecursionOne {

	static void rec()
	{
		int i = 10;
		System.out.println("This is from recursion method");
		rec();
		if(i==10)
		{
		   
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rec();
	}

}
