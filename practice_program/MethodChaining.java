package practice_program;


import com.sun.jdi.Method;

public class MethodChaining {
    public MethodChaining m1(){
        return this;
    }
    public MethodChaining m2(){
        return this;
    }
    MethodChaining m3(){
        return this;
    }

    public static void main(String[] args) {
        MethodChaining mref = new MethodChaining();
        System.out.println(mref.m1().m2().m3());

    }
}
