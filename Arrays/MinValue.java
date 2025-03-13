package Arrays;

public class MinValue {
    public static void main(String[] args) {
        int arr[] = {5,1,6,8,0,4,9};
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Finding minimum element...");
        System.out.println(min);
    }
}
