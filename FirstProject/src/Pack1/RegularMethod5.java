package Pack1;

public class RegularMethod5 {
	
	public void nonStaticMethod1 ()
	{
		System.out.println("This is the first non-static method of RegularMethod5 class");
	}
	
	public static void staticMethod1 ()
	{
		System.out.println("This is the first static method of RegularMethod5 class");
	}
	
	public void nonStaticMethod2 ()
	{
	// Question - How to call non-static method in another non-static method of same class? 
	// Answer - By creating object of the class in which non-static method is defined originally.
		RegularMethod5 variableToAccessNonStaticMethod1OfRegularMethod5Class = new RegularMethod5();
		variableToAccessNonStaticMethod1OfRegularMethod5Class.nonStaticMethod1();
	}
	
	public static void staticMethod2 ()
	{
	// Question - How to call static method in another static method of same class? 
	// Answer - By simply calling methodName();
		staticMethod1();
	}
	
	public static void main(String[] args) 
	{
		RegularMethod5 variableToAccessNonStaticMethod2OfRegularMethod5Class = new RegularMethod5();
		variableToAccessNonStaticMethod2OfRegularMethod5Class.nonStaticMethod2(); 
		
		staticMethod2();
	}

}
