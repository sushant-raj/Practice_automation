package Arrays;

import java.util.Scanner;

public class MaxValue {

    Scanner sc = new Scanner(System.in);
    public void findMax(){
        System.out.println("Please enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = arr[0];
        System.out.println("Please add element in array");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }

        }
        System.out.println("Max value of an array is " + max);

         for(int j = 0; j<arr.length; j++){
                System.out.println("Element added :" + arr[j]);
            }

    }

    public static void main(String[] args) {
        MaxValue max = new MaxValue();
        max.findMax();



        }

    }

