package tutorialspoint;

public class RemoveChar {

	public static void main(String[] args) {
		String s1="mahanthpachava";
		System.out.println(remove(s1,4 ));

	}
	
	public static String remove(String str, int pos)
	{
	return str.substring(0,pos)+str.substring(pos+1);	
	}

}
