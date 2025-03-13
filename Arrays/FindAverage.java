package Arrays;

public class FindAverage {
    public static void main(String[] args) {
        int[] arr = {2,4,6,36,78,4};
        int add = 0;
        for(int i = 0; i<arr.length; i++){
            add = add + arr[i];
        }
        System.out.println("length of any array is " + arr.length);
        System.out.println("Addition of an array is " + add);
        double avg = add / arr.length;
        System.out.printf("Average of an array is :" + avg);
    }
}
