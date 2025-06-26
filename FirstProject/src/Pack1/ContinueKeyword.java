package Pack1;

public class ContinueKeyword {
	
public static void main(String[] args) 
	
	{
		System.out.println("Before For Loop");
		
		for (int a = 1; a <= 5; a++)
		{	
			//Question - What if in the above given condition of For loop, I want to skip the loop at a = 3;
			//Answer - That is do able through "continue" keyword.
			
			if (a == 3) 
			{
				continue;
			}
			
			System.out.println("For Loop Executed : " +a);
			
		}
	
		System.out.println("After For Loop");
	}

}
