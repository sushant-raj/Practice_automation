package String;

import java.util.Scanner;

public class CharMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        String name = "Sushant";
        int s = name.charAt(4);
        System.out.println(s);
        System.out.println(name.replace("Sush", "Pras"));
        for(int i = 0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
        System.out.println(word.codePointAt(2));
    }
}
