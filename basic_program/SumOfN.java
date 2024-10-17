package basic_program;
import java.util.Scanner;


public class SumOfN {
    
	static int sum(int n) 
	{
		return n = (n-1)+n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of n to get the sum of it ");
		int n = sc.nextInt();
		System.out.println(sum(n));
		
	}

}
