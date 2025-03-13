package practice_program;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        System.out.print("Please enter the value of n to print the reverse number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            System.out.println(i);
        }

    }
}
