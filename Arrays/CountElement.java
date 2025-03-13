package Arrays;

public class CountElement {
    int count =0;
    int[] arr = {3,2,5,6,67,7,9,0,1};

    public int countNo(){

        for(int i=0; i< arr.length; i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountElement countEle = new CountElement();
        System.out.println(countEle.countNo());
    }
}
