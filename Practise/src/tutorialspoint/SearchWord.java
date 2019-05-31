package tutorialspoint;

public class SearchWord {

	public static void main(String[] args) {
		String s="mahanth";
		int search=s.lastIndexOf("ha");
		
		if(search==-1)
		{
			System.out.println("ha not found");
		}
		else
		{
			System.out.println("ha"+search);
		}

	}

}
