package practice_program;

import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        System.out.print("Please enter to number to check is prime or not: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " is not a prime");
        }

    }
}
