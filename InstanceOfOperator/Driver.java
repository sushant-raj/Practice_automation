package InstanceOfOperator;

class A
{
	A()
	{
		super();
	}
}

class B extends A
{
	B()
	{
	  super();	
	}
}
class C extends A
{
	C()
	{
	  super();	
	}
}

class D extends C
{
	D()
	{
		super();
	}
}
class E extends D
{
	E()
	{
		super();
	}
}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new D();
		System.err.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof D);
		System.out.println(a instanceof E);
		System.out.println(a instanceof C);

	}

}
