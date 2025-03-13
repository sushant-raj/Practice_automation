package practice_program;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.print("Please enter the value to n to add the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum of number is: " + sum);
    }
}
