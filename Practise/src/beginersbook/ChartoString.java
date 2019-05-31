package beginersbook;

public class ChartoString {

	public static void main(String[] args) {
	/*char[] b={'a','b','c','d','e','f'};
	String str=new String(b);
	System.out.println(str);*/
	
	//Using stringBuilder
	
	char[] c={'z','x','c','v','b','n','m'};
	StringBuilder db=new StringBuilder();
	
	for(char ch:c)
	{
		db.append(ch);
	}
	
	String s=db.toString();
	System.out.println(s);

}
}