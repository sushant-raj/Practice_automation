package Inheritance;

class Person{
	String name;
}

class Student extends Person
{
	int stdId;
}
class CollegeStd extends Student
{
	String department;
}

public class UpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeStd clgStd = new CollegeStd();
		
		System.out.println(clgStd);
		System.out.println(clgStd.name);
		System.out.println(clgStd.stdId);
		System.out.println(clgStd.department);
		
		CollegeStd std = new CollegeStd();
		Person p1=std;
		System.out.println(std);
		System.out.println(std.name);
		System.out.println(std.stdId);
		System.out.println(p1 == std);
		//System.out.println(std.department);

	}

}
