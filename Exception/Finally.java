package Exception;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of n: ");

        try{
            int n = sc.nextInt();
            System.out.println(n/0);

        }
        catch (Exception e){
            System.out.println("Exception handled");
        }
        finally {
            sc.close();
            System.out.println("This will always execute");
        }
        System.out.println("Trying to reuse the scanner after closing");
        int n = sc.nextInt();
        System.out.println("Printing after closing the activity");


    }
}
