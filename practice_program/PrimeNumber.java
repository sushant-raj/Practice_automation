package practice_program;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Prime enter the value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 and " + n );

        for(int i = 1; i<=n; i++){
            int count = 0;
            for(int j = 1; j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i + " is prime number");
            }
            else{
                System.out.println(i + " is not a prime number");
            }
        }
    }
}
