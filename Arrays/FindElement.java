package Arrays;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of an array");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Please add the element");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            }
        for(int j=1; j<arr.length; j++)
        {
            System.out.println("Here is added array element "+arr[j]);
        }
        boolean res = false;
       System.out.println("Please enter the number to check it exist or not");
        int checkNum = sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(checkNum==arr[j]){
                res = true;
            }
        }
        System.out.println(res);
        }
    }