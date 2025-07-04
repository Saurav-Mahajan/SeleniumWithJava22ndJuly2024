package Pack1;

public class ConstructorOne {
	
	/*Syntax of a Constructor - 
	
	ConstructorName ()
	{
	  Body or logic of a constructor;
	}
	
	*/
	
	public ConstructorOne ()
	{
		System.out.println("This is the user-defined constructor without argument/ parameter.");
	}
	
	public ConstructorOne(int a)
	{
		System.out.println("This is the user-defined constructor with argument/ parameter.");
	}
	
	public static void main(String[] args) 
	{
		ConstructorOne varOne = new ConstructorOne();
		
		ConstructorOne varTwo = new ConstructorOne(5);
	}

}
