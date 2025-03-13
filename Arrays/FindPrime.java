package Arrays;

public class FindPrime {
    public static void main(String[] args) {
        int[] a ={7,8,3,5,6,9};

        for(int i = 0; i<a.length; i++){
            int count = 0;
            for(int j=1; j<=a[i]; j++){
                if(a[i]%j ==0){
                    count++;

                }
            }
            if(count == 2){
                System.out.println(a[i]);
            }

        }

    }
}
