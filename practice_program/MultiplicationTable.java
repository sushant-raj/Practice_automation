package practice_program;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Please enter the value to print the multiplication table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}
