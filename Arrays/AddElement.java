package Arrays;

public class AddElement {
    int []arr = {3,5,4,7,8,0,9};
    int count= 0;

    public void add(){
        for(int i=0; i<arr.length; i++){
            count = arr[i] + count;
        }
        System.out.println(count);

    }
    public static void main(String[] args) {

        AddElement sum = new AddElement();
        sum.add();
    }
}
