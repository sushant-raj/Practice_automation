package practice_program;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Please enter a value to find the number is perfect number or not: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add=0;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                add = add + i;
            }
        }
        if(add==n){
            System.out.println(n + " is a perfect number");
        }
        else{
            System.out.println(n + " is not a perfect number");
        }
    }
}
