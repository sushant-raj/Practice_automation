package Exception;

class Finalize{
    int n = 10;
    public void finalize(){
        System.out.println("Hello Hi...");
    }
}

public class FinalizeMethod{
    public static void main(String[] args) {
        Finalize f = new Finalize();
        System.out.println(f.n);
       // f.finalize();
        f=null;
        System.gc();
       // System.out.println(f.n);
    }

}