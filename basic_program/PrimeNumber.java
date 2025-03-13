package basic_program;

public class PrimeNumber {

    public static int isPrime(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,7,9,33,11,44,37};
        for(int i=0; i<arr.length;i++){
            if(isPrime(arr[i])==2){
                System.out.println("Prime");
            }
        }

    }
}
