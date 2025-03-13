package practice_program;

import java.util.Scanner;

public class PerfectNumInRange {
    public static void main(String[] args) {
        System.out.print("Please enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            int add = 1;
            for(int j= 2; j<=i/2; j++){
                if(i%j==0) {
                    add = add + j;
                }
            }
            if(add == i){
                System.out.println(i);
            }
        }

    }
}

