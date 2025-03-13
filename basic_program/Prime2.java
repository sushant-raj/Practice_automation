package basic_program;

public class Prime2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 12, 27, 34, 9, 15, 17};

        for(int i = 0; i < arr.length; i++) {
            Boolean isPrime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(arr[i] + " is prime");
            }

        }
    }
}

