package OOPS;

class Teacher
{
	String name;
	int ID;
	Teacher(String name, int ID)
	{
		this.name = name;
		this.ID = ID;
	}
	public void show() {
		System.out.println("Name of the teacher is :" + name);
		System.out.println("ID of the teacher is :" + ID);
	}
}

class Student extends Teacher
{
	String name;
	int stdID;
	Student(String name, int stdID)
	{
		super(name, stdID);
		this.name = name;
		this.stdID = stdID;
	}
	public void show()
	{
		System.out.println("Name of the Student is :" + name);
		System.out.println("ID of the Student is :" + stdID);
	}
}


public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student("Sushant", 2171);
		std.show();

		
	}

}
