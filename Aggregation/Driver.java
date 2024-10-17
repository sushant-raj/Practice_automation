package Aggregation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m = new Mobile("Iphone", "Black", 85000);
		System.out.println(m.getName());
		System.out.println(m.getColor());
		System.out.println(m.getPrice());
		
		m.addSimObj(new Sim("Airtel"));
		System.out.println(m.s.getName());
	}

}
