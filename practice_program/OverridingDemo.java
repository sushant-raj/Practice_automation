package practice_program;

public class OverridingDemo {
        int a = 1;
    public  static void m123(){
        System.out.println("Static");
    }
    
    public  void m123(int a){

    }

    public static void main(String[] args) {
        OverridingDemo obj = new OverridingDemo();
        obj.m123(23);
    }

}
