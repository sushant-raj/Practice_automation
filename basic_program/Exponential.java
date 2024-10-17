package basic_program;
import java.util.Scanner;

public class Exponential {
	public void exp(int base,int power) {
		int res=1;
		for(int i = 1; i<=power; i++)
		{
			res = res*base;
			
		}
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the base value...");
		int base = sc.nextInt();
		System.out.println("Please enter the value of power...");
		int power = sc.nextInt();
		Exponential e=new Exponential();
		e.exp(base, power);
		
		
		
	}
}
