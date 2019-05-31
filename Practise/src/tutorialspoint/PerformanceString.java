package tutorialspoint;

public class PerformanceString {

	public static void main(String[] args) {
    
	long startTime=System.currentTimeMillis();
	
	for (int i = 0; i < 5000; i++) {
		String s1="hello";
		String s2="Hello";
		}
	long endTime=System.currentTimeMillis();
	System.out.println(endTime-startTime);
	long startTime2=System.currentTimeMillis();
	for (int i = 0; i < 5000; i++) {
		String s3=new String("mahanth");
		String s5=new String("Pachava");
		
	}
	long endTime2=System.currentTimeMillis();
	System.out.println(endTime2-startTime2);

	}

}
