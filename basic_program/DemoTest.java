package basic_program;
import java.util.*;
public class DemoTest {

	public static void main(String[] args) {
		// input = "welcome to Itt" --> output ="emoclew to Itt"
		// input = "welcome to Itt" --> output ="emoclew ot ttI"
		String input= "welcome to ITT ";
		String [] arr = input.split("\\s");
		String word = arr[0];
		
		String words = " ";
		
		for(int j = 0; j<arr.length;j++)
		{
			words = arr[j];
			String reverseWord = " ";
			for(int i=words.length()-1; i>=0; i--)
			{
				reverseWord = reverseWord +  words.charAt(i);
				
			}
			System.out.print(reverseWord);
		}
		
	

	}

}
