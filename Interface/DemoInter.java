package Interface;

public interface DemoInter {
	
	public static final int a = 10;
	abstract void add(int a, int b);
	
	public static void m1() {
		
	}
	void m2();
	
	
	default void sub()
	{
		System.out.println("Hi");
	}
	default void add()
	{
		
	}

	public static void main(String[] args) {
		System.out.println(a);
	}
}
