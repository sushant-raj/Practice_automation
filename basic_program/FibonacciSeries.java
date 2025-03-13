package basic_program;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        int firstNum=0;
        int secNum=1;
        int thirdNum;
        System.out.println(firstNum);
        System.out.println(secNum);
        for(int i = 1; i<=num; i++){
            thirdNum = firstNum + secNum;
            System.out.println(thirdNum);
            firstNum = secNum;
            secNum = thirdNum;
        }
    }

}
