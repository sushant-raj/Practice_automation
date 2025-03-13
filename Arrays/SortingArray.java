package Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int temp =0;
        int[] arr ={3,2,6,7,9,5,1,0,8};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
