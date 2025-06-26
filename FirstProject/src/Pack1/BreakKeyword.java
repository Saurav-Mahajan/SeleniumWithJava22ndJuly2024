package Pack1;

public class BreakKeyword {
	
public static void main(String[] args) 
	
	{
		System.out.println("Before For Loop");
		
		for (int a = 1; a <= 5; a++)
		{
			System.out.println("For Loop Executed : " +a);
			
			//Question - What if in the above given condition of For loop, I want to break the loop at a = 3;
			//Answer - That is do able through "break" keyword.
			
			if (a == 3) 
			{
				break;
			}
			
		}
	
		System.out.println("After For Loop");
	}

}
