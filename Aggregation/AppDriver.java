package Aggregation;

public class AppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application app = new Application("MyJava", 85);
		System.out.println(app.getAppName());
		System.out.println(app.getAppSize());
		
		app.appMethod(new Customer("Sushant", "Fruit@123")); 
		System.out.println(app.c.getUserName());
		System.out.println(app.c.getUserPassword());

	}

	}

