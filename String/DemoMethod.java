package String;

public class DemoMethod {
    String name;
    int age;
    DemoMethod(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }
    public int hashCode(){
        return age;
    }
    public boolean equals(Object o){
        DemoMethod d = (DemoMethod)o;
       return this.name == d.name && this.age == d.age;
    }

    public String toString(){
        return "name: " + name + "\n" + "age: " +  age;
    }


    public static void main(String[] args) {

        DemoMethod dm = new DemoMethod("Sushant", 28);
        DemoMethod dm1 = new DemoMethod("Peter", 32);
        System.out.println(dm.equals(dm1));
        System.out.println(dm.hashCode());
        System.out.println(dm.toString());

        String s1 = new String("Java");
        String s2 = new String("java");
        System.out.println(s1.toString());
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s2));
    }
}
