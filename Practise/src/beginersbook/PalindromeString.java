package beginersbook;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String input=s.nextLine();
	String reverse= "";
	
	int length=input.length();
	
	for (int i = length-1; i >=0; i--) {
		
		reverse=reverse+input.charAt(i);
	}
	if(input.equalsIgnoreCase(reverse))
	{
		System.out.println("the "+reverse+" is a palindrome");
	}
	else
	{
		System.out.println("the "+reverse+" is not a palindrome");
	}
	
	
	}

}
