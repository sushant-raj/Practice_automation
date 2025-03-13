package practice_program;

class Extend{
    String name;
    public void meth(){
        System.out.println("Hi...");
    }
    Extend(String name){
        this.name = name;
    }
}

public class DemoInheri {
    public static void main(String[] args) {
        DemoInheri di = new DemoInheri();
        Extend e = new Extend("Sushant");
        e.meth();
        System.out.println(e.name);

    }
}

