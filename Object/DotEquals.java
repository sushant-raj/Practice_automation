package Object;

public class DotEquals {

    String name;
    int age;

    DotEquals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        DotEquals de = (DotEquals) obj;
        return this.name == de.name && this.age== de.age;
    }

    public static void main(String[] args) {
        DotEquals ref1 = new DotEquals("James", 32);
        DotEquals ref2 = new DotEquals("James", 32);

        System.out.println(ref1 == ref2);
        System.out.println(ref1.equals(ref2));
    }
}
