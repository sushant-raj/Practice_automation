package practice_program;

import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args) {
        System.out.print("Please enter the number to find Even or Odd: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is even number");
        }
        else{
            System.out.println(n + " is odd number");
        }
    }
}
