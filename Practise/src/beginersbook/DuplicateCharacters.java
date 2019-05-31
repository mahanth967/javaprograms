package beginersbook;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String sample="mahanth";
		
		char[] ch=sample.toCharArray();
		System.out.println(ch.length);
		
		for (int i = 0; i <= ch.length; i++) {
		for (int j1 = i+1; j1 < ch.length; j1++) {
			if(ch[i]==ch[j1])
			{
				System.out.println(ch[j1]);
				break;
			}	
		}
		}

	}

}
