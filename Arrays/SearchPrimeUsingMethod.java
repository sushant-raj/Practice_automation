package Arrays;

public class SearchPrimeUsingMethod {

    public static int isPrime(int a){
        int count = 0;
        for(int i = 1; i<=a; i++){
            if(a%i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4,36,5,3,2,7,8};
        int count1=0;
        for(int j = 0; j<arr.length; j++){
            if(isPrime(arr[j]) == 2){
                count1++;
                System.out.println(arr[j]);
            }
        }
        System.out.println("Total prime number count is :" + count1);
    }
}
