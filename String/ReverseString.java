package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String s = sc.nextLine();
        System.out.println("Length of the String is: " + s.length());
        String rev = " ";
        for(int i= s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
