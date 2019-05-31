package stringprac;

public class StringBufferInsert {
	public static void main(String[] args) {
		StringBuffer bf=new StringBuffer("Mahanth");
		System.out.println(bf.insert(7, "pachava"));
		
		//String replace-----------------------------------------
		System.out.println(bf.replace(0, 7, "pachava"));
	}

}
