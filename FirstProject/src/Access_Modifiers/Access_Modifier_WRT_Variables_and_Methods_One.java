package Access_Modifiers;

public class Access_Modifier_WRT_Variables_and_Methods_One {
	
	/*
	Notes - Access Modifier W.R.T. Variables and Methods -
	
	A. Public - When an variable or method is declared as "public" that simply means that the entity 
	is accessible throughout the project i.e. within different packages as well. 
	
	B. <default> - 
	1. When an variable or method has no access modifier type mentioned explicitly, 
	it is considered to be <default> type.  
	2. When an variable or method is declared as "<default>" that simply means that the 
	entity is accessible within the same package only.
	
	C. Private - When an variable or method is declared as "private" that simply means that the entity 
	is only accessible within the same class.
	
	D. Protected - 
	1. When an variable or method is declared as "protected" that simply means that the 
	entity is accessible within the same package only (same scope as <default>).
	2. However, if user wants to access such kind of variable or method, it can be accessed via
	inheritance i.e. by creating child class of the class in which protected entities are originally
	declared.
	3. Protected entities will only be accessible in child class via object of child class only. 
	
	*/
	
	public static int a = 100;
	static int b = 200;
	private static int c = 300;
	protected int d = 400;
	
	public static void MethodOne ()
	{
		System.out.println("This is a public method!");
	}
	
	static void MethodTwo ()
	{
		System.out.println("This is a default method.");
	}
	
	private static void MethodThree ()
	{
		System.out.println("This is a private method.");
	}
	
	protected void MethodFour ()
	{
		System.out.println("This is a protected method.");
	}
	
	public static void main(String[] args) 
	{
		
	}

}
