package Aggregation;

public class Mobile {

	Sim s;
	public void addSimObj(Sim s)
	{
		this.s = s;
	}
	private String name;
	private String color;
	private double price;
	
	
	Mobile(String name, String color, double price)
	{
		setName(name);
		setColor(color);
		setPrice(price);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public double getPrice()
	{
		return price;
	}
}

