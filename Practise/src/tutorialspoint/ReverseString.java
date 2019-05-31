package tutorialspoint;

public class ReverseString {

	public static void main(String[] args) {
		String s="mahanth";
		char ch[]=s.toCharArray();
		System.out.println(ch);
		for (int i = ch.length-1; i>=0; i--) 
		{
			
			System.out.println(ch[i]);
		}
		
	}

}
