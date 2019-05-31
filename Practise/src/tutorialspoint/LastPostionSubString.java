package tutorialspoint;

public class LastPostionSubString {

	public static void main(String[] args) {
		String s1="mahanthpachava";
		String s2=s1.substring(0, 8);
		System.out.println(s2);
		int lastInd=s2.lastIndexOf('p');
		System.out.println(lastInd);
		

	}

}
