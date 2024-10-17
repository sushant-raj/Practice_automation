package Abstraction;

abstract class Demo {

	String name;
	String gender;
	int id;
	Demo(String name, String gender, int id)
	{
		this.name = name;
		this.gender = gender;
		this.id = id;
	}
	 abstract public void add();
}

class Test extends Demo
{

	Test(String name, String gender, int id) 
	{
		super(name, gender, id);
		
	}
	
	public void add()
	{
		System.out.println("Name of the emp is :"+ name);
		System.out.println("Gender :" + gender);
		System.out.println("ID :" + id);
	}
}

