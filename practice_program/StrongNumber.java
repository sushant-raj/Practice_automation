package practice_program;

import java.util.Scanner;

public class StrongNumber {
    public static int fact(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to find the Strong number: ");
        int num = sc.nextInt();
        int org = num;
        int sum = 0;
        while(num!=0){
            int n = num%10;
            sum = sum+fact(n);
            num = num /10;
        }
        if(org==sum){
            System.out.println(org + " is a Strong number");
        }
        else{
            System.out.println(org + " is not a Strong number");
        }


    }
}
