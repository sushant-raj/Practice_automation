package practice_program;

import java.util.Scanner;

public class FactInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            int fact = 1;
            for(int j=1; j<=i;j++){
                fact = fact * j;
            }
            System.out.println(i + " Factorial is " + fact);
        }

    }
}
