package Inheritance;

public class Hier_Mango extends Hier_Fruits {
	
	int quantity;
	String color;
	Hier_Mango(int quantity, String color, int price)
	{
		super(price);
		this.quantity = quantity;
		this.color = color;
		
	}

}
