package Pack1;

public class WhileLoop {
	
	/*Syntax for while loop :
	 
		while (boolean condition)
		{
			code to repeat;
		}
		
	*/
	public static void main(String[] args) {
		
		System.out.println("Before While Loop");
		
		int a = 5;
		while (a >= 1)
		{
			System.out.println("Loop Executed : " +a);
			a--;
		}
		
		System.out.println("After While Loop");
	}

}
