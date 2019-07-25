package beginersbook;

public class ReverseNumber {

	public static void main(String[] args) {
		int i=6425;
		int rev=0;
		while(i>0)
		{
			int num=i%10;
			rev=rev*10+num;
			i=i/10;
		}
		
		System.out.println(rev);
	}

}
