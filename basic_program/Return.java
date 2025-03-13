package basic_program;

public class Return {
	
	public static String largest(int a, int b) {
		
		if(a>b) {
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
		return "Hi";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largest(4,5));
	}

}
