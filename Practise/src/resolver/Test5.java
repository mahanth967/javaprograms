package resolver;

public class Test5
{
	void call()
	{
		for (int j = 1; j<=100; j++) 
		{
			if(j%3==0 && j%5==0)
			{
				System.out.println("Resolver");
				
			}
		
		else
			if(j%3==0)
			{
				System.out.println("MThree");
			}
			else
				if(j%5==0)
				{
					System.out.println("MFive");
				}
				else
					if(j%3!=0 || j%5!=0)
					{
						System.out.println(j);
					}
			
		}

	}
	//}


/*
 * public class TestDemo {
 * 
 * public static void main(String[] args) { TestMain t=new TestMain(); t.call();
 */		

//}
}