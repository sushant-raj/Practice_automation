package OOPS;

class Parent
{
	public void getGold() {
		System.out.println("10 kg Gold");
	}
	
	public void house()
	{
		System.out.println("Vila");
	}
	public void marry()
	{
		System.out.println("Subhalakshmi");
	}
}

class Child extends Parent
{
	public void marry()
	{
		System.out.println("Bhagyalakshmi");
	}
}


public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ref = new Child();
		ref.marry();
		Parent refP = new Parent();
		refP.marry();
		
		Parent refpp = new Child();
		refpp.marry();
	}

}
