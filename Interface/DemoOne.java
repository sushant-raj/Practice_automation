package Interface;

public interface DemoOne {
	public static final int a = 10;
	public static void m1()
	{
		System.out.println("Static method allowed with Intetface");
	}
	public abstract void m2();
	public static void m3(int a , int b) {
		System.out.println(a+b);
	}
	
	//To access the private method need to declare helper method with default prefixed word
	default void sum(int a, int b)
	{
		m3(a,b);
	}
}

class Driver implements DemoOne
{
	public static void main(String[] args) {
		Driver d = new Driver();
		d.sum(23, 4);	
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}	

}
