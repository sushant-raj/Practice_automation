package Arrays;
import java.util.Scanner;

public class PrimeNum {

		static int num = 34;
		static int count = 0;
		public static void findPrime(){
			for(int i=1; i<=num; i++){
				if(num%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.println("It's a prime number");
			}
			else{
				System.out.println("It's not a prime");
			}
		}
	    public static void main(String[] args) {
			findPrime();
	}
}
