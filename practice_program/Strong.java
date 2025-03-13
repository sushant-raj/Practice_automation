package practice_program;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to find a Strong number");
        int num  = sc.nextInt();
        int n = num%10;
        int addFact = 0;

        while(n>0){
            int fact = 1;
            for(int i = n; i>0; i--){
                fact = fact * i;
            }
            System.out.println(fact);
            addFact = addFact + fact;
            System.out.println(addFact);
        }


    }
}
