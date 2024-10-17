package basic_program;

public class Non_Static_Member {

	int n = 10;
	public void m1()
	{
		int n = 20;
		Non_Static_Member nsm = new Non_Static_Member();
		System.out.println(nsm.n);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Non_Static_Member nsm = new Non_Static_Member();
		nsm.m1();
	}

}
