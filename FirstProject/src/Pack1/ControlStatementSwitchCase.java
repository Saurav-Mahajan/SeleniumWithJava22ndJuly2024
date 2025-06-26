package Pack1;

public class ControlStatementSwitchCase {
	
	public void nonStaticMethod ()
	{
		int a = 3;
		
		switch (a)
		{

		case 0:
			System.out.println("Today is Sunday");
			break;
			
		case 1:
			System.out.println("Today is Monday");
			break;
			
		case 2:
			System.out.println("Today is Tuesday");
			break;
			
		case 3:
			System.out.println("Today is Wednesday");
			break;
			
		case 4:
			System.out.println("Today is Thursday");
			break;
			
		case 5:
			System.out.println("Today is Friday");
			break;
			
		case 6:
			System.out.println("Today is Saturday");
			break;
			
		}
		
		//Question - When and why a "default" keyword used in switch case?
		//Answer - When an incorrect expression value is provided and its used to execute default set of code and to break the switch case logic.
	
		int b = 10;
		
		switch (b)
		{

		case 0:
			System.out.println("Day One");
			break;
			
		case 1:
			System.out.println("Day Two");
			break;
			
		case 2:
			System.out.println("Day Three");
			break;
			
		case 3:
			System.out.println("Day Four");
			break;
			
		case 4:
			System.out.println("Day Five");
			break;
			
		case 5:
			System.out.println("Day Six");
			break;
			
		case 6:
			System.out.println("Day Seven");
			break;
			
		default:
			System.out.println("Above given expression is incorrect.");
			break;
		
		}
	
	}
	
	public static void main(String[] args) 
	{
		ControlStatementSwitchCase objectToCallNonStaticMethod = new ControlStatementSwitchCase();
		objectToCallNonStaticMethod.nonStaticMethod();
	}

}
