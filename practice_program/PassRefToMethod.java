package practice_program;

public class PassRefToMethod {

    public void m1(){

    }
    public int m2(){
        return 10;
    }
    public void m3(int n){

    }
    public int m4(int n){
        return n;
    }
    public void m5(PassRefToMethod ref1){
        System.out.println(ref1);
    }
    public PassRefToMethod m6(PassRefToMethod ref2){
        return ref2;
    }
}

class Driver{
    public static void main(String[] args) {
        PassRefToMethod ref = new PassRefToMethod();
        ref.m1();
        System.out.println(ref.m2());
        ref.m3(2);
        System.out.println(ref.m4(5));
        ref.m5(new PassRefToMethod());
        System.out.println("this is from m6 method " + ref.m6(ref));

    }
}
