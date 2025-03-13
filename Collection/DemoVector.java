package Collection;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector<>();

        v1.add(23);
        v1.add("Hello");
        v1.add('a');

        v.addAll(v1);
        System.out.println(v);

       // v.removeAll(v1); //removing object from v (whatever object present in v1 those only will remove from v)
        v.add(5);
        v.add("Java");
        System.out.println(v);
        System.out.println(v1);

       /* System.out.println(v1);
        for(Object Obj : v){
            System.out.println(Obj);
        }*/

    }
}
