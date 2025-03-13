package practice_program;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the value to print the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
}
