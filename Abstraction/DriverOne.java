package Abstraction;

abstract class Employee
{
	private String name; 
	private int paymentPerHour;
	
	Employee(String name, int paymentPerHour)
	{
		setName(name);
		setPaymentPerHour(paymentPerHour);
		
	}
	abstract int calculateSalary();
	public String getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getPaymentPerHour()
	{
		return paymentPerHour;
		
	}
	public void setPaymentPerHour(int paymentPerHour)
	{
		this.paymentPerHour = paymentPerHour;
	}
}
class Contractor extends Employee
{
	private int workingHour;
	Contractor(String name, int paymentPerHour, int workingHour )
	{
		super(name, paymentPerHour);
		this.workingHour = workingHour;
	}
	int calculateSalary()
	{
		return getPaymentPerHour()* workingHour ;
	}
}
class FullTimeEmployee extends Employee
{
	
	FullTimeEmployee(String name, int paymentPerHour)
	{
		super(name, paymentPerHour);
	}
	int calculateSalary()
	{
		return getPaymentPerHour() * 8;
	}
	
}

public class DriverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee fte = new FullTimeEmployee("Peter", 50);
		Contractor cont = new Contractor("James", 25, 9);
		System.out.println(fte.getName());
		System.out.println(fte.getPaymentPerHour());
		System.out.println(cont.getName());
		System.out.println(cont.getPaymentPerHour());
	}

}



