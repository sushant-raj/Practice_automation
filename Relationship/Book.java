package Relationship;

public class Book {

	private String Bname;
	private double cost;
	private String author;
	
	public String getBName()
	{
		
		return Bname;
	}
	
	public void setBname(String Bname)
	{
		this.Bname = Bname;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
}
