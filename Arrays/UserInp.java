package Arrays;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class UserInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] addName = new String[5];
        int[] a={10,2,55,7};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);


    }
}
