package Arrays;

public class Prime2 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,8,33,44,57,11};

        for(int i=0; i<arr.length; i++){
            boolean isPrime = true;
            for(int j=2;j<arr[i]; j++){
                if(arr[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(arr[i]);
            }
        }

    }
}
