package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] [] a = new int[2][2];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.println("Please enter element to add into array: " + i + "th row" + i);
                a[i][j]=sc.nextInt();
            }
        }
        //To access the element from the array
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
