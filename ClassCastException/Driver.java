package ClassCastException;

class Cab
{
	
}
class Mini extends Cab
{
	int price = 10;
}

class Sedan extends Cab
{
	int price = 30;
}


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cab c = new Mini();
		System.out.println(c.toString());
		//System.out.println(c.price));
		
		Sedan s = (Sedan) c;
		System.out.println(s.price);
	}

}
