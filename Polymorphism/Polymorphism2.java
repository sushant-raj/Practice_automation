package Polymorphism;

import org.w3c.dom.ls.LSOutput;

interface Shape{
    public void draw();


}

class Cricle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("Drawing Traingle");
    }
}
public class Polymorphism2 {

    public static void main(String[] args) {

    }
}
