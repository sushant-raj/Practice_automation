package Relationship;

public class Mobile {

	Battery b = new Battery("Single Cell", 1.5);
	private String brand;
	private String model;
	private String color;
	private double price;
	
	Mobile(String brand, String model, String color, double price)
	{
		setBrand(brand);
		setModel(model);
		setColor(color);
		setPrice(price);
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getModel()
	{
		return model;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return price;
	}
	
	

}
