package Pack1;

public class ControlStatementIfElse {
	
	public void nonStaticMethod ()
	{
		int a = 100;
		int b = 200;
		
		int c = 10;
		int d = 20;
		
		int e = 1000;
		int f = 2000;
		
		int g = 50;
		int h = 60;
		
		if (a > b)
		{
			System.out.println("Value of a is greater than b");
		}	
		
		else 
		{
			System.out.println("Value of a is smaller than b");
		}
		
		//Question - Are the curly braces mandatory for the if and else block?
		//Answer - If the logic is one liner for if-else block, curly braces are not required.
		
		if (c > d)
		//{
			System.out.println("Value of c is greater than d");
		//}
		
		else
		//{
			System.out.println("Value of c is smaller than d");
		//}
		
		//Question - When do curly braces become mandatory for if-else blocks? 
		//Answer - When logic for if-else block is more than one line.
		
		if (e > f)
		{
			System.out.println(e);
			System.out.println("Value of e is greater than f");
		}
		
		else
		{
			System.out.println(f);
			System.out.println("Value of e is smaller than f");	
		}
		
		//Question - In if-else block, is else block optional? 
		//Answer - Only if the boolean condition satisfy in if block.
		
		if (g < h)
		{
			System.out.println("Value of g is smaller than h");
		}
		
		//else 
		//{
			//System.out.println("Value of g is greater than h");
		//}
		
		//Question - Can we use multiple conditions in if-else block? 
		//Answer - Yes, refer to below example.
		
		if (a > b)
		{
			System.out.println("Given condition One is true");
		}
		else if (c > d)
		{
			System.out.println("Given condition Two is true");
		}
		else if (e > f)
		{
			System.out.println("Given condition Three is true");
		}
		else if (g < h)
		{
			System.out.println("Given condition Four is true");
		}
		else
		{
			System.out.println("All of the above given conditions are false");
		}
	}
	
	public static void main(String[] args) 
	{
		ControlStatementIfElse objectToCallNonStaticMethod = new ControlStatementIfElse();
		objectToCallNonStaticMethod.nonStaticMethod();
	}

}
