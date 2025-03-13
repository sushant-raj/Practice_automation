package practice_program;

import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {
        System.out.print("Please enter the value of n to find sum of prime: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            boolean isPrime = true;
            for(int j = 2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
                sum = sum + i;
                System.out.println();
            }
        }

        System.out.println("Sum of prime number is: " + sum);

    }
}
