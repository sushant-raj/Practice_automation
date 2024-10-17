package NonPremitive_TypeCasting;

class A
{
    int a; 
    A(int a)
    {
    	this.a = a;
    }
}

class B extends A
{
	int b;
	B(int b, int a)
	{
		super(a);
		this.b = b;
	}
}

class C extends A
{
	int c;
	C(int c, int a)
	{
		super(a);
		this.c = c;
	}
}

class D extends C
{
	int d;
	D(int d, int c, int a)
	{
		super(c, a);
		this.d = d;
		
	}
}

public class Driver
{
   public static void main(String[] args) {
	
	   D ref = new D(2, 4, 6);
	   System.out.println(ref.a);
	   System.out.println(ref.c);
	   System.out.println(ref.d);
	   
}
}

