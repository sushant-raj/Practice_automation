package practice_program;

public class FactoryMethod {
    public static void m1(){
        System.out.println(new FactoryMethod());
    }

    public static FactoryMethod m2(){
        return new FactoryMethod();
    }
}

class Driver3{
    public static void main(String[] args) {
        FactoryMethod.m1();
        System.out.println(FactoryMethod.m2());

    }
}