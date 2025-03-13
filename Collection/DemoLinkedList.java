package Collection;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("Adding object into linkedlist...");
        ll.add("Hi");
        ll.add("My ID");
        ll.add("Is");
        ll.add(2171);

        System.out.println(ll);
        for(Object ref : ll){
            System.out.println(ref);
        }

        System.out.println("Using addAll method to add object in diff linked list ");

        LinkedList ll1 = new LinkedList();
        ll1.addAll(ll);
        System.out.println(ll1);

        System.out.println("Using remove method to remove the object from the list");
        ll.remove(1); // passing index to remove the object
        System.out.println(ll);

        ll.remove((Object) 2171); // Using Object type to remove the object
        System.out.println(ll);

        ll.clear(); // to remove all object at a time
        System.out.println("Removing all object");
        System.out.println(ll);

        System.out.println("Searching object by using contains method");
        System.out.println(ll1.contains(2171)); // return type is boolean for contains method

        System.out.println("Searching object by using containsAll method");
        System.out.println(ll1.containsAll(ll)); // to check all object contains in collection





    }
}
