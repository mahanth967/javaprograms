package stringprac;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	String s=read.nextLine();
	String reverse="";
	for (int i = s.length()-1; i>=0; i--) {
		
	reverse= reverse +s.charAt(i);
		
	}
	System.out.println("Reverse String is");
	System.out.println(reverse);
	}

}
