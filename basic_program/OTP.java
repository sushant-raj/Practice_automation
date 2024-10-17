package basic_program;

public class OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    double d = Math.random();
		System.out.println(d);
		int OTP = (int)((999*d)+999);
		System.out.println("Your OTP is "+ OTP);
	}

}
