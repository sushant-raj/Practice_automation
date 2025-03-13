package practice_program;

public class Initializer {

    static int num = 23;

     {
        System.out.println("this is from Static initializer block");
    }
    public static void main(String[] args) {
        System.out.println("Hi, I am calling from main method");
        System.out.println(Initializer.num);
    }
}
