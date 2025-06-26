package Pack1;

public class RegularMethod2 {
	
	
	public void nonStaticMethod ()
	{
		System.out.println("This is a non-static method of RegularMthod2 class");
	}
	
	public static void staticMethod ()
	{
		System.out.println("This is a static method of RegularMthod2 class");
	}
	
	
	public static void main(String[] args) 
	{
	// Question - How to call non-static method in main method in same class?
	// Answer - By creating object of the same class in which non-static method is created.
		
		RegularMethod2 objectForNonStaticMthod = new RegularMethod2(); // syntax of object creation i.e. className variableName = new className;
		objectForNonStaticMthod.nonStaticMethod();
		
	// Question - How to call static method in main method in same class?
	// Answer - By simply calling the methodName.
		
		staticMethod();
		
	}

}
