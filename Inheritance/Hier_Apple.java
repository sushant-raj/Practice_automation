package Inheritance;

public class Hier_Apple extends Hier_Fruits {

	int quantity;
	String type;
	Hier_Apple(int quantity, String type, int price)
	{
		super(price);
	    this.quantity = quantity;
	    this.type = type;
		
	}
	
}
