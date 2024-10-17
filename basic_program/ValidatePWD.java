package basic_program;
import java.util.Scanner;

public class ValidatePWD {

	static int lc=0;
	static int uc = 0;
	static int dc = 0;
	public static void main(String[] args) {
		
		Scanner userInp = new Scanner(System.in);
		System.out.println("Please enter the password");
		String pwd = userInp.nextLine();
		
		if(pwd.length()>=6 && pwd.length()<=20)
		{
			for(int i = 0; i<=pwd.length()-1; i++)
			{
				char ch =  pwd.charAt(i);
				if(ch>='a' && ch<='z')
				{
					lc++;
				}
				else if(ch>='A' && ch<='Z')
				{
					uc++;
				}
				else if(ch>='0' && ch<='9')
				{
					dc++;
				}
				else
				{
					System.out.println("Password is not strong");
				}
			}
		}
		
		else 
		{
			System.out.println("Your password must be between 6 and 20 characters");
		}
		
		if(lc>0 && uc>0 && dc>0) 
		{
			System.out.println("Password is strong");
		}

	}
}
	



