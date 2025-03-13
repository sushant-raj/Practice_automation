package basic_program;

public class ExpCal {
    public static void main(String[] args) {
        int base = 6;
        int power =2;
        int res = 1;
        for(int i=1; i<= power; i++){
             res = res*base;
        }
        System.out.print(res);
    }
}
