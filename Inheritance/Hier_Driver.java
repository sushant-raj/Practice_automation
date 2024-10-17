package Inheritance;

public class Hier_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("<<<<Apple>>>>");
		
		Hier_Apple apple = new Hier_Apple(15, "Kashmir", 350);
		System.out.println("Quantity of the apple is :" + apple.quantity);
		System.out.println("Type of the apple is :" + apple.type);
		System.out.println("Price of the apple is :" + apple.price);
		
		System.err.println("<<<<Mango>>>>");
		
		Hier_Mango mango = new Hier_Mango(50, "Orange", 900);
		System.out.println("Quantity of the mango is :" + mango.quantity);
		System.out.println("Color of the mango is :" + mango.color);
		System.out.println("Price of the amango is :" + mango.price);
		
		System.err.println("<<<<Pears>>>>");
		
		Hier_Pears pears = new Hier_Pears(25, "Large", 500);
		System.out.println("Quantity of the mango is :" + mango.quantity);
		System.out.println("Color of the mango is :" + mango.color);
		System.out.println("Price of the amango is :" + mango.price);
	}

}
