package beginersbook;

public class RemoveDuplicates {

	public static void main(String[] args) {
       String sample="mahanth";
       boolean repeatedChar;
		
		char[] ch=sample.toCharArray();
		StringBuilder sb=new StringBuilder();
		System.out.println(ch.length);
		
		for (int i = 0; i <= ch.length; i++) {
			repeatedChar=false;
			for (int j1 = i+1; j1 < ch.length; j1++) {
			if(ch[i]==ch[j1])
			{
				repeatedChar =true;
				break;
			}	
		}
			if(!repeatedChar)
			{
				sb.append(i);
				System.out.println(ch[i]);
			}
			
		}

	}
	

	}


