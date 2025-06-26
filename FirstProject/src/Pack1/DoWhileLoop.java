package Pack1;

public class DoWhileLoop {
	
	/*Syntax for while loop :
	 
	do
	{
		code to repeat;
	}
	while (boolean condition);
	
*/
	
	public static void main(String[] args) {
		
		System.out.println("Before Do While Loop");
		
		int a = 1;
		do
		{
			System.out.println("Do While Loop Executed : " +a);
			a++;
		}
		while (a <= 5);
		
		System.out.println("After Do While Loop");
	
	}

}
