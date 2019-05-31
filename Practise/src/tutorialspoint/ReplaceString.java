package tutorialspoint;

public class ReplaceString {

	public static void main(String[] args) {
	String s="mahanth";
	System.out.println(s.replace('h', 'w'));
	System.out.println(s.replaceAll(s, "pachava"));
	System.out.println(s.replaceFirst("ma", "pac"));
	}

}
